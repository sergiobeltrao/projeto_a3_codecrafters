CREATE DATABASE DB_BiblioTech;

USE DB_BiblioTech;

CREATE TABLE USUARIO (
  USE_ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  USE_NICK VARCHAR(30) NOT NULL UNIQUE,  /* USAR NO LOGIN */
  USE_SENHA VARCHAR(100) NOT NULL,   /* USAR NO LOGIN */
  USE_TYPE ENUM('ADMIN', 'BIBLIOTECARIO', 'CLIENTE') NOT NULL,   /* USAR NO LOGIN */
  USE_NOME VARCHAR(50) NOT NULL,
  USE_SOBRENOME VARCHAR(50),
  USE_DATANASC DATE,
  USE_EMAIL VARCHAR(100) NOT NULL UNIQUE,
  USE_CRIA DATETIME NOT NULL,
  USE_SEXO ENUM ('MASC', 'FEM', 'OUTRO')
);
DROP TABLE LIVRO_USUARIO;
INSERT INTO USUARIO VALUES
  ( NULL, 'admin', 'admin', 'ADMIN', 'Bruno', 'Fernades', '1990-02-28', 'bruno@email.com',  NOW(), 'MAS'),
  ( NULL, 'sergio', 'sergio', 'BIBLIOTECARIO', 'Sérgio', 'Beltrão', '1990-02-28', 'sergio@email.com',  NOW(), 'MAS'),
  ( NULL, 'john', 'john', 'CLIENTE', 'Jonatas', 'Sousa', '1990-02-28', 'john@email.com',  NOW(), 'MAS');
  
SELECT * FROM USUARIO;

CREATE TABLE ENDERECO (
  END_ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  END_RUA VARCHAR(150),
  END_NUM INT,
  END_COMP VARCHAR(50),
  END_BAIRRO VARCHAR(100),
  END_CIDADE VARCHAR(100),
  END_UF VARCHAR (2),
  END_PAIS VARCHAR(50),
  END_CEP VARCHAR(10)
);

INSERT INTO ENDERECO VALUES (NULL, 'Dolores', 13, 'APTO', 'Mooca', 'Sao Paulo', 'SP', 'BRASIL', '987321654');
  
CREATE TABLE TELEFONE (
	TEL_ID INT PRIMARY KEY AUTO_INCREMENT,
	TEL_TIPO ENUM ('RESIDENCIAL', 'COMERCIAL', 'CELULAR')NOT NULL,
	TEL_TELEFONE VARCHAR (12) NOT NULL	
);
  
INSERT INTO TELEFONE VALUES (NULL, 'CELULAR', '11 994545058'), 
(NULL, 'CELULAR', '11 975630714'), (NULL, 'CELULAR', '11 91340-9833');

CREATE TABLE FUNCIONARIO (
  FUN_ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  FUN_ENTRADA DATE NOT NULL,
  FUN_SAIDA DATE,
  FUN_SALARIO DECIMAL(10, 2) NOT NULL
);

INSERT INTO FUNCIONARIO  VALUES
  (NULL, '2022-01-15', NULL, 8000.00),
  (NULL, '2021-03-10', NULL, 6000.00);
  
CREATE TABLE LIVRO ( 
	ID_LIVRO INT PRIMARY KEY AUTO_INCREMENT,
	LIV_NOME_LIVRO VARCHAR (100) NOT NULL,
	LIV_ISBN VARCHAR (100)NOT NULL,
	LIV_ANO_PUBLICACAO DATE, 
	LIV_PAGINA INT NOT NULL,
	LIV_QUANTIDADE INT,
	LIV_CATEGORIA VARCHAR (50)NOT NULL,
	LIV_PRECO DECIMAL (6,2)
);

INSERT INTO LIVRO VALUES(
	NULL, 'O Segredo das Estrelas', '978-1234567890', '1980-10-12', 320, 10,  'Ficção Científica', '180.20');

CREATE TABLE AUTOR(
	ID_AUTOR INT PRIMARY KEY AUTO_INCREMENT,
	AUT_NOME_AUTOR VARCHAR (100)NOT NULL,
	AUT_DATA_NASC DATE,
	AUT_NACIONALIDADE VARCHAR (50) NOT NULL,
	AUT_BIBLIOGRAFIA TEXT,
	AUT_SEXO ENUM ('MASC', 'FEM')
);
	
