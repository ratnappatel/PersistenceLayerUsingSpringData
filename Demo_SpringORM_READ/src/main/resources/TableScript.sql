drop database if exists customer_db;
create database customer_db;
use  customer_db;

create table customer(
   customer_id int,
   email_id varchar(50),
   name varchar(20),
   date_of_birth date,
   customer_type varchar(10),
   constraint ps_customer_id_pk primary key (customer_id)
);

insert into customer (customer_id, email_id, name, date_of_birth, customer_type) values (1, 'martin@infy.com', 'martin', sysdate()- interval 9136 day, 'GOLD');
commit;
select * from customer;