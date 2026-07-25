CREATE OR REPLACE PROCEDURE TransferFunds (
   p_source_account IN NUMBER,
   p_target_account IN NUMBER,
   p_amount IN NUMBER
) IS
   v_balance NUMBER;
BEGIN
   -- Check source balance
   SELECT Balance INTO v_balance
   FROM Accounts
   WHERE AccountID = p_source_account;

   IF v_balance >= p_amount THEN

      UPDATE Accounts
      SET Balance = Balance - p_amount
      WHERE AccountID = p_source_account;
      UPDATE Accounts
      SET Balance = Balance + p_amount
      WHERE AccountID = p_target_account;
      COMMIT;
   ELSE
      RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
   END IF;
END;
/
