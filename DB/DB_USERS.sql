CREATE DATABASE DB_USERS;

USE DB_USERS;

CREATE TABLE ADM( 
	ID_ADM_US INT PRIMARY KEY AUTO_INCREMENT,
    AD_NOME VARCHAR (50) NOT NULL,
    AD_SOBRENOME VARCHAR (50)NOT NULL,
    AD_SENHA VARCHAR (50) NOT NULL,
    AD_EMAIL VARCHAR (50) UNIQUE,
    AD_NICK VARCHAR (50) UNIQUE,
    AD_DATANASC DATE NOT NULL
);

INSERT INTO ADM VALUES (NULL, 'Bruno', 'Francisco', 'admim', 'bruno@banco.com', 'admim', '2005-01-01');

CREATE TABLE USUARIO(
	ID_USUARIO INT PRIMARY KEY AUTO_INCREMENT,
    US_NOME VARCHAR (50) NOT NULL,
    US_SOBRENOME VARCHAR (50),
    US_SENHA VARCHAR (50) NOT NULL,
    US_EMAIL VARCHAR (50) UNIQUE NOT NULL,
    US_NICK VARCHAR (50) UNIQUE,
    US_DATANASC DATE,
    US_GENERO ENUM('Masc', 'Fem', 'Outros'),
	US_CRIACAO DATETIME
);

INSERT INTO USUARIO VALUES (NULL, 'Sergio', 'Beltrao','usuario', 'sergio@banco.com', 'usuario', '2005-01-01', 'Masc', now() );

CREATE TABLE TELEFONE( 
	TE_ID_TELEFONE INT PRIMARY KEY AUTO_INCREMENT,
    TE_TIPO ENUM ('CEL', 'RES', 'COM'),
    TE_NUMERO VARCHAR (12) UNIQUE
);

INSERT INTO TELEFONE VALUES (NULL, 'CEL', '12345678' );

CREATE TABLE ENDERECO(
	ID_ENDERECO INT PRIMARY KEY AUTO_INCREMENT,
    EN_RUA VARCHAR (50),
    EN_NUMERO INT,
    EN_BAIRRO VARCHAR (50),
    EN_CEP VARCHAR (50),
    EN_CIDADE VARCHAR (50),
    EN_ESTADO VARCHAR (50)
);

INSERT INTO ENDERECO VALUES (NULL, 'Lourdes', 13, 'Dolores', '987321654', 'Mooca', 'Sao Paulo');