package page1;

import java.util.Scanner;

public class Ex1037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double NUM = scan.nextDouble();

		if (NUM >= 0 && NUM <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (NUM > 25 && NUM <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (NUM > 50 && NUM <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (NUM > 75 && NUM <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de Intervalo");
		}
		scan.close();
	}

}
