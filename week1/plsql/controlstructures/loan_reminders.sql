DECLARE
   CURSOR loan_cur IS
      SELECT LoanID, CustomerID, DueDate
      FROM Loans
      WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
   FOR rec IN loan_cur LOOP
      DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || rec.LoanID ||
                           ' for Customer ' || rec.CustomerID ||
                           ' is due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
   END LOOP;
END;
/
