    public class Cidade {
        private String nome;
        private double populacao;
 
    
    public void setNome(String nome){
        this.nome = nome;
     }
     public void setPopulacao(double populacao){
        this.populacao = populacao;
     }

     public String getNome() {
          return nome;
     }
     public double getPopulacao() {
        return populacao;
    }
    public static void main(String[] args) {
        
        Cidade cidade = new Cidade();
        cidade.setNome("Brasilia");
        cidade.setPopulacao(4.93527);
        System.out.println("Nome da Cidade: "+ cidade.getPopulacao());
        System.out.println("Nome da pessoa: "+ cidade.getNome());



     }
    


}
