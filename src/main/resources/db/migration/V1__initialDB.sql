create table universities(
    university_id bigint not null ,
    university_name varchar(255),
    PRIMARY KEY (university_id)
);

create table departments(
    department_id   bigint not null,
    department_name varchar(255),
    university_id   bigint,
    PRIMARY KEY (department_id),
    FOREIGN KEY (university_id) references universities(university_id)
);

create table groups(
    group_id      bigint not null,
    group_name    varchar(255),
    department_id bigint,
    PRIMARY KEY (group_id),
    FOREIGN KEY (department_id) references departments(department_id)
);


create table students(
    student_id bigint not null,
    first_name varchar(255),
    last_name  varchar(255),
    group_id   bigint,
    PRIMARY KEY (student_id),
    FOREIGN KEY (group_id) references groups(group_id)
);


create table subjects(
    subject_id     bigint  not null ,
    study_duration integer not null,
    subject_name   varchar(255),

    PRIMARY KEY (subject_id)
);

create table teachers(
    teacher_id    bigint not null,
    first_name    varchar(255),
    last_name     varchar(255),
    department_id bigint,

    PRIMARY KEY (teacher_id),
    FOREIGN KEY (department_id) references departments(department_id)
);

--
--
--

create table department_subject(
    department_subject_id bigint not null,
    department_id bigint not null,
    subject_id    bigint not null,

    PRIMARY KEY (department_subject_id),
    FOREIGN KEY (department_id) references departments(department_id),
    FOREIGN KEY (subject_id) references subjects(subject_id)
);