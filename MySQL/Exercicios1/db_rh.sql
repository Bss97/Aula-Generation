CREATE DATABASE db_rh;

USE db_rh;
CREATE TABLE tb_funcionarios (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(20) NOT NULL,
    cpf VARCHAR(12) NOT NULL,
    idade INT NOT NULL,
    cargo VARCHAR(20) NOT NULL,
	salario DOUBLE NOT NULL,
   PRIMARY KEY (id)
   );
 INSERT INTO tb_funcionarios (nome,cpf,idade,cargo,salario) VALUES
	("Bryan","123456789-10",24,"Devs", 4500),
	("Luffy","234567891-01",20,"Analista", 3500),
	("Zoro","345678910-12",21,"Designer", 1800),
	("Robin","456789101-23",26,"Secretaria", 1300),
    ("Ana","567891012-34",21,"Gerente", 7000);

SELECT * FROM tb_funcionarios WHERE salario > 2000;
SELECT * FROM tb_funcionarios WHERE salario < 2000;
UPDATE tb_funcionarios SET salario = 4550 WHERE id = 1;


