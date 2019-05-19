create table Phones
(
	id int auto_increment primary key ,
	Firm nvarchar(50) not null,
	Model nvarchar(50) not null,
	Quantity nvarchar(50) not null,
	Cost nvarchar(50) not null,
	Processor nvarchar(50) not null,
	RAM nvarchar(50) not null,
	Battery nvarchar(50) null
);