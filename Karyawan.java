/* Nama File    : Karyawan.java
 * Deskripsi    : Class Karyawan turuan dari class CivitasAkademika
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 28 Maret 2025
 */

public abstract class Karyawan extends CivitasAkademika {
    private String NIP;
    private int masaKerja;

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }

}
