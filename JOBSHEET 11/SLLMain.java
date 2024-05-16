import java.util.Scanner;
/**
 * SLLMain
 */
public class SLLMain {

    public static void main(String[] args) {
        LinkedList singLL = new LinkedList();
        singLL.print();
        singLL.addFirst(800);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.addLast(500);
        singLL.print();
        singLL.insertAfter(700, 300);
        singLL.print();
        singLL.insertAt(3, 400);
        singLL.print();
        singLL.insertBefore(890, 100);
        singLL.print();

        System.out.println("Data pada indekx ke-1 : " + singLL.gedData(1));
        System.out.println("Data 300 berada pada indeks ke:" + singLL.indexOf(300));

        singLL.remove(300);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}

    
