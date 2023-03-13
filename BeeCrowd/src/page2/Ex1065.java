package page2;

import java.util.Scanner;

public class Ex1065 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int NUMPAR, CONTADOR = 0;
		for (int cont = 1; cont <= 5; cont++) {
			NUMPAR = scan.nextInt();
			if (NUMPAR % 2 == 0) {
				CONTADOR++;

			}
		}

		System.out.print(CONTADOR + " valores pares\n");

		scan.close();
	}

}
