package page1;

import java.util.Scanner;

public class Ex1021 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valorSobra = scan.nextDouble();
		int valor = 0;

		System.out.println("NOTAS:");

		valor = (int) valorSobra / 100;
		System.out.printf("%d nota(s) de R$ 100.00%n", valor);
		valorSobra = valorSobra % 100.0;

		valor = (int) valorSobra / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valor);
		valorSobra = valorSobra % 50.0;

		valor = (int) valorSobra / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valor);
		valorSobra = valorSobra % 20.0;

		valor = (int) valorSobra / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valor);
		valorSobra = valorSobra % 10.0;

		valor = (int) valorSobra / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valor);
		valorSobra = valorSobra % 5.0;

		valor = (int) valorSobra / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valor);
		valorSobra = valorSobra % 2.0;

		valorSobra = valorSobra * 100.0;

		System.out.println("MOEDAS:");

		valor = (int) valorSobra / 100;
		System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
		valorSobra = valorSobra % 100.0;

		valor = (int) valorSobra / 50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
		valorSobra = valorSobra % 50.0;

		valor = (int) valorSobra / 25;
		System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
		valorSobra = valorSobra % 25.0;

		valor = (int) valorSobra / 10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
		valorSobra = valorSobra % 10.0;

		valor = (int) valorSobra / 5;
		System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
		valorSobra = valorSobra % 5.0;

		valor = (int) valorSobra / 1;
		System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
		valorSobra = valorSobra % 1.0;

		scan.close();
	}

}