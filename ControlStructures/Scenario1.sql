DECLARE
    CURSOR c1 IS
        SELECT CustomerID, Age
        FROM Customers;

BEGIN
    FOR rec IN c1 LOOP
        IF rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Interest rates updated successfully.');
END;
/