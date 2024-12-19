

import gerencia.*;

public class App6 {
  public static void main(String[] args) {
    
  
    Terrestre carro = new Terrestre("combustivel", 100, 1220);
     Aereo aviao = new Aereo(1000, 800, 12000);
     Maritimo navio = new Maritimo("aco", 55, 500);

     System.out.println("-----------------------------");
      carro.informacoes();

      System.out.println("-----------------------------");
       aviao.informacoes();
    
    System.out.println("-----------------------------");
      navio.informacoes();





}


}
