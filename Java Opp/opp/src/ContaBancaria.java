public class ContaBancaria {
    private double numero;
    private double saldo;

  //Contrutor
  public ContaBancaria(double numero,double saldo){
       this.numero= numero;
       this.saldo= saldo;
  }

  //metodo setter
  public void setNumero(double numero){
   this.numero = numero;

 }
public void setSaldo(double saldo){
   this.saldo = saldo;
 }

//metodo getter
public double getNumero() {
   return numero;
}
   public double getSaldo(){
       return saldo;
   }
    //metodo main
   public static void main(String[] args) {
       
          ContaBancaria contaBancaria = new ContaBancaria(20,1000);
          contaBancaria.setNumero(10);
          contaBancaria.setSaldo(500);

          System.out.println("Numero da conta: "+ contaBancaria.getNumero());
          System.out.println("Saldo da conta: "+contaBancaria.getSaldo());
 }
}
