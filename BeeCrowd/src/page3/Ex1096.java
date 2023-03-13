package page3;

import java.util.Scanner;

public class Ex1096 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = 0, coelho = 0, ratos = 0, sapos = 0, quant;
		String dado;
		N = scan.nextInt();
		for (int CONT = 0; CONT < N; CONT++) {
			quant = scan.nextInt();
			dado = scan.next();
			if(dado == "C") {
				coelho += quant;
			}else if(dado == "R") {
				ratos += quant;
			}else if(dado == "S") {
				sapos += quant;
			}
		}
		
		System.out.println(coelho);
		System.out.println(ratos);
		System.out.println(sapos);
		

	}

}
