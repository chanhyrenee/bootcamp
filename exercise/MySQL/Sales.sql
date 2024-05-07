create table Sales (
id int,
product_id int,
product_name varchar(255),
unit_price decimal(10,2),
quantity_sold int,
discount_amount decimal(10,2),
tax_rate decimal (5,2),
shipping_cost decimal (10,2),
handling_fee decimal (10,2)
);

alter table Sales add primary key (id);
alter table Sales drop primary key;

insert into Sales values (1, 1, 'Laptop', 999.99, 2, 0.00, 0.05, 10.50, 5.25);
insert into Sales values (2, 2, 'Smartphone', 599.50, 5, 25.75, 0.075, 5.75, 3.25);
insert into Sales values (3, 3, 'Headphones', 79.99, 10, 5.00, 0.05, 2.99, 1.50);

select * from Sales;