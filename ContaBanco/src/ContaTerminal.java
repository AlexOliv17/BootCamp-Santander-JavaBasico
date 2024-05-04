import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner:
        Scanner leDados = new Scanner(System.in);

        // Exibir as mensagens para o usuario e leitura dos dados:

        System.out.println("Digite o numero do cartao:");
        int numeroCartao = leDados.nextInt();

        System.out.println("Digite a sua agência:");
        String agencia = leDados.next();

        System.out.println("Digite o nome impresso no cartao:");
        String nomeCliente = leDados.next();

        // Printar as respostas
        System.out.println("Numero do cartao: " + numeroCartao);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
    }
}