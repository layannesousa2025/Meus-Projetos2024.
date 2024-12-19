public class Funcionario {
  private String nome;
  private double salario;

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setNome(String nome) {
    this.nome = nome;

  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public static void main(String[] args) {

    Funcionario funcionario = new Funcionario();
    funcionario.setNome("Lay");
    funcionario.setSalario(5000);

    System.out.println("Nome do Funcionario: " + funcionario.getNome());
    System.out.println("Quanto Salario o cliente Quanha: " + funcionario.getSalario());
  }

}
