public class CalculoAluno {
    static int cont = 10;
    static double[] mediaA = new double[cont];
    static String [] situacaoA = new String [cont];
    
    public static double[] calcMediaAluno (double[][] notas){
        for (int a = 0; a < cont;a++){
            double soma = 0.0;
            for(int i = 1; i< 5; i++){
                soma += notas[a][i]; 
                }
            mediaA[a] = soma / 4;
        }
        return mediaA; // retorna 10 valres
    }

    // public static double[] calcDesv (int[][] notas){
    //     double desvio [] = new double [cont]; 
    //     for (int b = 0; b < cont; b++) {
    //         desvio[b] = 0.0;
    //         for(int i= 1; i<5; i++){
    //             desvio[b] += Math.pow((notas[b][i] - mediaA[b]),2);
    //         }
    //         desvio[b] = Math.sqrt(desvio[b]/4);
    //     }
    //     return desvio;
    // }
        public static String[] aprovOuReprovAluno(){
            situacaoA = new String[cont];
            for (int i = 0; i < mediaA.length; i++) {
                    switch (Double.compare(mediaA[i], 70.0)){
                        case -1:
                            situacaoA[i] = "Reprovado";
                            break;
                        default:
                            situacaoA[i] = "Aprovado";
                    }
                }    
            return situacaoA;
        }
}
