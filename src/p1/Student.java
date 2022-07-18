package p1;

public class Student {
    private static final String nume="Cosmin";
    private String facultate="Aerospatiale";
    private double mediaAdmitere;

    public static String getNume() {
        return nume;
    }

    public String getFacultate() {
        return facultate;
    }
    public double getMediaAdmitere() {
        return mediaAdmitere;
    }
    public void setMediaAdmitere(double mediaAdmitere) {
        this.mediaAdmitere = mediaAdmitere;
    }
    public Student(double mediaAdmitere){
        setMediaAdmitere(mediaAdmitere);
    }
}
