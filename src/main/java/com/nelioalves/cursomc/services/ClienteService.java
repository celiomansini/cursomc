package com.nelioalves.cursomc.services;

//classe de serviço
// responsavel por consultar o repositório
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.repositories.ClienteRepository;

//serviço --- chama operaçoes do ClienteRepository
@Service
public class ClienteService {

	@Autowired // dependencia automaticamente instanciada pelo Spring (IoC)
	private ClienteRepository repo;

	// lança exceção caso o ID não exista
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(), null));
	}

}