INSERT INTO AUTOR ( AUT_NOME_AUTOR, AUT_DATA_NASC, AUT_NACIONALIDADE, AUT_SEXO) 
 VALUES ('Laura Bens', '1997-01-27', 'Brazil', 'FEM' );

CREATE TABLE EDITORA (
	ID_EDITORA  INT PRIMARY KEY AUTO_INCREMENT,
	EDT_NOME_EDITORA  VARCHAR (50) NOT NULL
	);
	
INSERT INTO EDITORA (EDT_NOME_EDITORA) VALUES ('Galáxia Editora');


/* APARTIR DESTA LINHA ESTAO AS TABELAS COM AS CHAVES ESTRANGEIRAS*/

/*TABELA DE CHAVES ESTRANGEIRAS DE LIVRO */
CREATE TABLE LIVRO_CHAVE (
	LIVRO_USER INT NOT NULL,
    LIVRO_AUTOR INT NOT NULL,
    LIVRO_EDITORA INT NOT NULL,
    PRIMARY KEY LIVRO_CHAVE (LIVRO_USER, LIVRO_AUTOR, LIVRO_EDITORA)
);

ALTER TABLE LIVRO_CHAVE ADD CONSTRAINT foreign key (LIVRO_USER) REFERENCES USUARIO (USE_ID);
ALTER TABLE LIVRO_CHAVE ADD CONSTRAINT foreign key (LIVRO_AUTOR) REFERENCES AUTOR (ID_AUTOR);
ALTER TABLE LIVRO_CHAVE ADD CONSTRAINT foreign key (LIVRO_EDITORA) REFERENCES EDITORA (ID_EDITORA);

/*TABELA DE CHAVES ESTRANGEIRAS DE DADOS EDITORA */
CREATE TABLE EDITORA_CHAVE ( 
	EDITORA_AUTOR INT NOT NULL,
    EDITORA_TELEFONE INT NOT NULL,
    EDITORA_ENDERECO INT NOT NULL,
    PRIMARY KEY EDITORA_CHAVE (EDITORA_AUTOR, EDITORA_TELEFONE, EDITORA_ENDERECO)
);

ALTER TABLE EDITORA_CHAVE ADD CONSTRAINT foreign key (EDITORA_AUTOR) REFERENCES AUTOR (ID_AUTOR);
ALTER TABLE EDITORA_CHAVE ADD CONSTRAINT foreign key (EDITORA_TELEFONE) REFERENCES TELEFONE (TEL_ID);
ALTER TABLE EDITORA_CHAVE ADD CONSTRAINT foreign key (EDITORA_ENDERECO) REFERENCES ENDERECO (END_ID);

/*TABELA DE CHAVES ESTRANGEIRAS TELEFONE */
CREATE TABLE TELEFONE_CHAVE ( 
	TELEFONE_AUTOR INT NOT NULL,
    TELEFONE_USER INT NOT NULL,
    PRIMARY KEY TELEFONE_CHAVE (TELEFONE_AUTOR, TELEFONE_USER)
);

ALTER TABLE TELEFONE_CHAVE ADD CONSTRAINT foreign key (TELEFONE_AUTOR) REFERENCES AUTOR (ID_AUTOR);
ALTER TABLE TELEFONE_CHAVE ADD CONSTRAINT foreign key (TELEFONE_USER) REFERENCES USUARIO (USE_ID);

/*TABELA DE CHAVES ESTRANGEIRAS TELEFONE */
CREATE TABLE ENDERECO_CHAVE ( 
	ENDERECO_AUTOR INT NOT NULL,
    ENDERECO_USER INT NOT NULL,
    PRIMARY KEY TELEFONE_CHAVE (ENDERECO_USER, ENDERECO_AUTOR)
);

ALTER TABLE ENDERECO_CHAVE ADD CONSTRAINT foreign key (ENDERECO_AUTOR) REFERENCES AUTOR (ID_AUTOR);
ALTER TABLE ENDERECO_CHAVE ADD CONSTRAINT foreign key (ENDERECO_USER) REFERENCES USUARIO (USE_ID);

/* SHOW COLUMNS FROM ENDERECO;
-- Na tabela USUARIO, a coluna USE_SENHA é uma senha e deve ser armazenada de forma segura, o uso de uma senha de texto simples não é recomendado.

*/