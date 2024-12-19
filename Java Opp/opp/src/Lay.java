public class Lay {
    // atributo
    private String nome;
    private int idade;
    private String profissao;
    private String endereco;
    private String telefone;
    private String email;
    private String carro;
    private int salario;

    public Lay(String nome, int idade, String profissao, String enderecao, String telefone, String email,
            String carro, int salario) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.endereco = enderecao;
        this.telefone = telefone;
        this.email = email;
        this.carro = carro;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCarro() {
        return carro;
    }

    public int getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setEnderecao(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
        Lay lay = new Lay("Lay", 20, "programadora", "brasilia", "5555", "lay.@gmail.com", "gol", 1500);
        lay.setNome("Lay");
        lay.setIdade(20);
        lay.setProfissao("Programadora");
        lay.setEnderecao("Brasilia");
        lay.setTelefone("55555");
        lay.setEmail("lay.@gmail.com");
        lay.setCarro("Gol");
        lay.setSalario(5000);



        System.out.println("Nome: " + lay.getNome());
        System.out.println("idade: " + lay.getIdade());
        System.out.println("profissao: " + lay.getProfissao());
        System.out.println("endereco: " + lay.getEndereco());
        System.out.println("telefone: " + lay.getTelefone());
        System.out.println("email: " + lay.getEmail());
        System.out.println("carro: " + lay.getCarro());
        System.out.println("Salario: " + lay.getSalario());

    }

}
