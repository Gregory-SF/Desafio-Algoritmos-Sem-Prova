import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\conta\\IdeaProjects\\VideoLerCriarDeletarTXT\\src\\dados-exemplo.txt");

        List<String> dadosAlunos = Files.readAllLines(path);

        List<Aluno> alunos = new ArrayList<>();
        for (String dados : dadosAlunos) {
            Aluno aluno = new Aluno(dados);
            alunos.add(aluno);
        }

        Estatisticas estatisticas = new Estatisticas();
        estatisticas.calcularMaiorMenorMedia(alunos);
        estatisticas.classificarAlunosPorDisciplina(alunos);
        estatisticas.classificarAlunosPorResultado(alunos);
        estatisticas.calcularMediaMedianaDesvioGeral(alunos);
        estatisticas.calcularMediaMedianaDesvioPorAno(alunos);
    }
}