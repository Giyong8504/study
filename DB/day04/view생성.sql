CREATE VIEW vw_orders
AS SELECT o.*, c.name, b.bookname FROM orders o, customer c, book b
WHERE o.custid = c.custid AND o.bookid = b.bookid;