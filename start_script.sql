CREATE DATABASE IF NOT EXISTS nuplacar;

USE nuplacar;

CREATE TABLE tb_usuario (
	idUsuario int primary key auto_increment,
	nome varchar(200),
	senha varchar(200),
	tipoUsuario varchar(200));

INSERT INTO tb_usuario (nome, senha, tipoUsuario) 
VALUES ('admin', 'admin', 'Administrador');

CREATE TABLE tb_times (
	idTime int primary key auto_increment,
	nome varchar(20),
	bandeira varchar(20),
	pontos int,
	jogos int,
	vitorias int,
	empates int,
	derrotas int,
	golPro int,
	golContra int,
	saldoGols int
);

CREATE TABLE tb_grupo (
	idGrupo char primary key,
	time1 varchar(20),
	time2 varchar(20),
	time3 varchar(20),
	time4 varchar(20));


INSERT INTO tb_times (nome) VALUES 
('Qatar'), ('Equador'), ('Senegal'), ('Holanda'), 
('Inglaterra'), ('Irã'), ('EUA'), ('País de Gales'),
('Argentina'), ('Arábia Saudita'), ('México'), ('Polônia'),
('França'), ('Dinamarca'), ('Tunísia'), ('Austrália'),
('Espanha'), ('Alemanha'), ('Japão'), ('Costa Rica'),
('Bélgica'), ('Canadá'), ('Marrocos'), ('Croácia'),
('Brasil'), ('Sérvia'), ('Suíça'), ('Camarões'),
('Portugal'), ('Gana'), ('Uruguai'), ('Coreia do Sul');

INSERT INTO tb_grupos (idGrupo, time1, time2, time3, time4) VALUES
('A', 'Qatar', 'Equador', 'Senegal', 'Holanda'),
('B', 'Inglaterra', 'Irã', 'EUA', 'País de Gales'),
('C', 'Argentina', 'Arábia Saudita', 'México', 'Polônia'),
('D', 'França', 'Dinamarca', 'Tunísia', 'Austrália'),
('E', 'Espanha', 'Alemanha', 'Japão', 'Costa Rica'),
('F', 'Bélgica', 'Canadá', 'Marrocos', 'Croácia'),
('G', 'Brasil', 'Sérvia', 'Suíça', 'Camarões'),
('H', 'Portugal', 'Gana', 'Uruguai', 'Coreia do Sul');