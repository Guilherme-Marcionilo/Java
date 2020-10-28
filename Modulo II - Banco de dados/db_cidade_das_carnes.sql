create database db_cidade_das_carnes;

create table tb_categoria (
	id_categoria bigint,
	nome varchar(30),
    qtdCarne int   
);

insert into tb_categorias values
(1, 'Categoria 1',3),
(2, 'Categoria 2',3),
(3, 'Categoria 3',3),
(4, 'Sem Categoria',3),
(5, 'Categoria não encontrada',3)
;

create table tb_produtos (
     id_prod bigint,
     nome_prod varchar(30),
     preco decimal(5,2),
	 constraint fk_categoria foreign key (id_categoria)
     references tb_categoria (id_categoria),
     primary key (id_prod)
);

insert into tb_produto values
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













