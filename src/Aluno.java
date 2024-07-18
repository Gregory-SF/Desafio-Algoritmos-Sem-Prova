import java.util.ArrayList;
import java.util.List;

public class Aluno{
    int id, ano;
    List<Integer> notas = new ArrayList<>();

    public Aluno(String dados) {
        String[] partes = dados.split(",");
        this.id = Integer.parseInt(partes[0]);
        for (int i = 1; i < partes.length - 1; i++) {
            this.notas.add(Integer.parseInt(partes[i]));
        }
        this.ano = Integer.parseInt(partes[partes.length - 1]);
    }

    public double calcularMedia(){
        return notas.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}