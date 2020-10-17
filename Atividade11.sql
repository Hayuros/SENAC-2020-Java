use sakila;

select c.nome, count(fc.filme_id) from categoria c join filme_categoria fc on c.categoria_id=fc.categoria_id group by c.nome having count(fc.filme_id) < 40;

select concat(c.primeiro_nome, ' ', c.ultimo_nome) as 'Nome Completo', count(a.aluguel_id) as 'Total Locações' from cliente c join aluguel a on c.cliente_id=a.cliente_id group by c.cliente_id order by count(a.aluguel_id) desc;

select c.nome avg(duracao_do_filme) from categoria c join filme_categoria fc on fc.categoria_id=c.categoria_id join filme f on f.filme_id=fc.filme_id group by c.nome;