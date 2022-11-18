create database nuplacar;
use nuplacar;

create table tb_time(
idTime int primary key auto_increment,
nome varchar(200),
bandeira varchar(200)
);

create table tb_usuario(
idUsuario int primary key auto_increment,
nome varchar(200),
senha varchar(200)
)

SELECT * FROM tb_usuario;