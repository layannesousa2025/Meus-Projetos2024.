import conta.*;
import conta.ContaBancaria.*;
import conta.ContaPoupanca.*;
import conta.ContaCorrente.*;

public class polimofismo2{

    public static void main(String[] args) {
    ContaBancaria[]conta =new ContaBancaria[3];
    conta[0] = new ContaBancaria("6543-0", 1200);
    conta[1] = new ContaPoupanca("5339-7",100);
    conta[2] = new ContaPoupanca("4566-4",2000,120);

    for(ContaBancaria contaBancaria: conta){
        contaBancaria.exibirDetalhes();
    }
    
}

}