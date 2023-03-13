package page2;

import java.util.Scanner;

public class Ex1067 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int CONT;
		int NUM = scanner.nextInt();
		scanner.close();

		for (CONT = 0; CONT <= NUM; CONT++) {
			if (CONT % 2 == 1) {
				System.out.println(CONT);
			}
		}

	}

}
