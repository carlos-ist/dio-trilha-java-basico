package desafio_banco;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("Por favor, digite o numero da conta:");
		numeroConta = sc.nextInt();

		System.out.println("Por favor, digite o numero da Agencia!");
		agencia = sc.next();

		System.out.println("Por favor, digite seu nome:");
		nomeCliente = sc.next();

		System.out.println("Por favor digite seu saldo:");
		saldo = sc.nextDouble();
		
		System.out.println();
		System.out.println(
				"Oi, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + ", "
						+ "conta " + numeroConta + " e seu saldo " + saldo + " e ja esta disponivel para saque");

	}

}
