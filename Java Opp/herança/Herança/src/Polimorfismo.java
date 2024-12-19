import animais.*;
public class Polimorfismo {
    
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro("Rex");
        animais[1] = new Gato("Mimi");
        animais[2] = new Cachorro("Max");
        
        for (Animal animal : animais) {

            animal.beber();
            
        
         }

}

}