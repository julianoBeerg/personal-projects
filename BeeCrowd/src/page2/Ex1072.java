package page2;

import java.util.Scanner;

public class Ex1072 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int in = 0, out = 0;
		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {

			int X = scan.nextInt();

			if (X >= 10 && X <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);

		scan.close();
	}

}
