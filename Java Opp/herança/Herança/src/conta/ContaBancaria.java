package conta;

public class ContaBancaria {
    private String numero;
    private double saldo;

    public ContaBancaria(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirDetalhes() {
        System.out.printf("%nNumero da Conta: %s %nSaldo da conta:%.2f", numero, saldo);
    }

    
}
