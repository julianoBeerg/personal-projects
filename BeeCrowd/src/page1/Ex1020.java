package page1;

import java.util.Scanner;

public class Ex1020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int DIASDEVIDA = scan.nextInt();

		int ANOS = DIASDEVIDA / 365;
		int SOBRA = DIASDEVIDA % 365;

		int MESES = SOBRA / 30;
		SOBRA = SOBRA % 30;

		System.out.print(ANOS + " ano(s)\n" + MESES + " mes(es)\n" + SOBRA + " dia(s)");

		scan.close();

	}

}
