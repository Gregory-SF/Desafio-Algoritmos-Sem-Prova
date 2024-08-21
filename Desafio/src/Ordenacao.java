public class Ordenacao {
    public static double[][] ordemCrescenteMedia(double[][] valores) {
        boolean troca = false;
        do {
            troca = false;
            for(int x=0; x<valores.length-1; x++) {
                double valor[] = valores[x];
                if(valor[6] > valores[x+1][6]) {
                    valores[x] = valores[x+1];
                    valores[x+1] = valor;
                    troca = true;
                }
            }
        } while (troca);
        return valores;
}

    public static double[][] ordemCrescenteAno(double[][] valores) {
        boolean troca = false;
        do {
            troca = false;
            for(int x=0; x<valores.length-1; x++) {
                double valor[] = valores[x];
                if(valor[5] > valores[x+1][5]) {
                    valores[x] = valores[x+1];
                    valores[x+1] = valor;
                    troca = true;
                }
            }
        } while (troca);
        return valores;
    }
}