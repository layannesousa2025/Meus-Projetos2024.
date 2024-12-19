
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class App2 {
    
    public static void main(String[] args) throws Exception {
         ContaCorrente corrente =new ContaCorrente("12564", 15000, 30);
           corrente.exibirDetalhes();
           

        ContaPoupanca poupanca =new ContaPoupanca(2.5, "123654", 2500);
          poupanca.exibirDetalhes();


}



}
