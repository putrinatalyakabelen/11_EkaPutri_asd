import java.util.Scanner;

public class PostfixMain11 {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc11.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix11 post = new Postfix11(total);
        P = post.konversi(Q);
        System.out.println("Posttix: "+P);
    }
}