ALTER TABLE teachers ADD salary DOUBLE PRECISION DEFAULT 1000.00;
ALTER TABLE teachers ADD is_trainee BOOLEAN DEFAULT FALSE;


-- SELECT first_name, last_name
-- FROM teachers
--          FULL OUTER JOIN departments d on teachers.department_id = d.department_id
-- WHERE d.department_id = 1;

