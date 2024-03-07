import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    String kode;
    String nama;
    int harga;
    int stok;
}
    public Barang(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
public void tampilkanInfo(){
    public void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
class TransaksiBarang {
    ArrayList<Barang> barangs = new ArrayList<>();

    public void tambahBarang(Barang barang) {
        barangs.add(barang);
    }
}

    public void tampilkanBarang(String kodeBarang, int jumlah) {
        for (Barang barang : barangs) {
            if (barang.kode.equals(kodeBarang)) {
                if (barang.stok >= jumlah) {
                    barang.stok -= jumlah;
                    System.out.println("Anda telah membeli " + jumlah + " " + barang.nama);
                } else {
                    System.out.println("Stok tidak mencukupi.");
                }
                return;
        System.out.println("Barang tidak ditemukan.");
    }
}

public class MainBarang {
    public static void main(String[] args) {
        TransaksiBarang transaksi = new TransaksiBarang();
        inisialisasiBarang(transaksi);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= TOKO MAJU MUNDUR CANTIK ==========");
            System.out.println("1. Tampilkan Daftar Barang");
            System.out.println("2. Beli Barang");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                System.out.println("================================================");
                    transaksi.tampilkanBarang();
                    System.out.println("================================================");
                    break;
                case 2:
                    System.out.print("Masukkan kode barang yang ingin dibeli: ");
                    String kodeBarang = scanner.next();
                    System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
                    int jumlah = scanner.nextInt();
                    transaksi.beliBarang(kodeBarang, jumlah);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
    public static void inisialisasiBarang(TransaksiBarang transaksi) {
        Barang barang1 = new Barang("001", "Sabun", 1000, 5);
        Barang barang2 = new Barang("002", " Pasta Gigi", 2000, 10);
        Barang barang3 = new Barang("003", " Biore", 3000, 23);
        Barang barang4 = new Barang("004", " Shampo", 4000, 55);
        Barang barang5 = new Barang("005", " Sikat Gigi", 5000, 65);

        transaksi.tambahBarang(barang1);
        transaksi.tambahBarang(barang2);
        transaksi.tambahBarang(barang3);
        transaksi.tambahBarang(barang4);
        transaksi.tambahBarang(barang5);
        
    }
    }
}
