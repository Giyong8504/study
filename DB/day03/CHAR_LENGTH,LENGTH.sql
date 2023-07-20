SELECT bookname, CHAR_LENGTH(bookname) 문자수, LENGTH(bookname) 바이트수
FROM book 
WHERE publisher ="굿스포츠";