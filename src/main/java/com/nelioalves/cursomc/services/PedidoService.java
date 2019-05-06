package com.nelioalves.cursomc.services;

//classe de serviço
// responsavel por consultar o repositório
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Pedido;
import com.nelioalves.cursomc.repositories.PedidoRepository;

//serviço --- chama operaçoes do PedidoRepository
@Service
public class PedidoService {

	@Autowired // dependencia automaticamente instanciada pelo Spring (IoC)
	private PedidoRepository repo;
	
	//lança exceção caso o ID não exista
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName(), null));
		}

}
