Alter table customers
add Due_date date;

DELIMITER //

CREATE PROCEDURE SendLoanReminders()
BEGIN
  DECLARE done INT DEFAULT FALSE;
  DECLARE v_name VARCHAR(100);
  DECLARE v_due DATE;
  DECLARE v_id INT;

  -- Declare cursor for customers with due loans in next 30 days
  DECLARE due_cursor CURSOR FOR
    SELECT CUSTOMER_ID, CUSTOMER_NAME, DUE_DATE
    FROM CUSTOMERS
    WHERE DUE_DATE BETWEEN CURDATE() AND CURDATE() + INTERVAL 30 DAY;

  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

  OPEN due_cursor;

  reminder_loop: LOOP
    FETCH due_cursor INTO v_id, v_name, v_due;
    IF done THEN
      LEAVE reminder_loop;
    END IF;

    -- Print reminder message (MySQL doesn’t support console output, so use SELECT)
    SELECT CONCAT('Reminder: Loan for customer ', v_name,
                  ' (ID: ', v_id, ') is due on ',
                  DATE_FORMAT(v_due, '%d-%b-%Y')) AS ReminderMessage;
  END LOOP;

  CLOSE due_cursor;
END;
//

DELIMITER ;
call SendLoanReminders();