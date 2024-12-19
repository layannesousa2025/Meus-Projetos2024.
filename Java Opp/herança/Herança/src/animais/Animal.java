package animais;

//definicao da classe animal
public class Animal {
  // atributo privado para armazenar o nome doanimal
  private String nome;

  // construtor da classe animal que inicializa o nome
  public Animal(String nome) {
    this.nome = nome;
  }

  // metodo para simular o ator de comer
  public void comer() {
    System.out.printf("%scomeu\n", nome);
  }

  // metodo para simular o ato de beber
  public void beber() {
    System.out.printf("%bebeu\n", nome);
  }

  // metodo getter para obter o nome do animal
  public String getNome() {
    return nome;
  }

  // metodo setter para definir o nome do animal
  public void setNome(String nome) {
    this.nome = nome;
  }

}
