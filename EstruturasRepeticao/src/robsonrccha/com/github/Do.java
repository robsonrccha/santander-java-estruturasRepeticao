package robsonrccha.com.github;

import java.util.Scanner;

public class Do {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Exemplo de contar Carneirinhos
		for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
			System.out.println("\n" + carneirinhos + " - Carneirinho(s)");
		}

		/*
		 * FOR POSITION:
		 * 
		 * int carneirinhos = 1; -> O programa entende que a variável carneirinhos,
		 * começa com o valor igual a 1 e isso acontece somente uma vez;
		 * 
		 * carneirinhos < = 20; -> O programa verifica se a variável carneirinhos, ainda
		 * é menor que 20;
		 * 
		 * O programa começa a executar o algoritmo, no nosso caso, imprimir a
		 * quantidade de carneirinhos em contagem;
		 * 
		 * carneirinhos ++ -> O programa aumenta em mais 1, o valor da variável
		 * carneirinhos;
		 * 
		 * O fluxo é finalizado, quando a variável carneirinhos for igual a 20.
		 */
		
		
		//estrutura 2
		//o que importa é somente o bloco condicional
		System.out.println("\nDiga ate quantos carneirinhos para pegar no sono?");
		int carneirinhos = sc.nextInt();
		int qtdCarneirinhos = 1;
		
		for (; qtdCarneirinhos <= carneirinhos;) { // a variavelpode ser colocada fora do laço FOR
            System.out.println("\n" + qtdCarneirinhos + " - Carneirinho(s)");
            qtdCarneirinhos++; // o incremento deve estar dentro do bloco de codigo
		}
		
		System.out.println("\nBons sonhos zzZ");
		
		sc.close();
		
		}
}
