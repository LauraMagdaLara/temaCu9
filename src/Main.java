
import java.time.Period;

public class Main {
    static void atribuieInversul(int inversVal){
        inversVal=-inversVal;
    }
    static void cresteVarsta(Persoana cresteVarstaPers){
         cresteVarstaPers.varsta++;
    }
    public static void main(String[] args) {
//2
        Persoana persoana1 = new Persoana("Cristina", 30);
        Persoana persoana2 = new Persoana("Andrei", 27);
        System.out.println("Afisam informatiile despre persoana1");
        persoana1.afiseazaInformatii();
        System.out.println("Afisam informatiile despre persoana2");
        persoana2.afiseazaInformatii();
//3
        Persoana persoana3 = persoana1;
        persoana3.varsta=25;
        persoana1.afiseazaInformatii();
        persoana3.afiseazaInformatii();
//4
        int Val=54;
        System.out.println(Val);
        atribuieInversul(Val);
        System.out.println(Val);
//7
        System.out.println(persoana1.varsta);
        cresteVarsta(persoana1);
        System.out.println(persoana1.varsta);
//8
        cresteVarsta(persoana1);
        System.out.println(persoana3.varsta);
        persoana1.afiseazaInformatii();
        persoana3.afiseazaInformatii();
//10
        System.out.println("Calculati produs dintre 3 si 8 este " + MathUtils.inmulteste(3,8));
        System.out.println("Calculati produs dintre 3.5 si 8 este " + MathUtils.inmulteste(3.5,8));
        System.out.println("Calculati produs dintre 3 si 8.6 este " + MathUtils.inmulteste(3,8.9));
        System.out.println("Calculati produs dintre 3, 8 si 12 este " + MathUtils.inmulteste(3,8,12));


    }
}
