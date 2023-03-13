package page2;

import java.util.Scanner;

public class Ex1060 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int CONTADOR = 0;

		for (int CONT = 0; CONT < 6; CONT++) {
			double NUM = scan.nextDouble();
			if (NUM >= 0) {
				CONTADOR ++;
			}
		}
		
		System.out.println(CONTADOR + " valores positivos");

		scan.close();

	}

}
