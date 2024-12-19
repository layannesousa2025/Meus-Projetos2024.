
import pessoas.Aluno;
import pessoas.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        // objeto da classe cachorro

        Aluno aluno = new Aluno("bruna", 30, "Portugues");
        aluno.apresentar();

        Professor professor = new Professor("joao", 30, "java");
        professor.apresentar();

    }
}
