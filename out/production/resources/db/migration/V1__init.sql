drop table if exists h_user;

create table h_user (
    id                                    BIGINT not null,
    uuid                                  UUID not null,
    full_name                             varchar(30) not null,
    phone_number                          varchar(30),
    email                                 varchar(50) not null,
    password                              varchar(50) not null,
    description                           varchar(255),
    created_date                          TIMESTAMP not null,
    updated_date                          TIMESTAMP,
    primary key(id)
);

create SEQUENCE h_user
  start 1
  increment 1;

INSERT INTO h_user(id, uuid, full_name, phone_number, email, password,
                                     description, created_date)
VALUES (1, '531e4cdd-bb78-4769-a0c7-cb948a9f1238', 'Jason Yoo', '491786453910', 'jasonyoo@gmail.com', '1234', 'test user', now());
