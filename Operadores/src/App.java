public class App {
    public static void main(String[] args) throws Exception {

        int number1 = 6;
        int number2 = 6;

        /*
         * O operador ternario funcionar como um if resumido.
         * ele usa a propria declaração da variavel para já determinar
         * se aquela operação é VERDADEIRA ou FALSA.
         * A sintaxe fica assim:
         */

        String resultado = number1 == number2 ? "Verdadeiro" : "Falso";

        System.out.println(resultado);
    }
}
