SELECT * FROM estados

select nome, sigla from estados

-- sigla com S funciona porque não é case sensitive, e "label" para nome
select 
  Sigla, 
  nome as 'Nome do Estado' 
from estados
-- filtro
where regiao = 'Sul'


select 
  nome, 
  regiao,
  populacao 
from estados
where populacao >= 10
order by populacao desc
-- order para ordenar e desc para decrescente