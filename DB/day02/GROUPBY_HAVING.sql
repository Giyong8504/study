SELECT COUNT(*) "총 수량", custid
FROM orders
WHERE saleprice >= 8000
GROUP BY custid
HAVING COUNT(*) >=2;