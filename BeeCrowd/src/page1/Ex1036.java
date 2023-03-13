package page1;

import java.util.Scanner;

public class Ex1036 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();

		double DELTA = Math.pow(B, 2) - (4 * A * C);

		double R1 = (-B + Math.sqrt(DELTA)) / (2 * A);
		double R2 = (-B - Math.sqrt(DELTA)) / (2 * A);

		if (DELTA > 0 && A != 0) {
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		} else {
			System.out.println("Impossivel Calcular");
		}
		scan.close();
	}

}
