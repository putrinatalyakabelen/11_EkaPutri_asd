import java.util.Scanner;
import java.util.Stack;

public class StackMain11 {
    public static void main(String[] args) {
    
    StackPakaian stk = new StackPakaian(5);
    Scanner sc = new Scanner(System.in);

     char pilih;
    
    do{
        System.out.print("Jenis: ");
        String jenis = sc.nextLine();
        System.out.print("Warna: ");
        String warna = sc.nextLine();
        System.out.print("Merk: ");
        String merk = sc.nextLine();
        System.out.print("Ukuran: ");
        String ukuran = sc.nextLine();
        System.out.print("Harga: ");
        double harga = sc.nextDouble();

        Pakaian11 p11 = new Pakaian11(jenis, warna, merk, ukuran, harga);
        System.out.print("Apakah anda akan menambahakan data baru ke stack (y/n)? ");
        pilih = sc.next().charAt(0);
        sc.nextLine();
        stk.push(p11);
    } while (pilih == 'y');

    stk.getMax();
    stk.print();
    stk.pop();
    stk.peek();
    stk.print();
}
}