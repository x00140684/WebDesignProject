create table cars(
    id varchar2(255) not null,
    name varchar2(255),
    make varchar2(255),
    model varchar2(255),
    description varchar2(255)

);
create table parts(
    id varchar2(255) not null,
    name varchar2(255),
    description varchar2(255)
);
create table user (
  email                         varchar(255) not null,
  password                      varchar(255),
  constraint pk_user primary key (email)
);

drop table if exists cars;

drop table if exists parts;

drop table if exists user;