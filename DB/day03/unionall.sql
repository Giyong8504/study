(SELECT * FROM book WHERE price >= 10000
UNION ALL
SELECT * FROM book WHERE price <= 15000)
ORDER BY price
