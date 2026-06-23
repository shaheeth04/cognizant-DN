
CREATE TABLE SavingsAccounts (
    AccountID   NUMBER PRIMARY KEY,
    CustomerID  NUMBER,
    Balance     NUMBER(12,2)
);

CREATE TABLE Employees (
    EmpID       NUMBER PRIMARY KEY,
    Name        VARCHAR2(50),
    Department  VARCHAR2(50),
    Salary      NUMBER(12,2)
);

CREATE TABLE Accounts (
    AccountID   NUMBER PRIMARY KEY,
    CustomerID  NUMBER,
    Balance     NUMBER(12,2)
);

INSERT INTO SavingsAccounts VALUES (1, 101, 5000);
INSERT INTO SavingsAccounts VALUES (2, 102, 10000);

INSERT INTO Employees VALUES (1, 'Ravi', 'IT', 40000);
INSERT INTO Employees VALUES (2, 'Meena', 'HR', 35000);
INSERT INTO Employees VALUES (3, 'Arjun', 'IT', 45000);

INSERT INTO Accounts VALUES (1, 101, 8000);
INSERT INTO Accounts VALUES (2, 102, 6000);

COMMIT;
