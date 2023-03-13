package page1;

import java.util.Scanner;

public class Ex1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double R = scan.nextDouble();
		double pi = 3.14159;

		double volume = (4 / 3.0) * pi * Math.pow(R, 3);

		System.out.printf("VOLUME = %.3f%n", volume);

		scan.close();

	}

}
