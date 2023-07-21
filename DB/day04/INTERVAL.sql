SELECT orderid, orderdate, ADDDATE(orderdate, INTERVAL 10 DAY) 확정일자
FROM orders;