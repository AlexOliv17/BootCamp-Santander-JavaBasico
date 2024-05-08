package WhileAndDoWhile;

import java.util.concurrent.ThreadLocalRandom;

public class ExampleWhile {
    public static void main(String[] args) {
        int mesada = 50;
        while (mesada > 0) {
            int valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Mesada: R$" + mesada);
            System.out.println("Doce adicionado ao carrinho do valor de: R$" + valorDoce);
            mesada = mesada - valorDoce;
            // }
        }
        System.out.println("Mesada: R$" + mesada);
        System.out.println("\n" + "Você gastou todo seu dinheiro com doces, vá escovar os dentes garoto!" + "\n");
    }

    private static int valorAleatorio() {
        return ThreadLocalRandom.current().nextInt(2, 8);
    }
}