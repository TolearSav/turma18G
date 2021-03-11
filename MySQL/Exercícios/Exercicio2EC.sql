CREATE DATABASE db_e_commerce;

USE db_e_commerce;

CREATE TABLE tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
categoria varchar(255) not null,
marca varchar(255) not null,
preco decimal(10,2),
primary key(id)
);

insert into tb_produtos (nome, categoria, marca, preco) values ("Tênis","Calçados","Adidas", 349.90);
insert into tb_produtos (nome, categoria, marca, preco) values ("Camiseta","Vestuário","Adidas", 149.90);
insert into tb_produtos (nome, categoria, marca, preco) values ("Bermuda","Vestuário","Nike", 129.99);
insert into tb_produtos (nome, categoria, marca, preco) values ("Boné","Acessórios","Puma", 79.00);
insert into tb_produtos (nome, categoria, marca, preco) values ("Tênis","Calçados","Nike", 549.90);
insert into tb_produtos (nome, categoria, marca, preco) values ("Tênis","Calçados","Puma", 249.90);
insert into tb_produtos (nome, categoria, marca, preco) values ("Calça","Vestuário","Puma", 109.99);
insert into tb_produtos (nome, categoria, marca, preco) values ("Camiseta","Vestuário","Nike", 199.99);

select * from tb_produtos where preco > 500;
select * from tb_produtos where preco < 500;

update tb_produtos set tb_produtos.nome = "Conjunto" where id = 8;
update tb_produtos set tb_produtos.preco = 598.99 where id = 8;
