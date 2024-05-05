public class smartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar() {
        ligada = true;
        System.out.println("Ligando tv...");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando tv...");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume...");
        volume++;
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume...");
        volume--;
    }

    public void canalUp() {
        System.out.println("Subindo canal...");
        canal++;
    }

    public void canalDown() {
        if (canal > 1) {
            System.out.println("Diminuindo canal...");
            canal--;
        } else {
            System.out.println("Diminuindo canal..." + " \n");
            System.out.println("Já está no canal 1!");
        }

    }
}
