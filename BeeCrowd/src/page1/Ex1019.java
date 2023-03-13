package page1;

import java.util.Scanner;

public class Ex1019 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int SEGUNDOS = scan.nextInt();

		int HORAS = SEGUNDOS / 3600;
		int SOBRA = SEGUNDOS % 3600;

		int MINUTOS = SOBRA / 60;
		SOBRA = SOBRA % 60;

		System.out.print(HORAS + ":" + MINUTOS + ":" + SOBRA);
		scan.close();

	}

}
