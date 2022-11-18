CREATE DATABASE IF NOT EXISTS nuplacar;

USE nuplacar;

CREATE TABLE usuario (
	id_usuario int primary key auto_increment,
	isAdm bit,
	nome varchar(200),
	senha varchar(20)
);

CREATE TABLE time (
	nome varchar(30) primary key,
	bandeira varchar(30) not null,
	grupo char
);

CREATE TABLE classificacao (
	nome varchar(30) primary key,
	pontos int,
	jogos int,
	vitorias int,
	empates int,
	derrotas int,
	golPro int,
	golContra int
);

CREATE TABLE partida (
	id_partida int primary key auto_increment,
	time1 varchar(30) not null,
	time2 varchar(30) not null,
	gols_time1 int,
	gols_time2 int
);

INSERT INTO usuario (nome, senha, isAdm) VALUES ('admin', 'admin', 1);