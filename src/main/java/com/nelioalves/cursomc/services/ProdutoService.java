package com.nelioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Iterable<Produto> obterTodosProdutos() {
		return repository.findAll();
	}

	public void salvarProdutos(Produto produto) {
		repository.save(produto);
	}

}
