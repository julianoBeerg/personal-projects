package page1;

import java.util.Scanner;

public class Ex1017 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int TEMPO = scan.nextInt();

		int VEL = scan.nextInt();

		double LITROS = TEMPO * VEL / 12.0;

		System.out.printf("%.3f\n", LITROS);

		scan.close();
	}

}
