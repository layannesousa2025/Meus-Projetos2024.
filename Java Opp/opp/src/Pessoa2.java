public class Pessoa2 {
  // atributo classe pessoa privada
  public String nome;
  public int idade;

  // construtor
  public Pessoa2(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;

  }

  // metodo getter e setter
  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setIdade(int idade) {
    if (idade >= 18) {
      this.idade = idade;
      System.out.println("voce maior de idade: ");
    } else {
      this.idade = idade;
      System.out.println("voce não é maior de idade: ");
    }
  }

  // metodo main
  public static void main(String[] args) {
    Pessoa2 pessoa2 = new Pessoa2("Lay", 20);
    // objeto
    pessoa2.setNome("Lay");
    pessoa2.setIdade(20);
    System.out.println("Nome: " + pessoa2.getNome());
    System.out.println("idade: " + pessoa2.getIdade());
  }

}
