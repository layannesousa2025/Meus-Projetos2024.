public class Livro1{
    //Atributos
    String titulo;
    int numerodepaginas;

     //Construtor
   public Livro1(String titulo,int numerodepaginas){
         this.titulo=titulo;
         this.numerodepaginas=numerodepaginas;

         if (numerodepaginas <= 10) {
            System.out.println("numeros de paginas seja maior que 10: ");
      } 

   }
     //metodo getter e setter
      public String getTitulo(){
          return titulo;
      }
        public int getNumerodepaginas(){
            return numerodepaginas;
        }
         
        public void setTitulo(String titulo){
            this.titulo=titulo;
        }
          public void setNumerodepaginas( int numerodepaginas){
             this.numerodepaginas=numerodepaginas;

            }
            
            //metado main
            public static void main(String[] args) {
                Livro1 livro1 = new Livro1 ("java para iniciante",9);
                livro1.setTitulo("java para inciante");
                livro1.setNumerodepaginas(9);
                System.out.println("Nome do livro: " + livro1.getTitulo());
                System.out.println("Quantidade de paginas: " + livro1.getNumerodepaginas());

             }


}
