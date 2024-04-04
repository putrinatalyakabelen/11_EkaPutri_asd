/**
 * Mahasiswa11
 */
public class Mahasiswa11 {

    String nama;
    int nim, umur;
    double ipk;

    Mahasiswa11 (String n, int ni, int u, double i) {
        nama = n;
        nim = ni;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur );
        System.out.println("IPK = " + ipk);
        System.out.println("=======================");
    }

    public int compareTo(String cari) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
