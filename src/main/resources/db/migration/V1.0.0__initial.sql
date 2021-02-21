CREATE TABLE `user` (
    id bigint not null auto_increment,
    name varchar(50) not null,
    gender varchar(20),
    birthday datetime,
    created_at datetime,
    updated_at datetime,
    primary key (id)
)
engine=InnoDB;
