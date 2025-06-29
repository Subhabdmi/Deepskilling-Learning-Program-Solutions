create table customers(
customer_id INT PRIMARY KEY,
customer_name Varchar(100),
age int ,
balance decimal(10,2),
isVIP BOOLEAN default false,
interest_rate decimal(5,2));

insert into customers values
(101,"hari mishra",46,120000.80,false,5.2),
(102,'Bob Smith', 45, 8000.00, FALSE, 8.0),
(103,'Catherine Lee', 72, 12000.00, FALSE, 7.0),
(104,'David Kumar', 30, 500000.00, FALSE, 9.5),
(105,'Emma Patel', 68, 20000.00, FALSE, 6.5);

DELIMITER //

CREATE PROCEDURE ApplyInterestDiscount()
BEGIN
  UPDATE bankdb.customers
  SET interest_rate = interest_rate - 1
  WHERE age > 60;
END;
//

DELIMITER ;

-- To run it:
CALL ApplyInterestDiscount();

select * from customers;







