package page1;

import java.util.Scanner;

public class Ex1014 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		double Y = scan.nextDouble();

		double KM = X / Y;

		System.out.printf("%.3f km/1\n", KM);

		scan.close();
	}

}
