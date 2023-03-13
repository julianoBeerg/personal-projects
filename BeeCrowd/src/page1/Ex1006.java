package page1;

import java.util.Scanner;

public class Ex1006 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double R;
		double pi = 3.14159;

		R = scan.nextDouble();

		R = 4 / 3 * pi * Math.pow(R, 3);

		System.out.printf("VOLUME %.3f\n", R);

		scan.close();
	}

}
