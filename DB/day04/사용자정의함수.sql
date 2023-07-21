delimiter //
CREATE FUNCTION UPPER2(Word VARCHAR(40)) RETURNS VARCHAR(40)
BEGIN
	DECLARE Converted VARCHAR(40);
    
    SET Converted = UPPER(Word);
	RETURN Converted;

END;
//
delimiter ;