package page1;

import java.util.Scanner;

public class Ex1035 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		int SOMACD = C + D;
		int SOMAAB = A + B;

		if (B > C && D > A && SOMACD > SOMAAB && C >= 0 && D >= 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
		scan.close();
	}

}
