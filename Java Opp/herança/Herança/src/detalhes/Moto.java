package detalhes;

public class Moto extends Veiculo {
   private int cilindradas;

    public Moto(String marca,int ano,int cilindradas){
           super(marca, ano);
           this.cilindradas=cilindradas;
    }

      public int getCilindradas(){
         return cilindradas;
      }
        
       public void setCilindradas(int cilindradas){
          this.cilindradas=cilindradas;
       }


      public void exibirDetalhes(){
        System.out.printf("%nCilindradas: %d",cilindradas);
      }




}
