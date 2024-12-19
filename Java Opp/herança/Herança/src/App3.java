import animais.Cachorro;
import animais.Gato;

public class App3 {
    public static void main(String[] args) throws Exception {
         Cachorro cachorro = new Cachorro("bob");
         cachorro.beber();
         cachorro.comer();
         cachorro.latir();
         cachorro.lamber();

         Gato gato = new Gato("Pepi");
         gato.comer(); 
         gato.beber(); 
         gato.miar();
        


}


}