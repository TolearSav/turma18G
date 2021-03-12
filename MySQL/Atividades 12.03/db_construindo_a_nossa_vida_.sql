CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria (
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);

insert tb_categoria (descricao, ativo) values ("Materiais de Consrução", true);
insert tb_categoria (descricao, ativo) values ("Ferramentas", true);
insert tb_categoria (descricao, ativo) values ("Iluminação", true);
insert tb_categoria (descricao, ativo) values ("Materiais elétricos", true);

CREATE TABLE tb_produto (
id bigint auto_increment,
nome varchar(255) not null,
tamanho varchar(255) not null,
preco decimal(10,2) not null,
qtProduto int not null,
marca varchar(255) not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produto (nome, tamanho, preco, qtProduto, marca, categoria_id) values ("Cimento","50kg",27.90,50,"Votoran",1);
insert tb_produto (nome, tamanho, preco, qtProduto, marca, categoria_id) values ("Argamassa","20kg",23.90,50,"Axton",1);
insert tb_produto (nome, tamanho, preco, qtProduto, marca, categoria_id) values ("Tinta Acrílica Fosco Branco","18L",259.90,50,"Coral",1);
insert tb_produto (nome, tamanho, preco, qtProduto, marca, categoria_id) values ("Ferradeira","127v",209.90,50,"Philco",2);
insert tb_produto (nome, tamanho, preco, qtProduto, marca, categoria_id) values ("Parafusadeira 1/4","3,6V",69.90,50,"Dexter",2);
insert tb_produto (nome, tamanho, preco, qtProduto, marca, categoria_id) values ("Abajur de mesa","32x23cm",99.90,50,"Studio Casa Center",3);
insert tb_produto (nome, tamanho, preco, qtProduto, marca, categoria_id) values ("Fita Isolante","5M",3.59,50,"DNI",4);

select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%c%";
select * from tb_categoria inner join tb_produto;
select nome from tb_produto where categoria_id = 1;