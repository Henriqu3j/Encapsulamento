package application;

import entities.Conta;

public class Program {	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.nome ="Ronaldo";
		c1.cpf = "58645828-5";
		c1.depositar(1000.00);
		c1.sacar(500.00);
		
		System.out.println(c1.nome);
		System.out.println(c1.cpf);
		System.out.println(c1.getSaldo());
		
	}
}

