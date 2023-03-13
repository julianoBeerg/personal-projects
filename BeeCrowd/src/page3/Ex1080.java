package page3;

import java.util.Scanner;

public class Ex1080 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, maior = 0, cont = 0;

		for (int i = 1; i <= 100; i++) {
			num = scan.nextInt();

			if (num > maior) {
				maior = num;
				cont = i;
			}

		}
		System.out.println(maior);
		System.out.println(cont);

		scan.close();
	}

}
