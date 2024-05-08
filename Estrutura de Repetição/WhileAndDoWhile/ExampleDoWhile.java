package WhileAndDoWhile;

import java.util.Random;

public class ExampleDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            // executa até que a condição de atender seja verdadeira
            System.out.println("Telefone tocando!");
        } while (tocando());

        System.out.println("Alôôô!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == (1);
        System.out.println("Atendeu? " + atendeu);
        // nega o ato de continuar tocando!
        return !atendeu;
    }
}
