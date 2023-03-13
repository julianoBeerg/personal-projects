package page2;

import java.util.Scanner;

public class Ex1044 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A, B;

		A = scan.nextInt();
		B = scan.nextInt();

		if (A % 3 == 0 || B % 3 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		scan.close();

	}

}
