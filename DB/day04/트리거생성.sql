delimiter //
CREATE TRIGGER AftgerUpdateBook
	AFTER UPDATE ON Book FOR EACH ROW
BEGIN
	INSERT INTO Book_log
		VALUES (old.bookid, old.bookname, old.publisher, old.price);
END;
//
delimiter ;