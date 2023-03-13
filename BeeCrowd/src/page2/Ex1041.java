package page2;

import java.util.Scanner;

public class Ex1041 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double X, Y;

		X = scan.nextDouble();
		Y = scan.nextDouble();

		if (X > 0 && Y > 0) {
			System.out.println("Q1");
		} else if (X < 0 && Y > 0) {
			System.out.println("Q2");
		} else if (X < 0 && Y < 0) {
			System.out.println("Q3");
		} else if (X > 0 && Y < 0) {
			System.out.println("Q4");
		} else if (X == 0 && Y == 0) {
			System.out.println("Origem");
		} else if (X != 0 && Y == 0) {
			System.out.println("Eixo X");
		} else if (Y != 0 && X == 0) {
			System.out.println("Eixo Y");
		}
		scan.close();
	}

}
