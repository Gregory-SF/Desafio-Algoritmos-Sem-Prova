public class CalculoEstDiscAno {
    static int cont;
    static double media[] = new double[4];
    
    
    public static double[] calcMedia (int[][] notas){
        for (int a = 1; a < 5;a++){
            double soma = 0.0;
            cont = 0;
            for(int i = 0; i< notas.length; i++){
                soma += notas[i][a]; 
                cont += 1;
                }
            media[a-1] = soma / cont;
        }
        return media;
    }
    public static double[] calcDesv (int[][] notas){
        double desvio [] = new double [4]; 
        for (int b = 1; b < 5; b++) {
            desvio[b-1] = 0.0;
            for(int i= 0; i<notas.length; i++){
                desvio[b-1] += Math.pow((notas[i][b] - media[b-1]),2);
            }
            desvio[b-1] = Math.sqrt(desvio[b-1]/cont);
        }
        return desvio;
    }
}


