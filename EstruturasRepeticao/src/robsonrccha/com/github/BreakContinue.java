package robsonrccha.com.github;

public class BreakContinue {

	public static void main(String[] args) {

		for(int numero = 1; numero <= 5; numero ++){
			if(numero == 3)
				break;  // O break interrompe o fluxo qndo a condicao for atendida e sai do laco
			
			System.out.println(numero);	
		}
		
		System.out.println("\n");
		
		for(int numero = 1; numero <=5; numero ++){
			if(numero == 3)
				continue; // O continue pula a condicao qndo for atendida e continua o fluxo ate o fim.
			
			System.out.println(numero);
			
		}
	}

}
