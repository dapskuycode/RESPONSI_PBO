/* Nama File    : CivitasAkademika.java
 * Deskripsi    : super class CivitasAkademika
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 28 Maret 2025
 */


public class CivitasAkademika {
    private String nama;
    private String email;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}
