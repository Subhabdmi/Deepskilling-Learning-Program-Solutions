CREATE TABLE ACCOUNTS (
    ACCOUNT_ID INT PRIMARY KEY auto_increment,
    ACCOUNT_HOLDER VARCHAR(100),
    BALANCE DECIMAL(10,2)
);

INSERT INTO ACCOUNTS (ACCOUNT_HOLDER, BALANCE)
VALUES
('David', 6000.20),
('john', 30000.00);

select * from accounts;

DELIMITER //

CREATE PROCEDURE TransferFunds (
    IN from_account_id INT,
    IN to_account_id INT,
    IN transfer_amount DECIMAL(10,2)
)
BEGIN
    DECLARE from_balance DECIMAL(10,2);

 
    START TRANSACTION;

    -- Check balance of source account
    SELECT BALANCE INTO from_balance
    FROM ACCOUNTS
    WHERE ACCOUNT_ID = from_account_id
    FOR UPDATE;

    -- Check if balance is sufficient
    IF from_balance >= transfer_amount THEN
        -- Deduct from source account
        UPDATE ACCOUNTS
        SET BALANCE = BALANCE - transfer_amount
        WHERE ACCOUNT_ID = from_account_id;

        -- Add to destination account
        UPDATE ACCOUNTS
        SET BALANCE = BALANCE + transfer_amount
        WHERE ACCOUNT_ID = to_account_id;

        COMMIT;
    ELSE
        -- Insufficient balance
        ROLLBACK;
        SIGNAL SQLSTATE '45000' 
        SET MESSAGE_TEXT = 'Insufficient balance in source account.';
    END IF;
END//

DELIMITER ;

call TransferFunds(1,2,1000);
select * from accounts;



