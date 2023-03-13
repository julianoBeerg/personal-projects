package projects;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A, B;

		A = scan.nextInt();
		B = scan.nextInt();

		String matriz[][] = new String[A][B];

		for (int LINHA = 0; LINHA < A; LINHA++) {

			for (int COLUNA = 0; COLUNA < B; COLUNA++)

				System.out.print("~ ");
			System.out.println(" ");
		}

		for (int LINHA = 0; LINHA < A; LINHA++) {

			for (int COLUNA = 0; COLUNA < B; COLUNA++)

				System.out.print("~ ");
			matriz[0][0] = "*";
			System.out.println(" ");

		}

		scan.close();
	}

}
