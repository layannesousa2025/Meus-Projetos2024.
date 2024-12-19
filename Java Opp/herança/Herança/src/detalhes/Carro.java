package detalhes;

public class Carro extends Veiculo {
    int numPortas;

  public Carro(String marca,int ano,int numPortas){
    super(marca,ano);
    this.numPortas=numPortas;
  }

   public int getNumpPostas(){
      return numPortas;
   }
     
     public void setNumPostas(int numPortas){
        this.numPortas=numPortas;
     }
   

   public void detalhes(){
    super.exibirDetalhes();
   System.out.printf("%nNumero de postas %s :",numPortas);
}


}
