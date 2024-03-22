import java.util.Scanner;

public class MainPangkat11 {
    
    public static void main(String[] args) {
        Scanner sc11 = new Scanner (System.in);
        System.out.println("==============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc11.nextInt();

        Pangkat11 [] png11 = new Pangkat11 [elemen];

        for (int i = 0; i < elemen; i++) {
            png11 [i] = new Pangkat11();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            png11[i].nilai = sc11.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
            png11[i].pangkat = sc11.nextInt();
        }

        System.out.println("==============================================");
        System.out.println("Pilih metode yang ingin dijalankan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = sc11.nextInt();

        while (true) {
            switch (pilih) {
                case 1:
                System.out.println("==============================================");
                System.out.println("   Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png11[i].nilai + " pangkat " + png11[i].pangkat + " adalah : " + png11[i].pangkatBf11(png11[i].nilai, png11[i].pangkat));
                } break;
                case 2:
                System.out.println("==============================================");
                System.out.println("  Hasil pangkat dengan Devide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png11[i].nilai + " pangkat " + png11[i].pangkat + " adalah : " + png11[i].pangkatDC11(png11[i].nilai, png11[i].pangkat));
                } break;
                
                default: 
                System.out.println("==============================================");
                System.out.println("==============================================");
                    System.out.println("Pilih metode yang ingin dijalankan:");
                    System.out.println("1. Brute Force");
                    System.out.println("2. Divide and Conquer");
                    System.out.print("Masukkan pilihan anda: ");
                    pilih = sc11.nextInt();
            }
            if (pilih == 1 || pilih == 2) {
                break;   
            }
        }
    }
}