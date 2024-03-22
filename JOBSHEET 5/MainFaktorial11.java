import java.util.Scanner;

public class MainFaktorial11 {
    public static void main(String[] args) {
        
    Scanner sc11 = new Scanner(System.in);
    System.out.println("=================================================");
    System.out.print ("Masukkan jumlah elemen yang ingin dihitung : ");
    int elemen =sc11.nextInt();

    Faktorial11 [] fk11 = new Faktorial11 [elemen];
    for (int i = 0; i < elemen; i++) {
        fk11 [i] = new Faktorial11();
        System.out.print("Masukkan nilai data ke-"+(i + 1)+" : ");
        fk11 [i].nilai = sc11.nextInt();
    }
    System.out.println("=================================================");
    System.out.println("Hasil Faktorial dengan Brute Force");
        long startTime = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai" + fk11[i].nilai + " adalah : " + fk11[i].faktorialBF11(fk11[i].nilai));
        }
        long endTime = System.nanoTime();
        double timeTakenBF = (endTime - startTime)/ 1_000_000.0;
        System.out.println("Waktu eksekusi Brute Force: " + (timeTakenBF) + " seconds");
    
    startTime = System.nanoTime();
    System.out.println("=================================================");
    System.out.println("Hasil faktorial dengan Divide and Conquer");
    for (int i = 0; i < elemen; i++) {
        System.out.println("Faktorial dari nilai " + fk11[i].nilai + " adalah : " + fk11[i].faktorialDC11(fk11[i].nilai));
    }
    endTime = System.nanoTime();
    double timeTakenDC = (endTime - startTime)/ 1_000_000_000.0;
    System.out.println("Waktu eksekusi Brute Force: " + (timeTakenDC) + " seconds");
    System.out.println("=================================================");

}
}
