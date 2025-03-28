/* Nama File    : Tendik.java
 * Deskripsi    : Class Tendik turuan dari class Karyawan
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 28 Maret 2025
 */

public class Tendik extends Karyawan {
    private static int gajiPokok = 4000000;
    private static int counter = 0;

    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        counter++;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (getMasaKerja() * 0.01 * gajiPokok);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji: Rp" + hitungGaji());
    }

    public static int getCounterTendik() {
        return counter;
    }
}
