public class Livro {
  String titulo;
  String autor;
  String paginas;
  String blibliografia;

  public Livro(String titulo, String autor, String paginas, String blibliografia) {
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    this.blibliografia = blibliografia;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public String getPaginas() {
    return paginas;
  }

  public String getBlibliografia() {
    return blibliografia;
  }

  public static void main(String[] args) {
    Livro livro = new Livro("Looney Tunes", "Leon Schlesinger:", "paginas", "blibliografia");
    System.out.println("Titulo: " + livro.getTitulo());
    System.out.println("Autor: " + livro.getAutor());
    System.out.println("Paginas: " + livro.getPaginas());
    System.out.println("blibliografia: " + livro.getBlibliografia());

  }

}
