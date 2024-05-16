import java.util.Scanner;
public class QueuePasienMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int capacity = sc.nextInt();
        QueuePasien11 antrian = new QueuePasien11(capacity);

        int pilihan;
        do {
            System.out.println("============Pilihan Menu:==============");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Hapus Pasien Terdepan");
            System.out.println("3. Lihat Pasien Terdepan");
            System.out.println("4. Lihat Pasien Terbelakang");
            System.out.println("5. Cari Posisi Pasien");
            System.out.println("6. Daftar Pasien");
            System.out.println("7. Keluar");
            System.out.println("========================================");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor Identitas: ");
                    int noID = sc.nextInt();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jenisKelamin = sc.next().charAt(0);
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();

                    Pasien11 pb = new Pasien11(nama, noID, jenisKelamin, umur);
                    sc.nextLine();
                    antrian.enqueue(pb);
                    break;
                case 2:
                    Pasien11 pasianHapus = antrian.dequeue();
                    if (pasianHapus != null) {
                        System.out.println("Pasien " + pasianHapus.nama + " berhasil dihapus dari antrian");
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    sc.nextLine(); 
                    System.out.print("Nama Pasien: ");
                    String namaCari = sc.nextLine();
                    antrian.peekPosition(namaCari);
                    break;
                case 6:
                    antrian.daftarPasien();
                    break;
                case 7:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 7);

        sc.close();
    }
}