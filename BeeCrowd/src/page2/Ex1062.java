package page2;

import java.util.Scanner;

public class Ex1062 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int CONTADOR = 0;
		double SOMA = 0;

		for (int CONT = 0; CONT < 6; CONT++) {
			double NUM = scan.nextDouble();
			if (NUM >= 0) {
				CONTADOR++;
				SOMA += NUM;
			}
		}
		SOMA = SOMA/CONTADOR;
		System.out.print(CONTADOR + " valores positivos\n");
		System.out.printf("%.1f\n", SOMA);
		
		scan.close();
	}
}
