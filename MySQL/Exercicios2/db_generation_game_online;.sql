CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classes (
	id_classe INT NOT NULL AUTO_INCREMENT ,
	tipo VARCHAR(20) NOT NULL,
	Sexo VARCHAR(20) NOT NULL,
	PRIMARY KEY(id_classe)
);
CREATE TABLE tb_personagens (
	id_personagem INT NOT NULL AUTO_INCREMENT,
    nome_personagem VARCHAR(20) NOT NULL,
    poder_de_ataque INT NOT NULL,
    poder_de_defesa INT NOT NULL,
    cor VARCHAR(20) NOT NULL,
    cidade VARCHAR(20) NOT NULL,
    fk_classe INT,
    PRIMARY KEY(id_personagem),
    FOREIGN KEY(fk_classe) REFERENCES tb_classes(id_classe)
    );
   INSERT INTO tb_classes(tipo,sexo) VALUES
    ("Mago", "Masculino"),
    ("Maga", "Feminino"),
    ("Arqueiro", "Masculino"),
    ("Guerreira", "Feminino"),
    ("Curandeiro", "Masculino");
    
    INSERT INTO tb_personagens(nome_personagem, poder_de_ataque, poder_de_defesa, cor, cidade) VALUES
    ("Sid", 2100,1000,"branco","Sao Paulo"),
    ("Zeca", 2500,1500,"preto","Santos"),
    ("Dick", 2300,2000,"azul","Guarulhos"),
    ("Shrek", 3000,2500,"verde","Campinas"),
    ("Fiona", 2500,2000,"cinza","Sumare"),
    ("Chiquinha", 1500,1000,"vermelho","Acapulco"),
    ("Moana", 2100,1000,"roxo","Guaruja"),
    ("Dora", 2100,1000,"rosa","Diadema");
    
    SELECT * FROM tb_classes;
    SELECT * FROM tb_personagens;
    
    SELECT nome_personagem, poder_de_ataque FROM tb_personagens WHERE poder_de_ataque > 2000; 
   
   SELECT nome_personagem, poder_de_defesa FROM tb_personagens WHERE poder_de_defesa >= 1000 
	AND poder_de_defesa <= 2000;
   
   SELECT * FROM tb_personagens WHERE nome_personagem LIKE 'C%';
    
    SELECT * FROM tb_classes
	INNER JOIN tb_personagens ON tb_personagens.id_personagem = tb_classes.id_classe;
    
    SELECT * FROM tb_classes Where tipo LIKE "%Arqueiro%";
    
    
    
    
    
    
