package page2;

import java.util.Scanner;

public class Ex1048 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double SALARIO, NOVOSALARIO, REAJUSTE;
		int PERCENTUAL;
		
		SALARIO = scan.nextDouble();
	
		if (SALARIO >= 0 && SALARIO <= 400.00) {
			PERCENTUAL = 15;	
			REAJUSTE = SALARIO * PERCENTUAL/100 ;
			NOVOSALARIO = SALARIO + REAJUSTE ;
			System.out.printf("Novo salario: %.2f\n", NOVOSALARIO);
			System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
			System.out.println("Em percentual: " + PERCENTUAL + " %");
		}
		else if(SALARIO >= 400.01 && SALARIO <= 800.00){
			PERCENTUAL = 12;	
			REAJUSTE = SALARIO * PERCENTUAL/100 ;
			NOVOSALARIO = SALARIO + REAJUSTE ;
			System.out.printf("Novo salario: %.2f\n", NOVOSALARIO);
			System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
			System.out.println("Em percentual: " + PERCENTUAL + " %");
		}
		else if(SALARIO >= 800.01 && SALARIO <= 1200.00) {
			PERCENTUAL = 10;	
			REAJUSTE = SALARIO * PERCENTUAL/100 ;
			NOVOSALARIO = SALARIO + REAJUSTE ;
			System.out.printf("Novo salario: %.2f\n", NOVOSALARIO);
			System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
			System.out.println("Em percentual: " + PERCENTUAL + " %");
		}
		else if(SALARIO >= 1200.01 && SALARIO <= 2000.00) {
			PERCENTUAL = 7;	
			REAJUSTE = SALARIO * PERCENTUAL/100 ;
			NOVOSALARIO = SALARIO + REAJUSTE ;
			System.out.printf("Novo salario: %.2f\n", NOVOSALARIO);
			System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
			System.out.println("Em percentual: " + PERCENTUAL + " %");
		}
		else if(SALARIO >= 2000.00) {
			PERCENTUAL = 4;	
			REAJUSTE = SALARIO * PERCENTUAL/100 ;
			NOVOSALARIO = SALARIO + REAJUSTE ;
			System.out.printf("Novo salario: %.2f\n", NOVOSALARIO);
			System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
			System.out.println("Em percentual: " + PERCENTUAL + " %");
		}

		scan.close();
	}

}
