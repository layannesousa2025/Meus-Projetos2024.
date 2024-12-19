public class Carro {
    String marca;
    String modelo;
    String cor ;


// metado do carro
void acelerar(){
    System.out.println("o carro esta acelerando");
}

void frear(){
    System.out.println("o carro esta freando");
}

void virar(String direcao){
    System.out.println("o carro esta virando" + direcao +".");

   }
// metado principal para executar o programa

   public static void main(String[] args){

      Carro meuCarro = new Carro();
      meuCarro.cor="vermelho";
      meuCarro.modelo="sedan";
      meuCarro.marca="toyota";
   }



  
  }
    