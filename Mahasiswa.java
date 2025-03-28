/* Nama File    : Mahasiswa.java
 * Deskripsi    : Class Mahasiswa turuan dari class CivitasAkademika
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 28 Maret 2025
 */

public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static int counter = 0;

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIM: " + NIM);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("UKT: Rp" + hitungUKT());
    }

    public static int getCounterMHS() {
        return counter;
    }
}
