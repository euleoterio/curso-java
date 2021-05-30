-- não vai trazer as informações de colunas que tem o mesmo nome, em tabelas diferentes
select * from cidades c 
inner join prefeitos p on c.id = p.cidade_id

select * from cidades c 
left join prefeitos p on c.id = p.cidade_id

select * from cidades c 
right join prefeitos p on c.id = p.cidade_id

-- equivalente ao "full join"
select * from cidades c 
left join prefeitos p on c.id = p.cidade_id
union
select * from cidades c 
right join prefeitos p on c.id = p.cidade_id


-- quando não tiver algum valor ele coloca como null