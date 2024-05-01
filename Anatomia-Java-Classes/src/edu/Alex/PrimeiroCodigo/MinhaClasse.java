package edu.Alex.PrimeiroCodigo;

public class MinhaClasse {
    public static void main(String[] args) {

        /*
         * quando declaramos uma variável com todas letras
         * maiusculas é porque ela nunca poderá mudar de valor
         * por exemplo a variavel PI:
         */
        double PI = 3.16;

        /*
         * Já quando falamos de variaveis com letras minusculas,
         * ai sim podemos considerar a mudança de valor nelas
         * exemplo a variavel ano:
         */
        int ano = 2024;
        ano = 2025;

        /*
         * A variaveis só podem ser declaradas iniciando com letras
         * minusculas, _ (underline) , $.
         * Sempre que a variavel tiver mais de uma palavra a 1° deve
         * começar com letra minuscula e a 1° letra das palavras seguintes
         * maiusculas.
         * alguns exemplos:
         */
        int minhaIdade = 22;
        String nome = "Alex";
        String _sobrenome = "Oliveira";
        double $saldoBancario = 921.46;

        /* Chamada do Método nomeCompleto: */
        String nomeCompleto = nomeCompleto(nome, _sobrenome);
        System.out.println(nomeCompleto);
    }

    /*
     * Métodos são "funções" que realizam específicas tarefas ou um conjunto
     * de instruções passadas dentro desse escopo:
     */
    public static String nomeCompleto(String nome, String _sobrenome) {
        return nome.concat(" ").concat(_sobrenome);
    }
}
