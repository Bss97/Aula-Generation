create database db_rh;

use db_rh;
create table tb_funcionaries(
	id bigint auto_increment,
    nome varchar(20) not null,
    cpf varchar(1) not null,
    idade int(1),
    cargo varchar(20),
	salario double,
    primary key (id)
 );
	insert into tb_funcionaries(nome,cpf,idade,cargo,salario) values ("Bryan","12",24,"Devs", 4500);
	insert into tb_funcionaries(nome,cpf,idade,cargo,salario) values ("Luffy","13",20,"Analista", 3500);
	insert into tb_funcionaries(nome,cpf,idade,cargo,salario) values ("Zoro","14",21,"Designer", 1800);
	insert into tb_funcionaries(nome,cpf,idade,cargo,salario) values ("Robin","15",26,"Secretaria", 1300);
	insert into tb_funcionaries(nome,cpf,idade,cargo,salario) values ("Ana","16",21,"Gerente", 7000);

	select * from tb_funcionaries where salario > 2000;
	select * from tb_funcionaries where salario < 2000;
	update tb_funcionaries set nome = "Bryan San" where id = 1 
  


