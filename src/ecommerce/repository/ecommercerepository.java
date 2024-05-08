package ecommerce.repository;

import java.util.List;

import ecommerce.model.Cliente;

public interface ecommercerepository {
	
	    // CRUD do Cliente
	   public void cadastrarCliente(Cliente cliente);
	    Cliente procurarClientePorNome(String nome);
	    List<Cliente> listarTodosClientes();
	   public void atualizarCliente(Cliente cliente);
	   public void deletarCliente(String nome);
	}


