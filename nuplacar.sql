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
senha varchar(200),
tipoUsuario varchar(200)
);

SELECT * FROM tb_time;
SELECT * FROM tb_usuario;

-- adicionar o acesso do administrador principal, 
-- ele irá adicionar os demais, caso tenha, na tela "Cadastro Usuário"
insert into tb_time(nome, senha) values 
();

-- times oficiais da copa 2022
insert into tb_time(nome) values 
	('Qatar'), 
    ('Equador'),
    ('Senegal'),
    ('Holanda'),
    ('Inglaterra'),
    ('Irã'),
    ('EUA'),
    ('País de Gales'),
    ('Argentina'),
    ('Arábia Saudita'),
    ('México'),
    ('Polônia'),
    ('França'),
    ('Dinamarca'),
    ('Tunísia'),
    ('Austrália'),
    ('Espanha'),
    ('Alemanha'),
    ('Japão'),
    ('Costa Rica'),
    ('Bélgica'),
    ('Canadá'),
    ('Marrocos'),
    ('Croácia'),
    ('Brasil'),
    ('Sérvia'),
    ('Suíça'),
    ('Camarões'),
    ('Portugal'),
    ('Gana'),
    ('Uruguai'),
    ('Coreia do Sul');