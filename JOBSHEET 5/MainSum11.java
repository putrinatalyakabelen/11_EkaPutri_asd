import java.util.Scanner;
public class MainSum11 {
   public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        System.out.println("========================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc11.nextInt();
        Sum11 sm []= new Sum11 [jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan perusahaan ke-"+(i+1)+" :");
            int elm = sc11.nextInt();
            sm [i] = new Sum11(elm);
        }
        System.out.println("==========================================================================");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Perusahaan ke-"+(i+1));
            for (int j = 0; j < sm [i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke -"+(j+1)+" = ");
                sm[i].keuntungan[j] = sc11.nextDouble();
            }
        }
        for (int i = 0; i < sm.length; i++) {
            System.out.println("\nPerusahaan ke-"+(i+1));
            System.out.println("=====================================================================");
            System.out.println("Alogaritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selamam"+"%d bulan adalah %1.2f\n",sm[i].elemen,sm[i].totalBF(sm[i].keuntungan));
            System.out.println("======================================================================");
            System.out.println("Alogaritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selamam"+"%d bulan adalah %1.2f\n",sm[i].elemen,sm[i].totalDC(sm[i].keuntungan,0
            ,sm[i].elemen-1));
            System.out.println("=======================================================================");
        }
    }
}

                
            

            
        