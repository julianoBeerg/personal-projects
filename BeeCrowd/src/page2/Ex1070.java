package page2;

import java.util.Scanner;

public class Ex1070 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int NUM = scan.nextInt();
		if (NUM % 2 == 0) {
			NUM += 1;
			for (int cont = 0; cont < 6; cont++) {
				System.out.println(NUM);
				NUM += 2;
			}
		} else {
			for (int cont = 0; cont < 6; cont++) {
				System.out.println(NUM);
				NUM += 2;
			}
		}
		scan.close();
	}

}
