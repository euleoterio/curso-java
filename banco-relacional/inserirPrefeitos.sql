insert into prefeitos 
    (nome, cidade_id)
values 
    ('Rodrigo Neves', 2),
    ('Raquel Lyra', 3),
    ('Zenaldo Countinho', null);


insert into prefeitos 
    (nome, cidade_id)
values 
    ('Rafael Greca', null);


select * from prefeitos

-- da erro porque já exite um prefeito para cidade_id 3
insert into prefeitos 
    (nome, cidade_id)
values 
    ('Rodrigo Pinheiro', 3);
