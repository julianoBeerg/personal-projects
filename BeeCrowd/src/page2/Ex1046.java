package page2;

import java.util.Scanner;

public class Ex1046 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int HORAINICIO,MINUTOINICIO,HORAFIM,MINUTOFIM,HORAMIN1,HORAMIN2, HORA24, RESULTADO;
		
		HORAINICIO = scan.nextInt();
		MINUTOINICIO = scan.nextInt();
		HORAFIM = scan.nextInt();
		MINUTOFIM = scan.nextInt();
		HORAMIN1 = (HORAINICIO * 60) + MINUTOINICIO;
		HORAMIN2 = (HORAFIM * 60) + MINUTOFIM;
		HORA24 = 24*60;
		RESULTADO = 0;
		
		if(HORAMIN2 > HORAMIN1) {
			RESULTADO = HORAMIN2 - HORAMIN1;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", (RESULTADO/60), RESULTADO%60);
		}else if (HORAMIN1 > HORAMIN2) {
			RESULTADO =(HORA24 - HORAMIN1) + HORAMIN2;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", (RESULTADO/60), RESULTADO%60);
		}else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", 24, 0);
		}
		scan.close();		
	}

}
