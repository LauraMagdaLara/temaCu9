package p2;

import p1.Admitere;
import p1.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(9.5);
        Student student2 = new Student(6);
        Student student3 = new Student(7.5);
        Student[] clasa = {student1, student2, student3};
        for (Student elem : clasa) {
            if (Admitere.acceptaStudent(elem) == true)
                System.out.println("Studentul cu media "+elem.getMediaAdmitere() + " este admis");
            else
                System.out.println("Studentul " + Student.getNume() + " cu media " + elem.getMediaAdmitere() + " nu este admis");

        }
    }
}
