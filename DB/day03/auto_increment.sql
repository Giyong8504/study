CREATE TABLE newbook2 (
	bookid INT AUTO_INCREMENT,
    bookname VARCHAR(20) NOT NULL,
    publisher VARCHAR(20) NOT NULL,
    price INT,
    regdt DATETIME DEFAULT NOW(),
    PRIMARY KEY(bookid)
);