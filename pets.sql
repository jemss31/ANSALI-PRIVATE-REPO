
CREATE DATABASE ansalijamessven_2b;
USE ansalijamessven_2b;

create table Pets(
pet_id int auto_increment primary key,
pet_name varchar (255) not null,
pet_type varchar (100),
pet_breed varchar (100),
owner_name varchar (255) not null,
owner_phone varchar (15)
);

create table Groomers (
groomer_id int auto_increment primary key,
groomer_name varchar (255) not null,
experience_years int not null
);

create table appointment (
appointment_id int auto_increment primary key,
pet_id int,
groomer_id int,
appointment_date date not null,
service_type varchar (100),
total_cost int,
FOREIGN KEY (pet_id) REFERENCES Pets(pet_id),
FOREIGN KEY (groomer_id) REFERENCES Groomers(groomer_id)
);

insert into Pets ( pet_name, pet_type, pet_breed, owner_name, owner_phone)
values
('Jaypee', 'Crocodile', 'alligator', 'jems', '09392265335');

 insert into Groomers (groomer_name, experience_years)
values
('Vivian', 69);


select * from Pets;
select * from Groomers;
SHOW TABLES;

select * from appointment;
insert into appointment ( pet_id, groomer_id, appointment_date, service_type, total_case)
values ( 111,1, '2024-09-19', 'Full Groom', 100);



