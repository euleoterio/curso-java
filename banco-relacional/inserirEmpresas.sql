-- alterar cnpj de int para varchar
alter table empresas modify cnpj varchar(14);

insert into empresas
    (nome, cnpj)
values 
    ('Bradesco', 12345678901234),
    ('Vale', 92345678901234),
    ('Cielo', 02345678901234);


--  uma descrição da tabela e seus campos
desc empresas;

select * from empresas;
select * from cidades;


insert into empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);


select * from empresas_unidades;