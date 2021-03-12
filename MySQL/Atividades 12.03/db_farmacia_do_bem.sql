CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);

insert tb_categoria (descricao, ativo) values ("Medicamentos", true);
insert tb_categoria (descricao, ativo) values ("Saúde", true);
insert tb_categoria (descricao, ativo) values ("Beleza", true);
insert tb_categoria (descricao, ativo) values ("Vitaminas e Suplementos", true);

CREATE TABLE tb_produto (
id bigint auto_increment,
nome varchar(255) not null,
preco decimal(10,2) not null,
qtEmbalagem varchar(255) not null,
qtProduto int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produto (nome, preco, qtEmbalagem, qtProduto, categoria_id) values ("Cataflan",39.90,"400mg 20 comprimidos",50,1);
insert tb_produto (nome, preco, qtEmbalagem, qtProduto, categoria_id) values ("Ibuprofeno",42.90,"400mg 20 comprimidos",50,1);
insert tb_produto (nome, preco, qtEmbalagem, qtProduto, categoria_id) values ("Acnase Gel",39.90,"20g",50,2);
insert tb_produto (nome, preco, qtEmbalagem, qtProduto, categoria_id) values ("Luftal",27.99,"12 sachês",50,2);
insert tb_produto (nome, preco, qtEmbalagem, qtProduto, categoria_id) values ("Protetor Solar Sundown FPS60",74.90,"150ml",50,3);
insert tb_produto (nome, preco, qtEmbalagem, qtProduto, categoria_id) values ("Vitamina C Aceviton",11.85,"10 comprimidos",50,4);

select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%b%";
select * from tb_categoria inner join tb_produto;
select nome from tb_produto where categoria_id = 4;