package page2;

import java.util.Scanner;

public class Ex1061 {

	public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);

	int DIAINICIO, HORAINICIO, MINUTOINICIO, SEGUNDOINICIO;
	int DIAFIM, HORAFIM, MINUTOFIM, SEGUNDOFIM;
	
	System.out.printf("Dia ");
	DIAINICIO = scan.nextInt();

	HORAINICIO = scan.nextInt();
	System.out.printf(" : " );
	
	MINUTOINICIO = scan.nextInt();

	scan.close();
	}

}
