package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user = new Usuario(1, "Joseph", "Climber", "Joseph Climber", "josephClimber@gmail.com" "222-3344");
		
		public void mostrar() {
		System.out.println("\n\nUsuário:\n");
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Login: " + this.login);
		System.out.println("Senha: " + this.senha);
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Telefone: " + this.telefone);
		
		user.mostrar();
		}
		
		ItemDePedido Idp1 = new ItemDePedido();
		Idp1.setQtde(2);
		Idp1.setSubtotal(22.98);


		ItemDePedido Idp2 = new ItemDePedido();
		Idp2.setQtde(1);
		Idp2.setSubtotal(98.75);
		
		
		Endereco end = new Endereco();
		end.setBairro("");
		end.setCidade("");
		end.setCep("");
		end.setLogradouro("");
		end.setComplemento("");
		end.setEstado("");
		end.setNumero("");
		
		Notebook note = new Notebook();
		note.setDescricao(null);
		note.setModelo("Intel");
		note.setNumeroNote(2002-4);
		note.setDataCadastro("0001-5");
		note.setFigura("");
		note.setPrecoUnitario(2.000);
		
		note.setDescricao(null);
		note.setModelo("CCE");
		note.setNumeroNote(2044-4);
		note.setDataCadastro("0456-5");
		note.setFigura("");
		note.setPrecoUnitario(1500.00);
		
		note.setDescricao(null);
		note.setModelo("Positivo");
		note.setNumeroNote(2012-4);
		note.setDataCadastro("00063-5");
		note.setFigura("");
		note.setPrecoUnitario(1.800);
		
		
		Pedido pdd = new Pedido();
		pdd.setNumero(0001);
		pdd.setDataEmissao("23-11-2018");
		pdd.setFormaDePagamento("");
		pdd.setValorTotal(1.200);
		pdd.setSituacao("");
		
		
	}
	
	

}
