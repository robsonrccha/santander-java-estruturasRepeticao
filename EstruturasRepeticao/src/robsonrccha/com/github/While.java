package robsonrccha.com.github;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    
	//METODO PARA DETERMINAR VALORES DOS DOCES
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.##"); //FORMATACAO DO VALOR DOUBLE EM DUAS CASAS DECIMAIS
        double mesada = 50;

        while(mesada > 0) {
            double valorDoce = valorAleatorio(); //ATRIBUIÇÃO DO METODO AO VALOR DO DOCE
            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Valor da mesada atual R$ " + df.format(mesada));

            System.out.println("\nDoce de valor R$ " + df.format(valorDoce) + " adicionado no carrinho"); // Formatar o valor do doce
            mesada -= valorDoce;
        }
        System.out.println("\nMesada: " + df.format(mesada)); // Formatar o valor da mesada
        System.out.println("\nJoãozinho gastou toda a sua mesada em doces");

    }

}
