package informacao;

public class Celular extends dispositivo {
    String sistemaOperacional;

    public Celular(String marca, String modelo, String sistemaOperacional) {
        super(marca, modelo);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void informacoes() {
        System.out.printf("Sistema operacional %s%n", sistemaOperacional);
    }

}
