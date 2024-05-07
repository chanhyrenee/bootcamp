create table Product (
    id int,
    name varchar(255),
    price decimal(10, 2),
    description text,
    created_at timestamp default current_timestamp
);

insert into product values ('Laptop', 999.99, 'High-performance laptop with SSD storage.', current_timestamp);
insert into product values ('Smartphone', 599.50, '4G smartphone with advanced camera features.', current_timestamp);
insert into product values ('Headphones', 79.99, 'Wireless headphones with noise-canceling technology.', current_timestamp);

select * from product order by name asc;
select * from product where price = (select max(price) from product);
select * from product where lower(name) like '%laptop%';
select avg(price) from product;
select * from product order by created_at asc limit 1;

select * from product