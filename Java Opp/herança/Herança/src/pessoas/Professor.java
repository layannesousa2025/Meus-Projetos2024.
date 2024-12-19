package pessoas;

public class Professor extends Pessoa {
   private String disciplina;

   public Professor(String nome, int idade, String disciplina) {
      super(nome, idade);
      this.disciplina = disciplina;
   }

   public void apresenatar() {
      super.apresentar();
      System.out.printf("disciplina: %s %n", disciplina);
   }

   public String getDisciplica() {
      return disciplina;
   }

   public void setDisciplina(String disciplina) {
      this.disciplina = disciplina;
   }

   
   }


