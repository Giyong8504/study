SELECT orderdate, DATEDIFF(SYSDATE(), orderdate) 경과일수
FROM Orders;