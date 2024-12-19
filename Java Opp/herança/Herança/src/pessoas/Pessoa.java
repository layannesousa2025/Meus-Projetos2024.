package pessoas;

//atributo
public class Pessoa {
   private String nome;
   private int idade;


   // construtor
  public Pessoa(String nome,int idade){
     this.nome = nome;
     this.idade = idade;
  }

   // metodo getter do atributo nome
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   // metodo getter do atributo iddade
   public int getIdade() {
      return idade;
   }

   public void setIdade(int idade) {
      this.idade = idade;
   }

   // metado para simular o ator de apresenatr do nome idade;
   public void apresentar(){
       System.out.printf("nome: %s, %nIdade: %d %n",nome, idade);
   }


}