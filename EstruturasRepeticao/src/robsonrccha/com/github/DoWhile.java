package robsonrccha.com.github;

import java.util.Random;

public class DoWhile {

	public static void main(String[] args) {

		System.out.println("Discando...");

		do {
			// EXECUTANDO PELO MENOS 1X ANTES DE CONFERIR A CONDIÇÃO WHILE, REPETE ATE SER FALSE.
			System.out.println("Telefone tocando");

		} while (tocando()); // ENQUANTO FOR TRUE IRA DISCAR(CHAMAR/TOCAR) O TELEFONE

		System.out.println("Alô !!!");
	}

	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3) == 1;
		System.out.println("Atendeu? " + atendeu);// VERIFICA SE ATENDEU == 1 (TRUE)
		return !atendeu; // NEGA O VALOR BOOLEANO(DE TRUE PARA FALSE, DE FALSE PARA TRUE)
	}

}
