SELECT * FROM customer
WHERE EXISTS (SELECT * FROM orders WHERE custid=5);