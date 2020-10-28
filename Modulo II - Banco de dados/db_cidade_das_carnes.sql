create database db_cidade_das_carnes;
use db_cidade_das_carnes;

drop table tb_categoria;
create table tb_categorias (
	id_categoria bigint,
	nome varchar(30),
    qtdCarne int,
    disponivel boolean,
    primary key (id_categoria)
);

insert into tb_categorias values
(1, 'Categoria 1',3,true),
(2, 'Categoria 2',20,true),
(3, 'Categoria 3',1,true),
(4, 'Sem Categoria',0,false),
(5, 'Categoria não encontrada',90,true);

drop table tb_produtos;
create table tb_produtos (
     id_prod bigint auto_increment,
     nome_prod varchar(30),
     preco decimal(5,2),	
     primary key (id_prod)
);

select * from tb_produtos;
insert into tb_produtos (nome_prod,preco) values
('Picanha', 50.00),
('Coxão duro', 100.00),
('Picanha', 60.00),
('Capa de Filé', 650.00),
('Fraldinha', 150.00),
('Pescoço', 200.00),
('Ponta de Agulha', 60.00),
('Cupim', 10.00);

select * from tb_produtos where preco > 50.00;

select * from tb_produtos where preco between 3 and 60; 

select * from tb_produtos where nome_prod like 'CO%';

select * from tb_produtos inner join tb_categorias where tb_produtos.id_prod = tb_categorias.id_categorias;













