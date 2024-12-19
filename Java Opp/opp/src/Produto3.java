public class Produto3 {
    // atributo
    private String nome;
    private int quantidade;

    // construtor
    public Produto3(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // metodo getter e setter
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // metodo main
    public static void main(String[] args) {
              Produto3 produto3 = new Produto3("caixa de bombom",5);
                  //objeto              
                produto3.setNome("caixa de bombom");
                produto3.setQuantidade(5);
              System.out.println("Nome do Produto: " + produto3.getNome());
              System.out.println("Quantidade: " + produto3.getQuantidade());

          }

}
