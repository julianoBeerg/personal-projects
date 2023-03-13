package page2;

import java.util.Scanner;

public class Ex1045 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double A, B, C, MIN1, MIN2 = 0, MIN3 = 3;
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		
		MIN1 = Math.min(A, Math.min(B, C));
		
		if(MIN1 == A) {
			MIN2 = Math.min(B, C);
			MIN3 = Math.max(B, C);
		}else if(MIN1 == B) {
			MIN2 = Math.min(A, C);
			MIN3 = Math.max(A, C);
		}else if(MIN1 == C) {
			MIN2 = Math.min(A, B);
			MIN3 = Math.max(A, B);
		}
		
		A = MIN3;
		B = MIN2;
		C = MIN1;
	
		
		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if(Math.pow(A, 2) == Math.pow(B, 2)+Math.pow(C, 2)){
				System.out.println("TRIANGULO RETANGULO");
			}if(Math.pow(A, 2) > Math.pow(B, 2)+Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}if(Math.pow(A, 2) < Math.pow(B, 2)+Math.pow(C, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		scan.close();
	}
}
