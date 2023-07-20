SELECT
	c.custid,
	c.name,
    o.orderid,
    o.bookid,
    o.saleprice
FROM Customer AS c, Orders AS o
WHERE c.custid = o.custid
ORDER BY c.name;