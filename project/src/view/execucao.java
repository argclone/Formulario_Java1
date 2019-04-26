package view;

import model.pessoa;

public class execucao {
	
	public static void main(String[] args) {
		pessoa pesso = new pessoa();
		pesso.setNome("luiz fellipe");
		pesso.setEndereco("rua travessa");
		pesso.setBairro("pq. paineiras");
		pesso.setCep(453443);
		pesso.setCidade("SP");
		pesso.setEstado("SP");
		
		System.out.println(pesso.getNome());
		System.out.println(pesso.getEndereco());
		System.out.println(pesso.getBairro());
		System.out.println(pesso.getCep());
		System.out.println(pesso.getCidade());
		System.out.println(pesso.getEstado());
		


	}
	

}
