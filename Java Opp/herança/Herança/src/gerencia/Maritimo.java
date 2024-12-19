package gerencia;

public class Maritimo extends transporte{
    String TipoCasco;

   public Maritimo(String TipoCasco,int capacidade,double velocidadeMaxima){
        super(capacidade, velocidadeMaxima);
        this.TipoCasco = TipoCasco;
   }

     public String getTipoCasco(){
         return TipoCasco;
     }
       public void setTipocasco(String TipoCasco){
            this.TipoCasco=TipoCasco;
       }
 
        
       public void informacoes() {
        System.out.printf("Tipo de Casco: %s %n", TipoCasco);
    }




}
