CREATE VIEW vw_Customer
	AS SELECT * FROM customer WHERE address LIKE '%대한민국%';