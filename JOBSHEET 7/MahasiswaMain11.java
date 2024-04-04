import java.util.Scanner;

public class MahasiswaMain11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs11 data = new PencarianMhs11();
        int jumMhs = 5;

        int[] daftarNilai = {10, 5, 20, 15, 45};

        System.out.println("==============================================");
        System.out.println("Data Nilai : ");
        for (int i = 0; i < daftarNilai.length; i++) {
            System.out.println("Nilai " + (i+1) + " : " + daftarNilai[i]);
        }

        System.out.println("==============================================");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil : ");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("==========================================");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama =  sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa11 m = new Mahasiswa11 (nama, nim, umur, ipk);
            data.tambah(m);
        }

        System.out.println("===========================================");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("Pencarian data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cariNama = sl.nextLine();

        System.out.println("Menggunakan binary Search");
        int posisi = data.FindBinarySearch (cariNama, 0, jumMhs - 1);

        if (posisi != -1) {
            // Cek apakah ada hasil lebih dari satu
            int posisiAkhir = posisi;
            int posisiAwal = posisi;
            while (posisiAwal > 0 && data.listMhs[posisiAwal - 1].nama.equalsIgnoreCase(cariNama)) {
                posisiAwal--;
            }
            while (posisiAkhir < jumMhs - 1 && data.listMhs[posisiAkhir + 1].nama.equalsIgnoreCase(cariNama)) {
                posisiAkhir++;
            }
            if (posisiAwal != posisiAkhir) {
                System.out.println("Data ditemukan pada indeks " + posisiAwal + " hingga " + posisiAkhir);
                System.out.println("Hasil pencarian lebih dari satu.");
            } else {
                System.out.println("Data ditemukan pada indeks " + posisi);
                data.TampilData(data.listMhs[posisi].nim, posisi);
            }
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return - 1;
    }
}