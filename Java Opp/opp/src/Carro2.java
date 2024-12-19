public class Carro2 {
 public String marca;
 public String modelo;
 public String cor;

  public Carro2(String marca, String modelo, String cor) {
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public String getCor() {
    return cor;
  }

  public static void main(String[] args) {
    Carro2 carro = new Carro2("Honda", "fiat", "vermelhor");
    System.out.println("marca: " + carro.getMarca());
    System.out.println("modelo" + carro.getModelo());
    System.out.println("cor" + carro.getCor());
  }
}
