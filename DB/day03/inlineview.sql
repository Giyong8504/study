SELECT * FROM 
(SELECT bookname, publisher
FROM book 
WHERE publisher IN ('대한미디어','굿스포츠','삼성당')) b
WHERE b.publisher = '대한미디어';