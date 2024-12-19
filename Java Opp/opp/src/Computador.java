public class Computador {
    public String teclado;
    public String mause;
    public String gabinete;
    public String monitor;

    public Computador(String teclado, String mause, String gabinete, String monitor) {
        this.teclado = teclado;
        this.mause = mause;
        this.gabinete = gabinete;
        this.monitor = gabinete;
    }

    public String getTeclado() {
        return teclado;
    }

    public String getMause() {
        return mause;
    }

    public String getGabinete() {
        return gabinete;
    }

    public String getMonitor() {
        return monitor;
    }

    public static void main(String[] args) {
        Computador computador = new Computador("alienware", "mause", "gabinete", "monitor");
        System.out.println("Teclado: " + computador.getTeclado());
        System.out.println("Mouse: " + computador.getMause());
        System.out.println("Gabinete: " + computador.getGabinete());
        System.out.println("Monitor: " + computador.getMonitor());
    }
}
