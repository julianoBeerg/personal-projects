package page1;

import java.util.Scanner;

public class Ex1009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double SAL, VENDAS, SALARIO;

		SAL = scan.nextDouble();
		VENDAS = scan.nextDouble();

		VENDAS = VENDAS * 0.15;
		SALARIO = SAL + VENDAS;

		System.out.printf("TOTAL = R$ %.2f\n", SALARIO);

		scan.close();

	}

}
