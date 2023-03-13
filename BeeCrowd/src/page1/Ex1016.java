package page1;

import java.util.Scanner;

public class Ex1016 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int DISTANCIA = scan.nextInt();

		int KM = DISTANCIA * 2;

		System.out.println(KM + " minutos");

		scan.close();
	}

}
