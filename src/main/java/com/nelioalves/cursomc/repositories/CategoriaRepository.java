package com.nelioalves.cursomc.repositories;
//camada de acesso a dados
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Categoria;
//operacoes de acesso a dados CRUD referentes ao objeto categoria (Entity)
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
