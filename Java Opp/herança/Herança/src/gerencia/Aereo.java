package gerencia;

public class Aereo extends transporte {
    double altitudeMaxima;

    public Aereo(double altitudeMaxima,int capacidade,double velocidadeMaxima){
        super(capacidade,velocidadeMaxima);
        this.altitudeMaxima=altitudeMaxima;
    }
      
      public double getaltitudeMaxima(){
        return altitudeMaxima;
      }
       public void setAltitudeMaxima(double altitudeMaxima){
          this.altitudeMaxima=altitudeMaxima;
       } 
        
       public void informacoes() {
        System.out.printf("altitude maxima:%s  %n", altitudeMaxima);
    }



}
