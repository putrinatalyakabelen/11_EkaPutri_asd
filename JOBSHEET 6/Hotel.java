public class Hotel {
    String nama,kota;
    int harga;
    byte bintang;

    public Hotel(String n, String k, int h, byte b){
    nama = n;
    kota = k;
    harga = h;
    bintang = b;
    }
    void tampil (){
        System.out.println("Nama Hotel : "+nama);
        System.out.println("Kota Hotel : "+kota);
        System.out.println("Harga Hotel : "+harga);
        System.out.println("Bintang Hotel : "+bintang);
    }
}

