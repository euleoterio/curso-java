select * from estados
insert into cidades (nome, area, estado_id)
values ('Campinas', 795, 26)

insert into cidades (nome, area, estado_id)
values ('Niterói', 133.9, 20)

-- sem passar o id e sim buscando na tabela estados pela sigla
insert into cidades 
    (nome, area, estado_id)
values (
    'Caruaru', 
    920.6, 
    (select id from estados where sigla = 'PE')
)

insert into cidades 
    (nome, area, estado_id)
values (
    'Juazeiro do Norte', 
    248.2, 
    (select id from estados where sigla = 'CE')
)


select * from cidades