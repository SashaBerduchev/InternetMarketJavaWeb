create table Books
(
	id int auto_increment primary key ,
	Name varchar(50) not null,
	Autor varchar(50) null,
	Shop varchar(50) null,
	Cost varchar(50) null
)ENGINE=MyISAM DEFAULT CHARSET=utf8;