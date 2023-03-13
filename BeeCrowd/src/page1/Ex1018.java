package page1;

import java.util.Scanner;

public class Ex1018 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int VALOR = scan.nextInt();
		int VALORINICIAL = VALOR;

		int NOTA100 = VALOR / 100;
		double SOBRA = VALOR % 100;
		VALOR = (int) SOBRA;

		int NOTA50 = VALOR / 50;
		SOBRA = VALOR % 50;
		VALOR = (int) SOBRA;

		int NOTA20 = VALOR / 20;
		SOBRA = VALOR % 20;
		VALOR = (int) SOBRA;

		int NOTA10 = VALOR / 10;
		SOBRA = VALOR % 10;
		VALOR = (int) SOBRA;

		int NOTA5 = VALOR / 5;
		SOBRA = VALOR % 5;
		VALOR = (int) SOBRA;

		int NOTA2 = VALOR / 2;
		SOBRA = VALOR % 2;
		VALOR = (int) SOBRA;

		int NOTA1 = VALOR / 1;
		SOBRA = VALOR % 1;
		VALOR = (int) SOBRA;

		System.out.printf(VALORINICIAL + "\n" + NOTA100 + " nota(s) de R$ 100,00\n" + NOTA50 + " nota(s) de R$ 50,00\n"
				+ NOTA20 + " nota(s) de R$ 20,00\n" + NOTA10 + " nota(s) de R$ 10,00\n" + NOTA5
				+ " nota(s) de R$ 5,00\n" + NOTA2 + " nota(s) de R$ 2,00\n" + NOTA1 + " nota(s) de R$ 1,00\n");

		scan.close();
	}

}
