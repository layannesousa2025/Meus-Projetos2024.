public class Nadador {
    public String nome;
    public int idade;

    public Nadador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        Nadador nadador = new Nadador("lay", 20);
        System.out.println("Nome: " + nadador.getNome());
        System.out.println("Idade: " + nadador.getIdade());
    }

}
