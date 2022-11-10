package br.com.vit.banco;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.conta = new Contas();
		
		cliente1.nome = "Vit";
		cliente1.numeroCPF = 1234;
		
		cliente1.conta.numero = 9999;
		cliente1.conta.saldo = 1299.00;
		//
		//
		Contas conta1 = new Contas();
		conta1.numero = 8888;
		conta1.saldo = 999.00;
		
		Cliente cliente2 = new Cliente();
		cliente2.numeroCPF = 4321;
		cliente2.nome = "fulano";
		cliente2.conta = conta1;
		//
		//
		Cliente cliente3 = new Cliente();
		cliente3.numeroCPF = 8765;
		cliente3.nome = "ciclano";

	}

}
