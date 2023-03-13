package page3;

import java.util.Scanner;

public class Ex1074 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			int X = scan.nextInt();

			if (X % 2 == 0 && X > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (X % 2 != 0 && X > 0) {
				System.out.println("ODD POSITIVE");
			} else if (X % 2 == 0 && X < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (X % 2 != 0 && X < 0) {
				System.out.println("ODD NEGATIVE");
			} else {
				System.out.println("NULL");
			}
		}
		scan.close();
	}

}
