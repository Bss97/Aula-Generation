CREATE DATABASE db_pizzaria;
USE db_pizzaria;

CREATE TABLE tb_categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT,
	tipo VARCHAR(255) NOT NULL,
	quantidade INT NOT NULL,
    PRIMARY KEY (id_categoria)
    );
    
CREATE TABLE tb_pizza (
    id_pizza INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    massa VARCHAR (255) NOT NULL,
    preco FLOAT NOT NULL,
    tamanho VARCHAR (255),
    fk_categoria INT,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_categoria)
    );
    
    INSERT INTO tb_categoria (tipo,quantidade) VALUES
    ("Salgada", 50),
    ("Doce", 50),
    ("Borda recheada", 50),
    ("2-Sabores", 50),
    ("3-Sabores", 50);
    
    INSERT INTO tb_pizza (nome,massa,preco,tamanho,fk_categoria) VALUES
    ("Mussarela", "Napolitana", 29, "Média",1),
    ("Calabresa", "Siciliana", 29, "Média",1),
    ("Chocolate", "Napolitana", 46, "Pequena",2),
    ("Prestigio", "Napolitana", 46, "Pequena",2),
    ("Frango", "Napolitana", 50, "Grande",3),
    ("4 Queijos", "Nova-iorquina", 50, "Média",3),
    ("Camarao/4 Queijos", "Siciliana", 55, "Grande",4),
    ("Pepperoni/Frango/Calabresa", "Nova-iorquina", 60, "Grande",5);
    
    SELECT * FROM tb_categoria;
	SELECT * FROM tb_pizza;
	
    SELECT * FROM tb_pizza WHERE preco > 45;
	SELECT * FROM tb_pizza WHERE preco >= 29 AND preco <= 60;
	
    SELECT * FROM tb_pizza WHERE nome LIKE 'C%'; 
   
	SELECT  *  FROM tb_categoria
	INNER JOIN tb_pizza ON tb_pizza.fk_categoria = tb_categoria.id_categoria;
	
    SELECT  tb_pizza.nome, tb_pizza.massa, tb_pizza.preco, tb_categoria.tipo
	FROM tb_pizza
	INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_pizza.fk_categoria
    WHERE tb_categoria.tipo = "Doce";

    
    