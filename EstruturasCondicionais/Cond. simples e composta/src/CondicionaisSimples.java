public class CondicionaisSimples {
    public static void main(String[] args) {
        double valor = 25;
        double valorSolicitado = 26;

        if (valorSolicitado <= valor) {
            valor = valor - valorSolicitado;
            System.out.println("Saque no valor de R$" + valorSolicitado + " feito com sucesso!");

        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo atual é de R$" + valor);
    }
}
