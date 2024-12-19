package gerencia;

public class transporte {
    int capacidade;
    double velocidadeMaxima;

    public transporte(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    

    public void informacoes() {
        System.out.printf("Capacidade:%s%nVelocidadeMaxima: %s %n",capacidade, velocidadeMaxima);
    }

}
