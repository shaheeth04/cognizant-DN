CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
   p_department IN VARCHAR2,
   p_bonus_pct IN NUMBER
) IS
BEGIN
   FOR rec IN (SELECT EmpID, Salary FROM Employees WHERE Department = p_department) LOOP
      UPDATE Employees
      SET Salary = Salary + (Salary * p_bonus_pct / 100)
      WHERE EmpID = rec.EmpID;
   END LOOP;
   COMMIT;
END;
/
