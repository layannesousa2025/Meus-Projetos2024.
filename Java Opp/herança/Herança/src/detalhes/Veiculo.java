package detalhes;

public class Veiculo {
    String marca;
    int ano;

    public Veiculo(String marca,int ano){
        this.marca=marca;
        this.ano=ano;
    }

      public String getMarca(){
            return marca;
      }
        public void setMarca(String marca){
            this.marca = marca;
        }
         
        public int getAno(){
            return ano;
        }

         public void setAno(int ano){
            this.ano = ano;
         }

         public void exibirDetalhes(){
            System.out.printf("%nNome da Marca: %s %nAno do Carro:",marca,ano);
         }

}
