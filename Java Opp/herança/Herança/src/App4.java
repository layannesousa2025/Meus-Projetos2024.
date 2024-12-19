

import detalhes.Carro;
import detalhes.Moto;

public class App4 {
    
    public static void main(String[] args) throws Exception {
            Carro carro = new Carro("Gol", 2016, 4);
            System.out.printf("%ndetalhes do Carro:");
            carro.exibirDetalhes();



             Moto moto = new Moto("yamara", 2009, 250);
             System.out.printf("%nDetalhes da Moto: ");
             moto.exibirDetalhes();

    }
      


}
