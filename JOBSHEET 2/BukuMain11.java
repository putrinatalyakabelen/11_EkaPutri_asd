public class BukuMain11 {

    public static void main(String[] args) {
        Buku11 bk11 = new Buku11();
        bk11.judul = "Today Ends Tomorrow Comes";
        bk11.pengarang = "Denada Pratiwi";
        bk11.halaman = 198;
        bk11.stok = 13;
        bk11.harga = 71000;

        bk11.tampilInformasi();
        bk11.terjual(5);
        bk11.gantiHarga(60000);
        bk11.tampilInformasi();

        Buku11 bk112 = new Buku11("Self Reward", "Maherra Ayesha", 160, 29, 59000);
        bk112.terjual(11);
        bk112.tampilInformasi();

    }
}


