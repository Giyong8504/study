SELECT 
	LPAD(custid, 5, '0'),
	RPAD(SUBSTR(name, 1, 1), CHAR_LENGTH(name), '*') name,
	address,phone
FROM customer;