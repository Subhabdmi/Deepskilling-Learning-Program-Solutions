
DELIMITER //

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
-- updating balance in ll ccounts by incrementing 1%
  UPDATE bankdb.customers
  SET balance = balance * 1.01;
  
END//

DELIMITER ;

call ProcessMonthlyInterest();
select * from customers;