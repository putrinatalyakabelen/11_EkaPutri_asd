import java.util.Scanner;

public class GajiAdmin {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah Data Gaji: ");
        int jumlahGaji = sc.nextInt();
        Gaji[] gaji = new Gaji[jumlahGaji];

        for (int i = 0; i < jumlahGaji; i++) {
            gaji[i] = new Gaji();
            System.out.println("Masukkan data Gaji ke- " + (i + 1));
            System.out.print("Masukkan nama: ");
            gaji[i].nama = sc.nextLine();
            System.out.print("Masukkan Gaji Pokok: ");
            sc.next();
            gaji[i].gaji_pokok = sc.nextLine();
            System.out.print("Masukkan Gaji Bersih: ");
            gaji[i].gaji_bersih = sc.nextLine();
        }
        for (int i = 0; i < jumlahGaji; i++) {
            System.out.println("Data Gaji ke-" + (i + 1));
            gaji[i].cetakGaji();
        }
    }
}