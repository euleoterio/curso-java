insert into estados (id, nome, sigla, regiao, populacao)
values (1000, 'Novo', 'NV', 'Sul', 2.54)

select * from estados

-- se não passar ID, ele vai pegar sempre o último +1
insert into estados (nome, sigla, regiao, populacao)
values ('Mais Novo', 'MN', 'Norte', 2.51)