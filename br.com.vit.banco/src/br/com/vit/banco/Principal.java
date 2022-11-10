package br.com.vit.banco;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("vit");
		cliente1.conta = new Contas();
		//cliente1.nome = "Vit";
		//cliente1.numeroCPF = 1234;
		cliente1.conta.numero = 9999;
		System.out.println(cliente1.nome);
		System.out.println(cliente1.numeroCPF);
		System.out.println(cliente1.conta.getSaldo());
		//
		//
		Contas conta1 = new Contas();
		conta1.numero = 8888;
		Cliente cliente2 = new Cliente("fulano");
		//cliente2.numeroCPF = 4321;
		//cliente2.nome = "fulano";
		cliente2.conta = conta1;
		//
		//
		Cliente cliente3 = new Cliente("ciclano");
		//cliente3.numeroCPF = 8765;
		//cliente3.nome = "ciclano";
		//
		System.out.println(cliente1.conta.getSaldo());
		cliente1.conta.setSaque(100); //correta
		System.out.println(cliente1.conta.getSaldo());
		//
		Cliente clienteA = new Cliente("sla");
		clienteA.numeroCPF = 1111;
		clienteA.conta = new Contas();
		System.out.println(clienteA.conta.numero);
		
		Cliente clienteB = new Cliente("Bb");
		clienteA.numeroCPF = 2222;
		clienteA.conta = new Contas();
		System.out.println(clienteB.conta.numero);
		//
		Funcionarios func = new Funcionarios("nomeee");
		func.numeroCPF = 12345;
		System.out.println(func.nome);
		System.out.println(func.numeroCPF);
		
		

	}

}
