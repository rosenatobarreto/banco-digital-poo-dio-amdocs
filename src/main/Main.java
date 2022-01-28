package main;

import java.util.Scanner;

import banco.Cliente;
import banco.ContaCorrente;
import banco.ContaPoupanca;
import banco.IConta;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Paulo");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Maria");
		
		IConta cc = new ContaCorrente(cliente1);
		cc.depositar(100);
		IConta poupanca = new ContaPoupanca(cliente2);

		cc.transferir(50, poupanca);

		cc.imprimirExtrato();
		System.out.println();
		poupanca.imprimirExtrato();
	}

}
