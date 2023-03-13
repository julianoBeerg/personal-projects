package page1;

import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int NF, HT;
		double VH, SAL;

		NF = scan.nextInt();
		HT = scan.nextInt();
		VH = scan.nextDouble();

		SAL = HT * VH;

		System.out.println("NUMBER = " + NF);
		System.out.printf("SALARY = U$ %.2f\n", SAL);

		scan.close();
	}

}
