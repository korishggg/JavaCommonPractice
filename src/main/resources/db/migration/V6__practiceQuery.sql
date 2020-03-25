-- SELECT first_name, COUNT(*) as dublication_occurs
-- from students s1
-- where student_id! = (SELECT MAX(student_id) FROM  students s2 where s2.first_name = s1.first_name)
-- GROUP BY first_name;

-- SELECT first_name, COUNT(*) as dublication_occurs
-- FROM students s1
-- GROUP BY first_name;