package ecommerce.controller;

import java.util.Collection;
import java.util.List;

import ecommerce.model.Cliente;
import ecommerce.repository.ecommercerepository;

public class EcommerceController implements ecommercerepository {
	
	 @Override
	    public void cadastrarCliente(Cliente cliente) {
	        cliente.add(cliente);
	    }

	    @Override
	    public Cliente procurarClientePorNome(String nome) {
	        Cliente[] cliente;
			for (Cliente cliente : cliente) {
	            if (cliente.getNome().equalsIgnoreCase(nome)) {
	                return cliente;
	            }
	        }
	        return null; // Cliente não encontrado
	    }

	    @Override
	    public List<Cliente> listarTodosClientes() {
			return cliente;
	    }

	    @Override
	    public void atualizarCliente(Cliente clienteAtualizado) {
	        Cliente[] cliente;
			for (Cliente cliente : cliente) {
	            if (cliente.getNome().equalsIgnoreCase(clienteAtualizado.getNome())) {
	                cliente.setEndereco(clienteAtualizado.getEndereco());
	                cliente.setTelefone(clienteAtualizado.getTelefone());
	                return;
	            }
	        }
	        // Cliente não encontrado, pode ser tratado de outra forma conforme a necessidade
	    }

		@Override
		public void deletarCliente(String nome) {
			// TODO Auto-generated method stub
			
		}

	    
	    }

