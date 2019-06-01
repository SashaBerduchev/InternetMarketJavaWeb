create table GraphicsCard
(
	id int auto_increment primary key ,
	Name varchar(50) not null,
	Cores varchar(50) not null,
	Herts varchar(50) not null,
	VRAM varchar(50) null,
	Voltage varchar(50) not null
);