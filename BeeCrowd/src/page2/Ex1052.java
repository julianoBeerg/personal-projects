package page2;

import java.util.Scanner;

public class Ex1052 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int MONTH = scan.nextInt();

		if (MONTH == 1) {
			System.out.println("January");
		} else if (MONTH == 2) {
			System.out.println("February");
		} else if (MONTH == 3) {
			System.out.println("March");
		} else if (MONTH == 4) {
			System.out.println("April");
		} else if (MONTH == 5) {
			System.out.println("May");
		} else if (MONTH == 6) {
			System.out.println("June");
		} else if (MONTH == 7) {
			System.out.println("July");
		} else if (MONTH == 8) {
			System.out.println("August");
		} else if (MONTH == 9) {
			System.out.println("September");
		} else if (MONTH == 10) {
			System.out.println("October");
		} else if (MONTH == 11) {
			System.out.println("November");
		} else if (MONTH == 12) {
			System.out.println("December");
		}

		scan.close();

	}

}
