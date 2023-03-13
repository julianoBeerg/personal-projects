package page2;

import java.util.Scanner;

public class Ex1038 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int COD = scan.nextInt();
		int QUANT = scan.nextInt();

		if (COD == 1) {
			double CQ = QUANT * 4.00;
			System.out.printf("Total: R$ %.2f\n", CQ);
		} else if (COD == 2) {
			double XS = QUANT * 4.50;
			System.out.printf("Total: R$ %.2f\n", XS);
		} else if (COD == 3) {
			double XB = QUANT * 5.00;
			System.out.printf("Total: R$ %.2f\n", XB);
		} else if (COD == 4) {
			double TS = QUANT * 2.00;
			System.out.printf("Total: R$ %.2f\n", TS);
		} else if (COD == 5) {
			double REFRI = QUANT * 1.50;
			System.out.printf("Total: R$ %.2f\n", REFRI);
		}
		scan.close();
	}

}
