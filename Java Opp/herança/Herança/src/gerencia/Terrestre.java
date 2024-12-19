package gerencia;

public class Terrestre extends transporte {
    String Tipocombustivel;

     public Terrestre(String Tipocombustivel,int capacidade,double velocidadeMaxima){
        super(capacidade,velocidadeMaxima);
        this.Tipocombustivel=Tipocombustivel;
     }
       
        public String getTipoCombustivel(){
            return Tipocombustivel;
        }
         public void setTipoCombustivel(String Tipocombustivel){
             this.Tipocombustivel=Tipocombustivel;
         }


         

     public void informacoes() {
        System.out.printf("Tipo de combustivel: %s %n", Tipocombustivel);
    }




}
