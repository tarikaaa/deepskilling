DECLARE
    CURSOR c1 IS
        SELECT c.Name, l.LoanID, l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR rec IN c1 LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || rec.Name ||
            ', Loan ID: ' || rec.LoanID ||
            ' is due on ' || TO_CHAR(rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/