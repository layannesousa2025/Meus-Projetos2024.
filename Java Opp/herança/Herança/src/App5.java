

import informacao.Celular;
import informacao.Laptop;

public class App5 {
    public static void main(String[] args) throws Exception {
      Celular celular = new Celular("samsung","galaxy s21","android");
      Laptop laptop = new Laptop(4,"lenovo","intelcoreI3");
       
      System.out.printf("%nNome do celular:");
      celular.informacoes();
         
      System.out.printf("%nNome do laptop:");
      laptop.informacoes();

   }

   

}
