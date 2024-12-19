public class Pessoa {
    //atributo classe pessoa privada
    private String nome;

   //metodo setter
   public void setNome(String nome){
      this.nome=nome;
   }
    //metodo getter
    public String getNome() {
        return nome;
    }
     // metodo main
     public static void main(String[] args) {
        //objeto
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lay");

        System.out.println("Nome da pessoa: "+ pessoa.getNome());

     }





}
