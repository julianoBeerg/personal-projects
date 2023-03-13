package page2;

import java.util.Scanner;

public class Ex1042 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A, B, C, MIN1, MIN2 = 0, MIN3 = 3;
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();

		MIN1 = Math.min(A, Math.min(B, C));

		if (MIN1 == A) {
			MIN2 = Math.min(B, C);
			MIN3 = Math.max(B, C);
		} else if (MIN1 == B) {
			MIN2 = Math.min(A, C);
			MIN3 = Math.max(A, C);
		} else if (MIN1 == C) {
			MIN2 = Math.min(A, B);
			MIN3 = Math.max(A, B);
		}

		System.out.println(MIN1);
		System.out.println(MIN2);
		System.out.println(MIN3);
		System.out.println("");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

		scan.close();
	}

}
