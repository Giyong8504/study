SELECT 
	SUBSTR(createdAt, 1, 7),
	SUM(saleprice) 합계,
	AVG(saleprice) 평균,
    COUNT(*) 주문건수,
	MAX(saleprice) 최대값,
	MIN(saleprice) 최소값
FROM orders;


