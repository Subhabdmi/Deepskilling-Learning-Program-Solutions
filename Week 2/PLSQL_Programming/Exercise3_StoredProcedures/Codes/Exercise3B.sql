create table employees(
employee_id INT PRIMARY KEY,
department_id INT,
salary INT);

insert into employees values

(2100, 101, 500000),
(2101, 101, 60000),
(2102, 102, 55000),
(2103, 103, 70000),
(2104, 101, 65000);

select * from employees;

DELIMITER //

CREATE PROCEDURE UpdateEmployeeBonus (
    IN dept_id INT,
    IN bonus_percent DECIMAL(5,2)
)
BEGIN
    -- Increase salary by bonus_percent for employees in the given department
    UPDATE EMPLOYEES
    SET salary = salary + (salary * bonus_percent / 100)
    WHERE department_id = dept_id;
END//

DELIMITER ;

call UpdateEmployeeBonus(101,20);

select * from employees;
