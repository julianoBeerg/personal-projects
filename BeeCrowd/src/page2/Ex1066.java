package page2;

import java.util.Scanner;

public class Ex1066 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int NUM, NUMPAR = 0, NUMIMPAR = 0, NUMNEG = 0, NUMPOS = 0;
		for (int cont = 1; cont <= 5; cont++) {
			NUM = scan.nextInt();
			if (NUM % 2 == 0) {
				NUMPAR++;
				if (NUM > 0) {
					NUMPOS++;
				} else if (NUM < 0) {
					NUMNEG++;
				}
			} else if (NUM % 2 == 1 || NUM % 2 == -1) {
				NUMIMPAR++;
				if (NUM > 0) {
					NUMPOS++;
				} else if (NUM < 0) {
					NUMNEG++;
				}
			}
		}

		System.out.print(NUMPAR + " valor(es) par(es)\n");
		System.out.print(NUMIMPAR + " valor(es) impar(es)\n");
		System.out.print(NUMPOS + " valor(es) positivo(s)\n");
		System.out.print(NUMNEG + " valor(es) negativo(s)\n");

		scan.close();

	}

}
