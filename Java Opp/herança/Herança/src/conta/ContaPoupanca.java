package conta;

public class ContaPoupanca extends ContaBancaria {
    double taxajuros;
    
    

    public ContaPoupanca(double taxajuros,String numero, double saldo){
        super(numero,saldo);
        this.taxajuros=taxajuros;
    }
      
   
   public double Taxajuros() {
        return taxajuros;
    }

    public void setTaxajuros(double taxajuros) {
        this.taxajuros = taxajuros;
    }


 public void exibirDetalhes() {
    super.exibirDetalhes();
        System.out.printf("%nA taxa de juros é: %2f ",taxajuros);
    }





}
