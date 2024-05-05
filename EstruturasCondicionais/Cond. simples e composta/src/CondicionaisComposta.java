public class CondicionaisComposta {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Parabens!!! voce foi aprovado.");
        } else if (nota == 6) {
            System.out.println("Fará uma pesquisa de recuperação.");
        } else {
            System.out.println("Reprovado! Tente novamente mais tarde...");
        }
    }
}
