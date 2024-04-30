public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6) {
            System.out.println("Reprovado, estude mais!");
        } else if (mediaFinal == 6) {
            System.out.println("Fara um trabalho avaliativo!");
        } else {
            System.out.println("Parabéns, você foi aprovado!!!");
        }
    }
}
