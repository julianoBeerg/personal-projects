package page1;

import java.util.Scanner;

public class Ex1010 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
		
		int  NUM1;
		int  NUM2;
		double VU1, VU2, TOTAL;
		
		
		NUM1 = scan.nextInt();
		VU1 = scan.nextDouble();
		
		
		NUM2 = scan.nextInt();
		VU2 = scan.nextDouble();
		
		VU1 = VU1 * NUM1;
		VU2 = VU2 * NUM2;
		
	    TOTAL = VU1 + VU2;
	    
	    System.out.printf("VALOR A PAGAR: R$ %.2f\n", TOTAL);
	   
	    scan.close();
	}

}
