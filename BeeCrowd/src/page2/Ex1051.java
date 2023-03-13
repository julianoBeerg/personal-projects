package page2;

import java.util.Scanner;

public class Ex1051 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double IMPOSTO8, IMPOSTO18, IMPOSTO28;

		double SALARIO = scan.nextDouble();

		if (SALARIO >= 0.0 && SALARIO <= 2000.00) {
			System.out.println("Isento");
		} else if (SALARIO >= 2000.01 && SALARIO <= 3000.00) {
			IMPOSTO8 = SALARIO - 2000.00;
			IMPOSTO8 = IMPOSTO8 * 8 / 100;
			SALARIO = IMPOSTO8;
			System.out.printf("R$ %.2f", SALARIO);
		} else if (SALARIO >= 3000.01 && SALARIO <= 4500.00) {
			IMPOSTO8 = 1000 * 8 / 100;
			IMPOSTO18 = SALARIO - 3000.00;
			IMPOSTO18 = IMPOSTO18 * 18 / 100;
			SALARIO = IMPOSTO8 + IMPOSTO18;
			System.out.printf("R$ %.2f", SALARIO);
		} else if (SALARIO >= 4500.01) {
			IMPOSTO8 = 1000 * 8 / 100;
			IMPOSTO18 = 1500 * 18 / 100;
			IMPOSTO28 = SALARIO - 4500.00;
			IMPOSTO28 = IMPOSTO28 * 28 / 100;
			SALARIO = IMPOSTO8 + IMPOSTO18 + IMPOSTO28;
			System.out.printf("R$ %.2f", SALARIO);
		}

		scan.close();
	}

}
