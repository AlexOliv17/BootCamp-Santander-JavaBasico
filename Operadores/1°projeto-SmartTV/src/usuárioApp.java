public class usuárioApp {
    public static void main(String[] args) {
        smartTv smartTv = new smartTv();

        // Tv no estado inicial
        System.out.println(" \n" + "- Estado atual da Tv:" + " \n");
        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume + " \n");

        // Ligando e realizando testes/impressões.
        smartTv.ligar();

        System.out.println("A Tv está ligada? " + smartTv.ligada + " \n");

        // Realizando testes de subir e descer volume.
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println(" \n" + "Volume: " + smartTv.volume + " \n");
        System.out.println("Diminuição do volume para teste!" + " \n");

        smartTv.diminuirVolume();
        System.out.println(" \n" + "Volume: " + smartTv.volume);

        // Impressão do estado da Tv.
        System.out.println(" \n" + "- Estado atual da Tv:" + " \n");
        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume + " \n");

        // Realizando teste de subir e descer canal.
        smartTv.canalUp();
        System.out.println("Canal: " + smartTv.canal + " \n");

        System.out.println("Descendo canal, a fim de testes!" + " \n");

        smartTv.canalDown();
        System.out.println("Canal: " + smartTv.canal + " \n");
        smartTv.canalDown();

        // Impressão do estado da Tv.
        System.out.println(" \n" + "- Estado atual da Tv:" + " \n");
        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume + " \n");
    }
}
