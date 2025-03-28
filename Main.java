/* Nama File    : Main.java
 * Deskripsi    : Class main untuk demo semua class
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 28 Maret 2025
 */

public class Main {
    public static void main(String[] args) {
        Fakultas fakultas = new Fakultas("Sains dan Matemaka", 5000000, 7000000);

        Mahasiswa mhs1 = new Mahasiswa("Daffa", "daffa@mail.com", "24060123120001", 4, fakultas);
        Mahasiswa mhs2 = new Mahasiswa("Tsaqif", "Tsaqif@mail.com", "24060123120002", 4, fakultas);

        Dosen dosen1 = new Dosen("Pak Dosen", "Dosen@mail.com", "123456789", 10, fakultas);

        Tendik tendik1 = new Tendik("Pak Tendik Satu", "Tendik1@mail.com", "111222333", 15);
        Tendik tendik2 = new Tendik("Pak Tendik dua", "Tendik2@mail.com", "444555666", 10);

        System.out.println("=== MAHASISWA ===");
        mhs1.printInfo();
        System.out.println();
        mhs2.printInfo();

        System.out.println("\n=== DOSEN ===");
        dosen1.printInfo();

        System.out.println("\n=== TENDIK ===");
        tendik1.printInfo();
        System.out.println();
        tendik2.printInfo();

        System.out.println("\n=== INFO ===");
        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getCounterMHS());
        System.out.println("Jumlah Dosen: " + Dosen.getCounterDosen());
        System.out.println("Jumlah Tendik: " + Tendik.getCounterTendik());
    }
}
