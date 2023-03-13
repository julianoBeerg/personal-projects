import java.util.Scanner;

public class batalhaNaval {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nomeUsuario;
		int opcao, tiroLinha, tiroColuna, tentativas = 3, linha = 5, coluna = 5;

		int batalha[][] = new int[linha][coluna];
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
		opcao = scan.nextInt();
		System.out.println("\n\n\n");

		switch (opcao) {
		case 1: {
			System.out.println("****************** NAVIO AO MAR ! ******************");
			System.out.println("VOCÊ ESTÁ NO MAR, ACERTE O NAVIO INIMIGO PARA VENCER\n\n");

			while (tentativas > 0) {
				System.out.println(nomeUsuario + ", você tem " + tentativas + " tentativa(s)");

				System.out.println("Digite onde deseja atirar");
				System.out.print("Linha de 0 a 4: ");
				tiroLinha = scan.nextInt();

				System.out.print("Coluna de 0 a 4: ");
				tiroColuna = scan.nextInt();
				System.out.println("\n");

				if (tiroLinha >= 5 || tiroLinha < 0 || tiroColuna >= 5 || tiroColuna < 0) {
					tiroLinha = 0;
					tiroColuna = 0;
				}
				if (batalha[tiroLinha][tiroColuna] == 1) {
					System.out.println("KABUUUUUUUUM !!!");
					System.out.println(nomeUsuario + " você afundou o navio adversário");
					System.out.println("Parabéns, você venceu !!!");

				} else if (batalha[tiroLinha][tiroColuna] == 0) {
					System.out.println("SPLAAAASH !!!");
					System.out.println("Tiro ao mar\n");
					tentativas--;
				}
			}

			if (tentativas == 0) {
				System.out.println(nomeUsuario + ", você perdeu");

				System.out.println("Mais sorte na próxima\n");
				break;

			}
		}
		case 2: {
			System.out.println("Obrigado " + nomeUsuario + " !");
			break;
		}
		}
	}
	
	public static void menu() {
		
		
	}
}

