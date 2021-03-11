CREATE DATABASE db_Exercicio1RH;

USE db_Exercicio1RH;

CREATE TABLE tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
funcao varchar(255) not null,
salario float not null,
primary key(id)
);

insert into tb_funcionarios (nome, idade, funcao, salario) values ("Jorge",28, "Consultor", 4000);
insert into tb_funcionarios (nome, idade, funcao, salario) values ("José",35, "Gestor", 5000);
insert into tb_funcionarios (nome, idade, funcao, salario) values ("Jonas",22, "Assistente", 1300);
insert into tb_funcionarios (nome, idade, funcao, salario) values ("Josefina",30, "Supervisora", 4500);
insert into tb_funcionarios (nome, idade, funcao, salario) values ("Joana",18, "Assistente", 1300);

select * from tb_funcionarios where salario > 2000;
select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set tb_funcionarios.salario = 6000 where id = 2;
