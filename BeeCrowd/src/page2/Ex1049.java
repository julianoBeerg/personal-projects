package page2;

import java.util.Scanner;

public class Ex1049 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String P1, P2, P3;

		P1 = scan.next();
		P2 = scan.next();
		P3 = scan.next();

		if (P1.contains("vertebrado") && P2.contains("ave")) {
			if (P3.contains("carnivoro")) {
				System.out.println("aguia");
			}
			if (P3.contains("onivoro")) {
				System.out.println("pomba");
			}
		}
		if (P1.contains("vertebrado") && P2.contains("mamifero")) {
			if (P3.contains("onivoro")) {
				System.out.println("homem");
			}
			if (P3.contains("herbivoro")) {
				System.out.println("vaca");
			}
		}
		if (P1.contains("invertebrado") && P2.contains("inseto")) {
			if (P3.contains("hematofago")) {
				System.out.println("pulga");
			}
			if (P3.contains("herbivoro")) {
				System.out.println("lagarta");
			}
		}
		if (P1.contains("invertebrado") && P2.contains("anelideo")) {
			if (P3.contains("hematofago")) {
				System.out.println("sanguessuga");
			}
			if (P3.contains("onivoro")) {
				System.out.println("minhoca");
			}
		}

		scan.close();
	}

}
