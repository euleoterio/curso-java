create table if not exists cidades(
  id int unsigned not null auto_increment,
  nome varchar(255) not null,
  estado_id int unsigned not null,
  area decimal(10,2) not null,
  primary key (id),
  foreign key (estado_id) references estados (id)
);

-- chave estrangeira (estado_id) referencia a tabela estados e coluna id


-- Exemplo para drop -- e exemplo de outra forma de ser usado primary key
create table if not exists teste(
  id int unsigned not null auto_increment primary key
);

drop table if exists teste;