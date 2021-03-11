CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
turma int not null,
nota decimal(10,2),
primary key(id)
);

insert into tb_alunos (nome, idade, turma, nota) values ("Laura",10,5,6.0);
insert into tb_alunos (nome, idade, turma, nota) values ("Larissa",8,3,7.0);
insert into tb_alunos (nome, idade, turma, nota) values ("Lorran",10,5,7.0);
insert into tb_alunos (nome, idade, turma, nota) values ("Leonardo",11,6,6.5);
insert into tb_alunos (nome, idade, turma, nota) values ("Letícia",9,4,8.5);
insert into tb_alunos (nome, idade, turma, nota) values ("Lilian",7,2,10.0);
insert into tb_alunos (nome, idade, turma, nota) values ("Lenilton",6,1,7.5);
insert into tb_alunos (nome, idade, turma, nota) values ("Lorrayne",10,5,5.0);

select * from tb_alunos where nota > 7.0;
select * from tb_alunos where nota < 7.0;

update tb_alunos set tb_alunos.nota = 5.5 where id = 8;
