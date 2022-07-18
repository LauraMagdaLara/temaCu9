package p1;

public class Admitere {

    private static double ultimaMedie = 8;
    private static int locuriTotale = 30, locuriOcupate = 25;



    public static boolean acceptaStudent(Student student) {
        if (locuriOcupate == locuriTotale)
            return false;
        else if (student.getMediaAdmitere() > ultimaMedie) {
            locuriOcupate++;
            //System.out.println("Studentul " + student.getNume() + " este admis");
            return true;
        }

        else
            //System.out.println("Studentul "+ student.getNume()+ " nu este admis");
        return false;

        }
    }
