package robsonrccha.com.github;

public class ForArrays {

	public static void main(String[] args) {
		
		//Também usamos o controle de fluxo for, para interagir sobre arrays e coleções:
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

		for (int indice = 0; indice < alunos.length; indice++) {
			
			System.out.println("O aluno no indice " + indice + " é o(a) " + alunos[indice]);
		}
		
		System.out.println("\n");
		
		// FOR EACH
		
		/* 
		 * O uso do 
		 * for / each está fortemente relacionado, com um cenário onde contenha um array ou coleção, e assim,
		 * a interação é baseada nos elementos da coleção.
		 */
		
		for(String aluno : alunos) { // String aluno : alunos -> De forma abreviada, é criada uma variável nome obtendo um elemento do vetor a cada ocorrência; 
			  
			System.out.println(aluno); // A impressão de cada aluno é realizada.
			}

	}

}
