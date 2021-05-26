update estados 
set nome = "Maranhão"
where sigla = "MA"
-- usar update sem where, atualiza a tablea toda

select nome from estados where sigla = "MA"

update estados
set nome = "Paraná",
    populacao = 11.32
where sigla = "PR"

-- est seria um alias(apelido) para a tabela estados
select 
    est.nome, 
    sigla, 
    populacao
from estados est where sigla = "PR"