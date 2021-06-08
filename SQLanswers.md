# farmiq-webuitest

Answers:
1.
SELECT firstName 
FROM Farmiquser 
WHERE firstName= ‘Demo%’;

2.
SELECT name 
FROM BusinessUnit 
ORDER BY name ASC;

3
SELECT id 
FROM BusinessUnit 
WHERE organisationId IN ( SELECT organisationID 
FROM Farmiquser 
WHERE fullName = ‘Demo User’);
