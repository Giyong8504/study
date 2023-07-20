SELECT ROUND(AVG(saleprice), -2) AS "평균 주문금액", custid
FROM orders
GROUP BY custid;