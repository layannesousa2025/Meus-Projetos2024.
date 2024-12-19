package conta;

public class ContaCorrente extends ContaBancaria{
    double limite;

    public ContaCorrente(String numero, double saldo, double limite){
        super(numero,saldo);
        this.limite = limite;
       
     }


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf("%nO limite é: %2f",limite);
    }


}
