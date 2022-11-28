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

CREATE TABLE tb_partida (
    id_partida int primary key auto_increment,
    time1 varchar(30) not null,
    time2 varchar(30) not null,
    gols_time1 int,
    gols_time2 int
);

-- adicionar o caminho até a pasta resources
SET @var1 = 'C:\Users\luana\OneDrive\Documentos\GitHub\Nuplacar\src\main\resources';

INSERT INTO tb_times (nome, bandeira) VALUES 
('Qatar','@var1\qatar.png'),
('Equador','@var1\equador.png'),
('Senegal','@var1\senegal.png'),
('Holanda','@var1\holanda.png'),
('Inglaterra','@var1\inglaterra.png'),
('Ira','@var1\ira.png'),
('Eua','@var1\eua.png'),
('Pais De Gales','@var1\pais-de-gales.png'),
('Argentina','@var1\argentina.png'),
('Arabia Saudita','@var1\arabia-saudita.png'),
('Mexico','@var1\mexico.png'),
('Polonia','@var1\polonia.png'),
('Franca','@var1\franca.png'),
('Dinamarca','@var1\dinamarca.png'),
('Tunísia','@var1\tunísia.png'),
('Austrália','@var1\austrália.png'),
('Espanha','@var1\espanha.png'),
('Alemanha','@var1\alemanha.png'),
('Japao','@var1\japao.png'),
('Costa Rica','@var1\costa-rica.png'),
('Belgica','@var1\belgica.png'),
('Canada','@var1\canada.png'),
('Marrocos','@var1\marrocos.png'),
('Croacia','@var1\croacia.png'),
('Brasil','@var1\brasil.png'),
('Servia','@var1\servia.png'),
('Suica','@var1\suica.png'),
('Camaroes','@var1\camaroes.png'),
('Portugal','@var1\portugal.png'),
('Gana','@var1\gana.png'),
('Uruguai','@var1\uruguai.png'),
('Coreia Do Sul','@var1\coreia-do-sul.png');

INSERT INTO tb_grupos (idGrupo, time1, time2, time3, time4, idConjuntoGrupos) VALUES
('A', 'Qatar', 'Equador', 'Senegal', 'Holanda', 'Copa do Mundo 2022'),
('B', 'Inglaterra', 'Irã', 'EUA', 'País de Gales', 'Copa do Mundo 2022'),
('C', 'Argentina', 'Arábia Saudita', 'México', 'Polônia', 'Copa do Mundo 2022'),
('D', 'França', 'Dinamarca', 'Tunísia', 'Austrália', 'Copa do Mundo 2022'),
('E', 'Espanha', 'Alemanha', 'Japão', 'Costa Rica', 'Copa do Mundo 2022'),
('F', 'Bélgica', 'Canadá', 'Marrocos', 'Croácia', 'Copa do Mundo 2022'),
('G', 'Brasil', 'Sérvia', 'Suíça', 'Camarões','Copa do Mundo 2022'),
('H', 'Portugal', 'Gana', 'Uruguai', 'Coreia do Sul','Copa do Mundo 2022');

SELECT * FROM tb_times
