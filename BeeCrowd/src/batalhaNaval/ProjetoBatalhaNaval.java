package batalhaNaval;

import java.util.Scanner;

public class ProjetoBatalhaNaval {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nomeUsuario;
		int opc, tiroLinha, tiroColuna, tentativas = 3;
		
		int A = 5, B = 5;
				
		int batalha[][] = new int[A][B];
		batalha[3][0] = 1;
		batalha[3][1] = 1;
		batalha[3][2] = 1;
	
		System.out.print("Para começar informe seu nome: ");
		nomeUsuario = scan.next();
		
		System.out.println("");
		System.out.println("*********** BEM VINDO(A) **********");
		System.out.println("********** BATALHA NAVAL **********\n");
		System.out.println("1 - Para jogar");
		System.out.println("2 - Sair\n");
		System.out.print("Opção: ");
		opc = scan.nextInt();
		System.out.println("\n\n\n");
		
		switch(opc) {
			case 1: {
				System.out.println("****************** NAVIO AO MAR ! ******************");
				System.out.println("VOCÊ ESTÁ NO MAR, ACERTE O NAVIO INIMIGO PARA VENCER\n\n");
				
				while (tentativas > 0) {		
						System.out.println(nomeUsuario + ", você tem " + tentativas + " tentativa(s)");
						
						System.out.println("Digite onde deseja atirar");
						System.out.print("Linha de 1 a 5: ");
						tiroLinha = scan.nextInt();
						tiroLinha -= 1;
						
						System.out.print("Coluna de 1 a 5: ");
						tiroColuna = scan.nextInt();
						System.out.println("\n");
						tiroColuna -= 1;
						
						if(tiroLinha >= 5 || tiroLinha < 0 || tiroColuna >= 5 || tiroColuna < 0) {
							tiroLinha = 0;
							tiroColuna = 0;
						}						
						if (batalha[tiroLinha][tiroColuna] == 1) {
							System.out.println("KABUUUUUUUUM !!!");
							System.out.println(nomeUsuario + " você afundou o navio adversário");
							System.out.println("Parabéns, você venceu !!!");
							break;
						}else if (batalha[tiroLinha][tiroColuna] == 0){
							System.out.println("SPLAAAASH !!!");
							System.out.println("Tiro ao mar\n");
							tentativas --;
						}
				}
				if (tentativas == 0) {
					System.out.println(nomeUsuario + ", você perdeu");;
					System.out.println("Mais sorte na próxima\n");
				}
			}
				
			case 2:{
				System.out.println("Obrigado " + nomeUsuario + " !");
				break;
			}	
		}
		scan.close();
	}
}
