package page3;

public class Ex1095 {

	public static void main(String[] args) {
		
		for (int J = 60; J >= 0;) {
			for (int I = 1; J >= 0;) {
				System.out.println("i = " + I + " J = " + J);

				J = J - 5;
				I = I + 3;
			}
		}

	}

}
