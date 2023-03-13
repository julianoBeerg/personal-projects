package page2;

import java.util.Scanner;

public class Ex1043 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double A, B, C, PER, RET;

		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		PER = A + B + C;
		RET = (A + B) * C / 2.0;

		if ((A < B + C) && (B < A + C) && (C < A + B)) {
			System.out.println("Perimetro = " + PER);

		} else {
			System.out.println("Area = " + RET);
		}
		scan.close();
	}

}
