import java.util.Scanner;
/**
 * HotelMain
 */
public class HotelMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("JW Mariot", "Surabaya", 5000000, (byte)5);
        Hotel h2 = new Hotel("Ijen Suites", "Malang", 2000000, (byte)4);
        Hotel h3 = new Hotel("Country Heritage", "surabya", 1500000, (byte)4);
        Hotel h4 = new Hotel("Shinta Hotel", " Nganjuk", 500000, (byte)3);
        Hotel h5 = new Hotel("The Gaia Hotel", "Bandung", 3000000, (byte)5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        int pilih;
        System.out.println("================================");
        System.out.println("              SORTING           ");
        System.out.println("================================");
        System.out.println("1. Tampilkan Hotel         ");
        System.out.println("2. Bubble Sort    (Harga)  ");
        System.out.println("3. Bubble Sort    (Bintang)");
        System.out.println("4. Selection Sort (Harga)  ");
        System.out.println("5. Selection Sort (Bintang)");
        System.out.print("Pilih (1-5) : ");
        pilih = sc.nextInt();
        switch(pilih){
            case 1 :
            System.out.println("Data Hotel = ");
            list.tampil();
            break;
            case 2:
            System.out.println("Data hotel setelah sorting desc berdasarkan harga = ");
            list.bubbleSortHarga();
            list.tampil();
            break;
            case 3 :
            System.out.println("Data hotel setelah sorting asc berdasarkan bintang = ");
            list.bubbleSortBintang();
            list.tampil();
            break;
            case 4 :
            System.out.println("Data hotel setelah sorting asc berdasarkan harga = ");
            list.selectionSortHarga();
            list.tampil();
            break;
            case 5 :
            System.out.println("Data hotel setelah sorting asc berdasarkan bintang = ");
            list.selectionSortBintang();
            list.tampil();
            break;
            default :
            System.out.println("Pilihan tidak valid");
            System.exit(0);
        }
    }
}
 

    
