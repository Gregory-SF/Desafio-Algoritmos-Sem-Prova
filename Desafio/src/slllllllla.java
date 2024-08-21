import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.lang.Double;
public class slllllllla {
        CalculoAluno a = new CalculoAluno();
        Teste slllllllla.teste = new Teste(01, 01, 01, 01, 10, 10);
        public void S(String[] args) {
            ArrayList<Teste> teste = new ArrayList<>();
            teste.add(new Teste(1,36,13,4,70,2016));
            teste.add(new Teste(2,67,27,82,65,2009));
            teste.add(new Teste(3,74,95,83,70,2023));
            teste.add(new Teste(4,22,14,3,16,2008));
            teste.add(new Teste(5,0,14,1,16,2022));
            teste.add(new Teste(6,15,38,60,24,2005));
            teste.add(new Teste(7,25,90,6,39,2016));
            teste.add(new Teste(8,51,94,15,16,2009));
            teste.add(new Teste(9,12,83,97,12,2019));
            teste.add(new Teste(10,82,74,29,97,2012));
            
            Collections.sort(teste,new Teste.TesteComparator());
            System.out.println("Sorted List: " + teste);
        }
    
    class Teste {
        private int id;
        private int nota1;
        private int nota2;
        private int nota3;
        private int nota4;
        private int ano;
        
        public Teste(int id, int nota1, int nota2, int nota3, int nota4, int ano) {
            this.id = id;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            this.nota4 = nota4;
            this.ano = ano;
        }
        
        
        
        
        public int getId() {
            return id;
        }
        
        
        public int getNota1() {
            return nota1;
        }
        
        
        public int getNota2() {
            return nota2;
        }
        
        
        public int getNota3() {
            return nota3;
        }
        
        
        public int getNota4() {
            return nota4;
        }
        
        
        public int getAno() {
            return ano;
        }

    
    class TesteComparator implements java.util.Comparator<Teste> {
        @Override
        public int compare(Teste a, Teste b) {
            return a.getAno() - b.getAno();
        }
    }
}
}