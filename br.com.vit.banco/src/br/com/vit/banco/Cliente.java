package br.com.vit.banco;

public class Cliente {

	String nome; //atributos
	int numeroCPF; //Modificador private nãpo permite que outras classes 
	
	Contas conta;
	
	//construtor
	public Cliente(String name) { //ao criar o new devemos informar
		this.nome = name;						//
		
	}

}
