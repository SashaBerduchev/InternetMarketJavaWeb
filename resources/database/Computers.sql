create table Computers
(
	id int auto_increment,
	firm nvarchar not null,
	model nvarchar not null,
	quantity nvarchar not null,
	cost nvarchar not null,
	processor nvarchar not null,
	ram nvarchar not null,
	vram nvarchar not null,
	grafics nvarchar not null,
	constraint Computers_pk
		primary key (id)
);
