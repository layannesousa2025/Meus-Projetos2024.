package pessoas;

public class Aluno extends Pessoa{
   private String curso;

   //construtor da classe aluno herdando nome e pessoa da classe pai criando
    public Aluno(String nome,int idade,String curso){
         super(nome, idade);
         this.curso = curso;
    }

      public void apresentar(){
         super.apresentar();
         System.out.printf("curso: %s %n",curso);
      }




}