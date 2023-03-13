package page1;

import java.util.Scanner;

public class Ex1005 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble();
		double B = scan.nextDouble();

		A = A * 3.5 / 11;
		B = B * 7.5 / 11;

		Double MEDIA = A + B;

		if (MEDIA > 10) {
			MEDIA = 10.0;
		}

		System.out.printf("MEDIA = %.5f", MEDIA);

		scan.close();
	}

}

/*
 * import java.util.Scanner;
 * 
 * public class Main{
 * 
 * public static void main(String[] args) {
 * 
 * Scanner scan = new Scanner (System.in);
 * 
 * double A = scan.nextDouble(); double B = scan.nextDouble();
 * 
 * A = A * 3.5 / 11; B = B * 7.5 / 11;
 * 
 * A = A + B; //Double MEDIA = A + B;
 * 
 * if(A > 10) { A = 10.0; }
 * 
 * System.out.printf("MEDIA = %.5f", A);
 * 
 * }
 * 
 * }
 */