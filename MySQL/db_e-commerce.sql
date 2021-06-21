CREATE DATABASE db_ecommerce;

USE db_ecommerce;
CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR (20) NOT NULL,
	descricao VARCHAR (50) NOT NULL,
    codigo INT NOT NULL,
    marca VARCHAR (20) NOT NULL,
	preco FLOAT NOT NULL,
    PRIMARY KEY (id)
 );
	INSERT INTO tb_produtos(nome,descricao,codigo,marca,preco) VALUES 
    ("Ps4","console",4,"Sony", 2500),
	("Ps2","console",2,"Sony", 350),
	("Ps3","console",3,"Sony", 850),
	("Xboxone","console",5,"Microsoft", 2300),
	("Xbox360","console",6,"Microsoft", 450),
    ("Ps1","console",1,"Sony", 250),
	("Xbox","console",7,"Microsoft", 250),
	("Ps5","console",8,"Sony", 5000);
  
    SELECT * FROM tb_produtos WHERE preco > 500;
    SELECT * FROM tb_produtos WHERE preco < 500;
    UPDATE tb_produtos SET preco = 2400 WHERE id = 1;
    
  