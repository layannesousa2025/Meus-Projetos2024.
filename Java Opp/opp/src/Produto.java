public class Produto {
   
   public String nome;
   public double preco;
   public int quantidade;

   
   public Produto(String nome, double preco, int quantidade) {
       this.nome = nome;
       this.preco = preco;
       this.quantidade = quantidade;
   }


   public String getNome() {
       return nome;
   }

   public double getPreco() {
       return preco;
   }

   public int getQuantidade() {
       return quantidade;
   }


   public static void main(String[] args) {
      
       Produto produto = new Produto("Sapato", 50.00, 3);

       System.out.println("Nome: " + produto.getNome());
       System.out.println("Preço: " + produto.getPreco());
       System.out.println("Quantidade: " + produto.getQuantidade());
   }
}