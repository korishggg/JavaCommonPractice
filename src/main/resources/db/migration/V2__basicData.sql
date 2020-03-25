INSERT INTO universities (university_id , university_name) values (1, 'NAU');
INSERT INTO universities (university_id , university_name) values (2, 'KNUKIM');

INSERT INTO departments (department_id , department_name, university_id) values (1, 'IT', 1);
INSERT INTO departments (department_id , department_name, university_id) values (2, 'Management', 1);
INSERT INTO departments (department_id , department_name, university_id) values (3, 'DANCE', 2);

INSERT INTO groups (group_id , group_name, department_id) values (1, 'KT3', 1);
INSERT INTO groups (group_id , group_name, department_id) values (2, 'KT2', 1);
INSERT INTO groups (group_id , group_name, department_id) values (3, 'KT1', 2);

INSERT INTO students (student_id, first_name, last_name, group_id) values (1,'Alex', 'Belford', 1);
INSERT INTO students (student_id,first_name, last_name, group_id) values (2,'Den', 'Bas', 1);
INSERT INTO students (student_id,first_name, last_name, group_id) values (3,'Otis', 'Shtorm', 1);
INSERT INTO students (student_id,first_name, last_name, group_id) values (4,'Alex', 'DIND', 2);


INSERT INTO subjects (subject_id, study_duration, subject_name) values (1, 3, 'MATH');
INSERT INTO subjects (subject_id, study_duration, subject_name) values (2, 2, 'English');
INSERT INTO subjects (subject_id, study_duration, subject_name) values (3, 2, 'Spanish');
INSERT INTO subjects (subject_id, study_duration, subject_name) values (4, 4, 'Polish');
INSERT INTO subjects (subject_id, study_duration, subject_name) values (5, 3, 'Ukrainian');
INSERT INTO subjects (subject_id, study_duration, subject_name) values (6, 1, 'Contemp');


INSERT INTO teachers (teacher_id, first_name, last_name,department_id) values (1, 'Daniel','Mus', 1);
INSERT INTO teachers (teacher_id, first_name, last_name,department_id) values (2, 'Alex','KOTS', 1);


INSERT INTO department_subject (department_subject_id ,department_id,subject_id) values (1, 1, 1);
INSERT INTO department_subject (department_subject_id, department_id,subject_id) values (2, 3, 3);
