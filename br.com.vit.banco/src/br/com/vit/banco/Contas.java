package br.com.vit.banco;

public class Contas {
	
	int numero; //atributos
	private double saldo; //atributos
	private static int valorAleatorio = 1;
	
	void setSaque(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		}
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	public void setNumeroAleatorio() {
		this.numero = valorAleatorio;
		valorAleatorio ++;
	}

}
