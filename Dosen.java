/* Nama File    : Dosen.java
 * Deskripsi    : Class dosen turuan dari class karyawan
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 28 Maret 2025
 */


public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counter = 0;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        counter++;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (getMasaKerja() * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: Rp" + hitungGaji());
    }

    public static int getCounterDosen() {
        return counter;
    }
}
