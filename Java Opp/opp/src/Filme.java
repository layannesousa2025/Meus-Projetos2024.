public class Filme {
   String titulo;
   String ator;
   String diretor;
   String pessonagens;
   String locutor;

   public Filme(String titulo, String ator, String diretor, String pessonagens, String locutor) {
      this.titulo = titulo;
      this.ator = ator;
      this.diretor = diretor;
      this.pessonagens = pessonagens;
      this.locutor = locutor;
   }

   public String getTitulo() {
      return titulo;
   }

   public String getAtor() {
      return ator;
   }

   public String getDiretor() {
      return diretor;
   }

   public String getPessonagens() {
      return pessonagens;
   }

   public String getLocutor() {
      return locutor;
   }

   public static void main(String[] args) {
      Filme filme = new Filme("tom e jerry", "Joseph Barbera", "Joseph Barbera e William Hanna",
            "Thomas Jasper,Gerald Jinx", "Francisco Borges, Leda Figueiró");
      System.out.println("Titulo: " + filme.getTitulo());
      System.out.println("Ator : " + filme.getAtor());
      System.out.println("Diretor : " + filme.getDiretor());
      System.out.println("Pessonagens : " + filme.getPessonagens());
      System.out.println("Locutor: " + filme.getLocutor());

   }

}
