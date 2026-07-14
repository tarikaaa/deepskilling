DECLARE
    CURSOR c1 IS
        SELECT CustomerID, Balance
        FROM Customers;

BEGIN
    FOR rec IN c1 LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');
END;
/