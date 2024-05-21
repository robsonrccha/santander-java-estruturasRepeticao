package robsonrccha.com.github;

import java.util.Scanner;

public class LacoDo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Exemplo de contar Carneirinhos
		for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
		
		
		/* 
		  FOR POSITION:
		
		  int carneirinhos = 1; -> O programa entende que a variável carneirinhos,
		  começa com o valor igual a 1 e isso acontece somente uma vez;
		  
		  carneirinhos < = 20; -> O programa verifica se a variável carneirinhos, ainda
		  é menor que 20;
		  
		  O programa começa a executar o algoritmo, no nosso caso, imprimir a
		  quantidade de carneirinhos em contagem;
		  
		  carneirinhos ++ -> O programa aumenta em mais 1, o valor da variável
		  carneirinhos;
		  
		  O fluxo é finalizado, quando a variável carneirinhos for igual a 20.
		 */
		
		

		sc.close();
	}

}
