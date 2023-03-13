package page1;

import java.util.Scanner;

public class Ex1015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double X1 = scan.nextDouble();
		double Y1 = scan.nextDouble();
		double X2 = scan.nextDouble();
		double Y2 = scan.nextDouble();

		double DISTANCIA = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

		System.out.printf("%.4f\n", DISTANCIA);

		scan.close();
	}
}
