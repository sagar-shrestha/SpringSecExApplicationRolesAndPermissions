create table if not exists users
(
    id                         integer not null
        primary key,
    entry_date                 timestamp(6),
    modified_date              timestamp(6),
    entry_user_id              integer,
    modified_user_id           integer,
    is_active                  boolean,
    code                       varchar(255)
        constraint users_unq_code
            unique,
    email                      varchar(255),
    mobile_number              varchar(255),
    password                   varchar(255),
    password_updated_date_time timestamp(6),
    require_password_change    boolean,
    username                   varchar(255)
        constraint users_unq_username
            unique
);

insert into users (id, entry_date, modified_date, entry_user_id, modified_user_id, is_active, code, email,
                   mobile_number, password, password_updated_date_time, require_password_change, username)
values (1,now(),now(),1,1,true,'SAG-001',
        'sagar@gmail.com','9867731059','$2a$12$RY6Wqq085wAON1P2GoXRwOwlVkJ6fyCgr4iljRc0TG.QS/HcDqha.',
        now(),false,'sagar');