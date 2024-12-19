package informacao;

public class Laptop extends dispositivo {
    int memoriaRam;

    public Laptop(int memoriaRam, String marca, String modelo) {
        super(marca, modelo);
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void informacoes() {
        System.out.printf("Memoria Ram: %d GIBABYTS%n", memoriaRam);
    }

}
