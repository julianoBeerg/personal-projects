package java;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = scan.next();

		System.out.println("String: " + s);
		System.out.printf("Double: ", d);
		System.out.println("Int: " + i);

		scan.close();

	}

}
