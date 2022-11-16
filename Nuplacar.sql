create database NuPlacar;
use NuPlacar;

create table tb_usuario (
id int primary key auto_increment,
    nome varchar(200),
    senha varchar(200)
    );
    
    create table tb_adm (
id int primary key auto_increment,
    nome varchar(200),
    senha varchar(200)
    );
    
    insert into tb_adm (nome,senha) values ("admin", "admin");
    select*from tb_adm;
    
    insert into tb_usuario (nome,senha) values("user" "123");
    select*from tb_usuario;
   
    