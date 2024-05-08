package ecommerce.model;

public abstract class Cliente {
	
	 private String nome;
	    private String endereco;
	    private int telefone;

	    public Cliente(String nome, String endereco, int telefone) {
	        this.nome = nome;
	        this.endereco = endereco;
	        this.telefone = telefone;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public int getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(int telefone) {
	        this.telefone = telefone;
	    }

	    public void imprimirDadosCliente() {
	        System.out.println("\n\n***********************************************************");
	        System.out.println("Dados do Cliente:");
	        System.out.println("***********************************************************");
	        System.out.println("Nome: " + this.nome);
	        System.out.println("Endereço: " + this.endereco);
	        System.out.println("Telefone: " + this.telefone);
	    }
	}
	
