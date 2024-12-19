package informacao;

public class dispositivo {
    String marca;
    String modelo;

    public dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void informacoes() {
        System.out.printf("Marca:%s%nModelo: %s %n", modelo, marca);
    }


}
