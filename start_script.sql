-- drop database nuplacar;


CREATE DATABASE IF NOT EXISTS nuplacar;

USE nuplacar;

CREATE TABLE tb_usuario (
	idUsuario int primary key auto_increment,
	nome varchar(200),
	senha varchar(200),
	tipoUsuario varchar(200));

INSERT INTO tb_usuario (nome, senha, tipoUsuario) 
VALUES 	('admin', 'admin', 'Administrador'),
		('usuario', 'usuario', 'Comum');

CREATE TABLE tb_times (
	idTime int primary key auto_increment,
	nome varchar(20),
	bandeira BLOB,
	pontos int,
	jogos int,
	vitorias int,
	empates int,
	derrotas int,
	golPro int,
	golContra int,
	saldoGols int
);


CREATE TABLE tb_grupos (
    idGrupo char (1),
    time1 varchar(20),
    time2 varchar(20),
    time3 varchar(20),
    time4 varchar(20),
    idConjuntoGrupos varchar(20)
    );

CREATE TABLE tb_partidas (
    idPartida int primary key auto_increment,
    idCampeonato varchar(20),
    time1 varchar(20) not null,
    time2 varchar(20) not null,
    gols_time1 int,
    gols_time2 int
);

CREATE TABLE tb_campeonatos (
	idCampeonato int primary key auto_increment,
	idConjuntoGrupos varchar(20),
	finalizado bool
);

SELECT * FROM tb_campeonatos;

-- adicionar o caminho até a pasta resources
SET @var1 = 'C:\Users\luana\OneDrive\Documentos\GitHub\Nuplacar\src\main\resources';

INSERT INTO tb_times (nome, bandeira) VALUES 
('Qatar','@var1\Qatar.png'),
('Equador','@var1\Equador.png'),
('Senegal','@var1\Senegal.png'),
('Holanda','@var1\Holanda.png'),
('Inglaterra','@var1\Inglaterra.png'),
('Ira','@var1\Ira.png'),
('Eua','@var1\Eua.png'),
('Pais De Gales','@var1\Pais de Gales.png'),
('Argentina','@var1\Argentina.png'),
('Arabia Saudita','@var1\Arabia Saudita.png'),
('Mexico','@var1\Mexico.png'),
('Polonia','@var1\Polonia.png'),
('Franca','@var1\Franca.png'),
('Dinamarca','@var1\Dinamarca.png'),
('Tunisia','@var1\Tunisia.png'),
('Australia','@var1\Australia.png'),
('Espanha','@var1\Espanha.png'),
('Alemanha','@var1\Alemanha.png'),
('Japao','@var1\Japao.png'),
('Costa Rica','@var1\Costa Rica.png'),
('Belgica','@var1\Belgica.png'),
('Canada','@var1\Canada.png'),
('Marrocos','@var1\Marrocos.png'),
('Croacia','@var1\Croacia.png'),
('Brasil','@var1\Brasil.png'),
('Servia','@var1\Servia.png'),
('Suica','@var1\Suica.png'),
('Camaroes','@var1\Camaroes.png'),
('Portugal','@var1\Portugal.png'),
('Gana','@var1\Gana.png'),
('Uruguai','@var1\Uruguai.png'),
('Coreia do Sul','@var1\Coreia do Sul.png'),
('Russia','@var1\Russia.png'), 
('Egito','@var1\Egito.png'), 
('Peru','@var1\Peru.png'), 
('Islandia','@var1\Islandia.png'), 
('Nigeria','@var1\Nigeria.png'), 
('Suecia','@var1\Suecia.png'), 
('Panama','@var1\Panama.png'), 
('Colombia','@var1\Colombia.png');

INSERT INTO tb_grupos (idGrupo, time1, time2, time3, time4, idConjuntoGrupos) VALUES
('A', 'Qatar', 'Equador', 'Senegal', 'Holanda', 'Copa do Mundo 2022'),
('B', 'Inglaterra', 'Ira', 'EUA', 'Pais de Gales', 'Copa do Mundo 2022'),
('C', 'Argentina', 'Arabia Saudita', 'Mexico', 'Polonia', 'Copa do Mundo 2022'),
('D', 'Franca', 'Dinamarca', 'Tunisia', 'Australia', 'Copa do Mundo 2022'),
('E', 'Espanha', 'Alemanha', 'Japao', 'Costa Rica', 'Copa do Mundo 2022'),
('F', 'Belgica', 'Canada', 'Marrocos', 'Croacia', 'Copa do Mundo 2022'),
('G', 'Brasil', 'Servia', 'Suica', 'Camaroes','Copa do Mundo 2022'),
('H', 'Portugal', 'Gana', 'Uruguai', 'Coreia do Sul','Copa do Mundo 2022');

INSERT INTO tb_grupos (idGrupo, time1, time2, time3, time4, idConjuntoGrupos) VALUES
('A', 'Russia', 'Arabia Saudita', 'Egito', 'Uruguai', 'Copa do Mundo 2018'),
('B', 'Portugal', 'Espanha', 'Marrocos', 'Ira', 'Copa do Mundo 2018'),
('C', 'Franca', 'Australia', 'Peru', 'Dinamarca', 'Copa do Mundo 2018'),
('D', 'Argentina', 'Islandia', 'Croacia', 'Nigeria', 'Copa do Mundo 2018'),
('E', 'Brasil', 'Suiça', 'Costa Rica', 'Servia', 'Copa do Mundo 2018'),
('F', 'Alemanha', 'Mexico', 'Suecia', 'Coreia do Sul', 'Copa do Mundo 2018'),
('G', 'Belgica', 'Panama', 'Tunisia', 'Inglaterra','Copa do Mundo 2018'),
('H', 'Polonia', 'Senegal', 'Colombia', 'Japao','Copa do Mundo 2018');
