insert into user
(user_name, password, full_name)
values ('taro', 'taropw', 'Taro Yamada');
insert into user
(user_name, password, full_name)
values('jiro', 'jiropw', 'Jiro Tanaka');
insert into user
(user_name, password, full_name)
values('ichiko', 'ichikopw', 'Ichiko Hayashi');
insert into user
(user_name, password, full_name, is_admin)
values('admin', 'admin', '管理者 太郎', 1);

select * from user;

insert into goods
(goods_name, price)
values('Tシャツ', 1000);
insert into goods
(goods_name, price)
values('ジャケット', 10000);
insert into goods
(goods_name, price)
values('スニーカー', 5000);

select * from goods;