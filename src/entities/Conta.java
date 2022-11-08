package entities;

public class Conta {

	public String nome;
	public	String cpf;
	private Double saldo;

	public Conta() {
		saldo = 0.0;
}

	public Conta(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;

	}
	
	public Double getSaldo() {
		return saldo;
		
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		if (saldo < valor) {
			
		}
		saldo -= valor;
	}
}