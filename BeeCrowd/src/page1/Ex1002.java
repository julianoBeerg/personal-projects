package page1;

import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double raio = scan.nextDouble();

		double area;
		double n = 3.14159;

		area = n * Math.pow(raio, 2);

		System.out.printf("A=%.4f\n", area);

		scan.close();
	}

}
