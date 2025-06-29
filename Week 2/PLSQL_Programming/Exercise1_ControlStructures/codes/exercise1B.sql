DELIMITER //

CREATE PROCEDURE changeVIPstatus()
BEGIN
  UPDATE bankdb.customers
  SET isVIP = true
  WHERE balance>10000;
END;
//

DELIMITER ;

call changeVIPstatus();

select * from customers;
