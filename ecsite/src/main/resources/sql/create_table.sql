create table if not exists user(
id int(11) not null primary key auto_increment,
user_name varchar(25) not null,
password varchar(25) not null,
full_name varchar(50) not null,
is_admin tinyint(1) not null default 0
);

show tables;

create table if not exists goods(
id int(11) not null primary key auto_increment,
goods_name varchar(255) not null,
price int(11) default 0,
updated_at timestamp not null default now() on update now()
);

show tables;

create table if not exists purchase(
id int(11) not null primary key auto_increment,
user_id int(11) not null,
goods_id int(11) not null,
goods_name varchar(255) not null,
item_count int(11) default 0,
total int(11) default 0,
created_at datetime not null
);

show tables;