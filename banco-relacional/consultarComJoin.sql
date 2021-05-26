-- nome tabela depois alis (exemplo: estados e)
select * from estados e, cidades c
where e.id = c.estado_id

-- região NÃO precisa usar alias, porque existe essa coluna em uma tabela só
select 
    e.nome as 'Estado', 
    c.nome as 'Cidade', 
    regiao as 'Região'
from estados e, cidades c
where e.id = c.estado_id


select 
  c.nome as Cidade, 
  e.nome as Estado,
  regiao as Região
from estados e
inner join cidades c on e.id = c.estado_id
