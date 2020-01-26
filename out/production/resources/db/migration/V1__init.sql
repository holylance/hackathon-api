drop table if exists h_user;

create table h_user (
    id                                    SERIAL primary key,
    uuid                                  UUID not null,
    full_name                             varchar(30) not null,
    phone_number                          varchar(30),
    email                                 varchar(50) not null,
    password                              varchar(50) not null,
    description                           varchar(255),
    created_date                          TIMESTAMP not null,
    updated_date                          TIMESTAMP
);

INSERT INTO h_user(uuid, full_name, phone_number, email, password,
                                     description, created_date)
VALUES ('531e4cdd-bb78-4769-a0c7-cb948a9f1238', 'Jason Yoo', '491786453910', 'jasonyoo@gmail.com', '1234', 'test user', now());
