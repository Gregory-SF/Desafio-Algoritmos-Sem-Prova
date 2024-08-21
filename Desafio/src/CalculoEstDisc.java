import java.lang.Math;
public class CalculoEstDisc {
    static int cont;
    static double[] mediaD = new double[4];
    static String [][] situacao = new String[cont][4];
    
    
    public static double[] calcMediaDisc (int[][] notas){
        for (int a = 1; a < 5;a++){
            double soma = 0.0;
            cont = 0;
            for(int i = 0; i< notas.length; i++){
                soma += notas[i][a]; 
                cont += 1;
                }
            mediaD[a-1] = soma / cont;
        }
        return mediaD; //retorna 4 numeros
    }
    public static double[] calcDesvDisc (int[][] notas){
        double desvio [] = new double [4]; 
        for (int b = 1; b < 5; b++) {
            desvio[b-1] = 0.0;
            for(int i= 0; i<notas.length; i++){
                desvio[b-1] += Math.pow((notas[i][b] - mediaD[b-1]),2);
            }
            desvio[b-1] = Math.sqrt(desvio[b-1]/cont);
        }
        return desvio; //retorna 4 numeros
    }

    public static String[][] aprovOuReprov(int[][] notas){
        situacao = new String [cont][4];
        for (int i = 0; i < notas.length; i++) {
            for (int h = 1; h < 5; h++) {
                switch (Double.compare(notas[i][h], 70.0)){
                    case -1:
                        situacao[i][h-1] = "Reprovado";
                        break;
                    default:
                        situacao[i][h-1] = "Aprovado";
                }
            }    
        }
        return situacao; // retorna uma matriz de 10 por 4
    }
    public static int[] contAlunoReprovadoDisc(){

        int[] soma = new int [4]; 
        for (int a = 0; a < mediaD.length; a++) {
            for (int i = 0; i < cont; i++) {
                if(situacao[i][a] == "Reprovado"){
                    soma[a]+=1;
                } 
            }
        }
        return soma; // retorna número de reprovado
    }
}
