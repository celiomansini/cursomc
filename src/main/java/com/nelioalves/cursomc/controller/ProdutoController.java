package com.nelioalves.cursomc.controller;
//recebe as requisições e executa os serviços

//adicionado fora do curso

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.services.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService service;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping("listaprodutos")
	public String listaProdutos(Model model) {
		Iterable<Produto> produtos = service.obterTodosProdutos();
		model.addAttribute("produtos", produtos);
		return "listaprodutos";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome, @RequestParam("preco") Double preco, Model model) {
		Produto novoProduto = new Produto(null, nome, preco);
		service.salvarProdutos(novoProduto);
		Iterable<Produto> produtos = service.obterTodosProdutos();
		model.addAttribute("produtos", produtos);
		return "listaprodutos";
	}

}
