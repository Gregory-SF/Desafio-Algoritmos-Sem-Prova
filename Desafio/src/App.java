import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws IOException {
        long tempoInicial = System.currentTimeMillis();
        // String path = "src/teste.txt";
        // Scanner t = new Scanner(path);
        // BufferedReader br = new BufferedReader(new FileReader(path)); //bufferedreader pra ler mais rápido
        // String linhaLida = br.readLine(); // readLine lê uma linha de texto completa 
        // while(linhaLida != null) { // se não tiver mais linhas a serem lidas, o retorno é null
        //     String dados[] = linhaLida.split(";");
        //     System.out.println(linhaLida);
        //     linhaLida = br.readLine();
        // }
        // br.close(); // fechando o buffer
        double [] [] nsei = {{1,36,13,4,70,2016},
        {2,67,27,82,65,2009},
        {3,74,95,83,70,2023},
        {4,22,14,3,16,2008},
        {5,0,14,1,16,2022},
        {6,15,38,60,24,2005},
        {7,25,90,6,39,2016},
        {8,51,94,15,16,2009},
        {9,12,83,97,12,2019},
        {10,82,74,29,97,2012}
    };
    double[] mediaa = CalculoAluno.calcMediaAluno(nsei);
    System.out.println(nsei[0].length);
        for (int j = 0; j < nsei.length; j++) {
            nsei[j] = Arrays.copyOf(nsei[j], 7);
            nsei[j][nsei[j].length - 1] = mediaa[j]; // Assign 40 to the last element
        }
        for (int i = 0; i < nsei.length; i++) {
            System.out.println(Arrays.toString(nsei[i]));
        }
        Ordenacao.ordemCrescenteMedia(nsei);
        System.out.println("cls");
        for (int i = 0; i < nsei.length; i++) {
            System.out.println(Arrays.toString(nsei[i]));
        }
        System.out.println("*******************************");
        Ordenacao.ordemCrescenteAno(nsei);
        System.out.println("cls");
        for (int i = 0; i < nsei.length; i++) {
            System.out.println(Arrays.toString(nsei[i]));
        }
        long tempoFinal = System.currentTimeMillis();
        System.out.println( tempoFinal - tempoInicial );
    }
}