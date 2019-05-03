package com.nelioalves.cursomc.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Produto;
//operacoes de acesso a dados CRUD referentes ao objeto categoria (Entity)
@Repository
//public interface ProdutoRepository extends JpaRepository<Produto, Integer> {     ////originallll

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
