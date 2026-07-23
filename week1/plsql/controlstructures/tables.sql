CREATE TABLE Customers (
    CustomerID     NUMBER PRIMARY KEY,
    Name           VARCHAR2(50),
    Age            NUMBER,
    Balance        NUMBER(12,2),
    LoanInterestRate NUMBER(5,2),
    IsVIP          CHAR(1) DEFAULT 'F' 
);

CREATE TABLE Loans (
    LoanID      NUMBER PRIMARY KEY,
    CustomerID  NUMBER REFERENCES Customers(CustomerID),
    DueDate     DATE
);

INSERT INTO Customers VALUES (1, 'Ravi', 65, 12000, 5.5, 'F');
INSERT INTO Customers VALUES (2, 'Meena', 45, 8000, 6.0, 'F');
INSERT INTO Customers VALUES (3, 'Arjun', 70, 15000, 7.0, 'F');

INSERT INTO Loans VALUES (101, 1, SYSDATE + 10);  
INSERT INTO Loans VALUES (102, 2, SYSDATE + 40);  
INSERT INTO Loans VALUES (103, 3, SYSDATE + 20); 

COMMIT;
