create database mensajeria;
use mensajeria;

create table telefonos(
 id int primary key auto_increment,
 telefono varchar(15)
);

insert into telefonos (telefono) values ("8711578038");

drop database mensajeria;
