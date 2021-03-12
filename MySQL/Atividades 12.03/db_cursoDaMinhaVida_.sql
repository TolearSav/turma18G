CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria (
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);

insert tb_categoria (descricao, ativo) values ("Administração", true);
insert tb_categoria (descricao, ativo) values ("Saúde", true);
insert tb_categoria (descricao, ativo) values ("Tecnologia", true);
insert tb_categoria (descricao, ativo) values ("Direito", true);

CREATE TABLE tb_curso (
id bigint auto_increment,
nome varchar(255) not null,
duracao varchar(255) not null,
preco decimal(10,2) not null,
vagas int not null,
turmas varchar(255) not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_curso (nome, duracao, preco, vagas, turmas, categoria_id) values ("Gestão Pública Participativa","40hrs",169.90,50,"1A",1);
insert tb_curso (nome, duracao, preco, vagas, turmas, categoria_id) values ("Assistente Administrativo","60hrs",269.90,50,"1A",1);
insert tb_curso (nome, duracao, preco, vagas, turmas, categoria_id) values ("Primeiros Socorros","40hrs",169.90,50,"1A",2);
insert tb_curso (nome, duracao, preco, vagas, turmas, categoria_id) values ("Direito Administrativo","50hrs",229.90,50,"1A",3);
insert tb_curso (nome, duracao, preco, vagas, turmas, categoria_id) values ("Programação PHP","40hrs",169.90,50,"1A",4);
insert tb_curso (nome, duracao, preco, vagas, turmas, categoria_id) values ("Programação Java","40hrs",169.90,50,"1A",4);

select * from tb_curso where preco > 50;
select * from tb_curso where preco between 3 and 60;
select * from tb_curso where nome like "%j%";
select * from tb_categoria inner join tb_curso;
select nome from tb_curso where categoria_id = 4;