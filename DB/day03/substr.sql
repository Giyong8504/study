SELECT COUNT(*) 인원수, SUBSTR(name, 1, 1) 성씨
FROM customer
GROUP BY SUBSTR(name, 1, 1);