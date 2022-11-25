create database nuplacar;
use nuplacar;

create table tb_time(idTime int primary key auto_increment,nome varchar(200),bandeira varchar(200),idGrupo int);

create table tb_usuario(idUsuario int primary key auto_increment,nome varchar(200),senha varchar(200),tipoUsuario varchar(200));

create table tb_grupo(idGrupo int primary key auto_increment,nome varchar(200));

insert into tb_grupo(nome) values ('Grupo A'), ('Grupo B'),('Grupo C'),('Grupo D'),('Grupo E'),('Grupo F'),('Grupo G'),('Grupo H');
    
SELECT * FROM tb_time;
SELECT * FROM tb_usuario;
SELECT * FROM tb_grupo;

insert into tb_time(nome, idGrupo) values 
	('Qatar', 1),
    ('Equador', 1), 
    ('Senegal', 1),
    ('Holanda', 1), 
    ('Inglaterra', 2), 
    ('Irã', 2),
    ('EUA', 2),
    ('País de Gales', 2), 
    ('Argentina', 3), 
    ('Arábia Saudita', 3),
    ('México', 3),
    ('Polônia', 3),
    ('França', 4),
    ('Dinamarca', 4),
    ('Tunísia', 4),
    ('Austrália', 4),
    ('Espanha', 5),
    ('Alemanha', 5),
    ('Japão', 5),
    ('Costa Rica', 5),
    ('Bélgica', 6),
    ('Canadá', 6),
    ('Marrocos', 6),
    ('Croácia', 6),
    ('Brasil', 7),
    ('Sérvia', 7),
    ('Suíça', 7),
    ('Camarões', 7),
    ('Portugal', 8),
    ('Gana', 8),
    ('Uruguai', 8),
    ('Coreia do Sul', 8);
