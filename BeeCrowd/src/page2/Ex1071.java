package page2;

import java.util.Scanner;

public class Ex1071 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int min, max, soma = 0;

		if (num1 < num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}

		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}

		System.out.println(soma);
		scan.close();

	}

}
