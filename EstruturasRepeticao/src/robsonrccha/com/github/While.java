package robsonrccha.com.github;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.##");
        double mesada = 50.0; // Convertendo a String para double

        while(mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce de valor R$ " + df.format(valorDoce) + " adicionado no carrinho"); // Formatar o valor do doce
            mesada = mesada - valorDoce;
        }
        System.out.println("\nMesada: " + df.format(mesada)); // Formatar o valor da mesada
        System.out.println("\nJoãozinho gastou toda a sua mesada em doces");

    }

}
