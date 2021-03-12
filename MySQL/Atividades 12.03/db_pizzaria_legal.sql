CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);

insert tb_categoria (descricao, ativo) values ("Salgada", true);
insert tb_categoria (descricao, ativo) values ("Doce", true);
insert tb_categoria (descricao, ativo) values ("Bebidas", true);

CREATE TABLE tb_pizza (
id bigint auto_increment,
nome varchar(255) not null,
preco decimal not null,
qtProduto int not null,
tamanho varchar(255) not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_pizza (nome, preco, qtProduto, tamanho, categoria_id) values ("Calabresa",45.00,50,"GG",1);
insert tb_pizza (nome, preco, qtProduto, tamanho, categoria_id) values ("Mussarela",40.00,50,"GG",1);
insert tb_pizza (nome, preco, qtProduto, tamanho, categoria_id) values ("Frango com Catupiry",45.00,50,"GG",1);
insert tb_pizza (nome, preco, qtProduto, tamanho, categoria_id) values ("Bacon",45.00,50,"GG",1);
insert tb_pizza (nome, preco, qtProduto, tamanho, categoria_id) values ("Chocolate",40.00,50,"GG",2);
insert tb_pizza (nome, preco, qtProduto, tamanho, categoria_id) values ("Chocolate Branco",40.00,50,"GG",2);
insert tb_pizza (nome, preco, qtProduto, tamanho, categoria_id) values ("Coca-Cola",5.00,50,"350ML",3);
insert tb_pizza (nome, preco, qtProduto, tamanho, categoria_id) values ("Guaraná Antarctica",5.00,50,"350ML",3);

select * from tb_pizza where preco > 45;
select * from tb_pizza where preco between 29 and 60;
select * from tb_pizza where nome like "%c%";
select * from tb_categoria inner join tb_pizza;
select nome from tb_pizza where categoria_id = 2;