SELECT *, IFNULL(phone, '전화번호 없음') '전화번호'
FROM customer
