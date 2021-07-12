CREATE DATABASE db_escola;

USE db_escola;
CREATE TABLE tb_estudantes (
id BIGINT AUTO_INCREMENT,
nome VARCHAR ( 20 ) NOT NULL,
idade INT NOT NULL,
nota FLOAT NOT NULL,
matricula INT NOT NULL,
PRIMARY KEY (id)
);
INSERT INTO tb_estudantes (nome,idade,nota,matricula) 
VALUES
("Naruto",12,3.5,1),
("Sasuke",12,8.5,2),
("Sakura",12,9,3),
("Hinata",13,9.8,4),
("Rock Lee",4,5),
("Ino",12,8,6),
("Choji",12,4.5,7),
("Shikamaru",12,10,8);

SELECT * FROM tb_estudantes WHERE nota > 7;
SELECT * FROM tb_estudantes WHERE nota < 7;
UPDATE tb_estudantes SET nota = 4 WHERE id = 1;






