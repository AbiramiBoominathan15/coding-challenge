show databases;
create database student_database;
use student_database;
CREATE TABLE studentsdata (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT,
    grade CHAR(2)
);
INSERT INTO studentsdata(student_id, first_name, last_name, age, grade) VALUES
(1, 'John', 'Doe', 15, 'A'),
(2, 'Jane', 'Smith', 14, 'B'),
(3, 'Emily', 'Davis', 16, 'A'),
(4, 'Michael', 'Johnson', 15, 'C'),
(5, 'Sarah', 'Brown', 14, 'B');
select * from studentsdata;
SELECT first_name, last_name, grade FROM studentsdata;
SELECT * FROM studentsdata WHERE grade = 'A';
SELECT * FROM studentsdata WHERE age > 14;
UPDATE studentsdata
SET grade = 'A'
WHERE first_name = 'Sarah' AND last_name = 'Brown';
DELETE FROM studentsdata WHERE first_name = 'Michael' AND last_name = 'Johnson';
SELECT COUNT(*) AS total_students FROM studentsdata;
SELECT * FROM studentsdata ORDER BY age ASC;
SELECT grade, COUNT(*) AS first_name
FROM studentsdata
GROUP BY grade;


