create table if not exists user(
id int(11) not null primary key auto_increment,
user_name varchar(25) not null,
password varchar(25) not null,
full_name varchar(50) not null
);
show tables;
desc user;