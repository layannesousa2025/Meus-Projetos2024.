public class Curso {
    // atributos da classe
    private String nome;
    private String duracao;

    // metodos getters/etter para ver modificar os atributos
    public String getNome() {
        return nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    // metodo main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {
        // criando um objeto da classe definindo os valores dos atributos
        Curso curso = new Curso();
        curso.setNome("java");
        curso.setDuracao("48h");
        // exibindo os valores dos atributos do objeto
        System.out.println("Nome do curso: " + curso.getNome());
        System.out.println("Duracao do curso: " + curso.getDuracao());

    }

}
