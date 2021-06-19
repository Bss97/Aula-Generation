create database db_ecommerce;

use db_ecommerce;
create table tb_produtos(
	id bigint auto_increment,
    nome varchar(20) not null,
	descricao varchar(50) not null,
    codigo int(1),
    marca varchar(20),
	preco double,
    primary key (id)
 );
	insert into tb_produtos(nome,descricao,codigo,marca,preco) values ("Ps4","console",4,"Sony", 2500);
	insert into tb_produtos(nome,descricao,codigo,marca,preco) values ("Ps2","console",2,"Sony", 350);
	insert into tb_produtos(nome,descricao,codigo,marca,preco) values ("Ps3","console",3,"Sony", 850);
	insert into tb_produtos(nome,descricao,codigo,marca,preco) values ("Xboxone","console",5,"Microsoft", 2300);
	insert into tb_produtos(nome,descricao,codigo,marca,preco) values ("Xbox360","console",6,"Microsoft", 450);
    insert into tb_produtos(nome,descricao,codigo,marca,preco) values ("Ps1","console",1,"Sony", 250);
	insert into tb_produtos(nome,descricao,codigo,marca,preco) values ("Xbox","console",7,"Microsoft", 250);
	insert into tb_produtos(nome,descricao,codigo,marca,preco) values ("Ps5","console",8,"Sony", 5000);
    
    select * from tb_produtos where preco > 500;
    select * from tb_produtos where preco < 500;
    update tb_produtos set preco = 2400 where id = 1 