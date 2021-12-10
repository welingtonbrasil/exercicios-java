package entities;

public class Conta {

	private int numConta;
	private String titular;
	private double valor;
	
	public Conta() {
	}
	
	public Conta(int numConta, String titular, double valor) {
		super();
		this.numConta = numConta;
		this.titular = titular;
		Deposito(valor);
	}
	
	public Conta(int numConta, String titular) {
		super();
		this.numConta = numConta;
		this.titular = titular;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}
	
	public void setSitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}
	
	public void Deposito(double valor) {
		this.valor += valor;
	}
	
	public void Saque(double valor) {
		this.valor -= (valor + 5);
	}
	
	public String toString() {
		return "Conta "
			+ this.numConta
			+ ", Titular "
			+ this.titular
			+ ", Saldo "
			+ String.format("%.2f",this.valor);
	}
	
	
}
