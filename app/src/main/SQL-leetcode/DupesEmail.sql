SELECT DISTINCT P1.Email FROM Person P1,Person P2

WHERE P1.id != P2.id AND P1.Email=P2.Email
// WHERE P1.id <> P2.id AND P1.Email=P2.Email

/*
Table: Person

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| email       | varchar |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table contains an email. The emails will not contain uppercase letters.


Write a solution to report all the duplicate emails. Note that it's guaranteed that the email field is not NULL.
*/