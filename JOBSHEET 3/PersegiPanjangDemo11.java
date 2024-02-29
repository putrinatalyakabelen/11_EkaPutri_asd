import java.util.Scanner;
/**
 * PersegiPanjangDemo11
 */
public class PersegiPanjangDemo11 {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        System.out.print("Masukkan banyak persegi panjang yang anda inginkan : ");
        int length = sc11.nextInt();

        PersegiPanjang11[] arrayOfPersegiPanjang = new PersegiPanjang11[3];
        int panjang, lebar;

        for (int i = 0; i < length; i++) {

            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            panjang = sc11.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc11.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang11 (panjang, lebar);
        }

    for(int j = 0; j < length; j ++){
        System.out.println("Persegi panjang ke- " + (j+1));
        arrayOfPersegiPanjang[j].cetakInfo();
        arrayOfPersegiPanjang[j].hitungLuas();
        arrayOfPersegiPanjang[j].hitungKeliling();
    }
}
}