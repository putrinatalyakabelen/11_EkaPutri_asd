import java.util.Scanner;
import org.w3c.dom.Node;
public class ScavengerHuntGame11 {
    

    private NodeGame11 head;

    public ScavengerHuntGame11() {
        head = null;
    }

    public void addNode(String question, String answer) {
        if (head == null) {
            head = new NodeGame11(question, answer);
        } else {
            NodeGame11 current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new NodeGame11(question, answer));
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        NodeGame11 current = head;
        while (current != null) {
            System.out.println(current.getQuestion());
            String answer = scanner.nextLine();
            if (current.getAnswer().equalsIgnoreCase(answer)) {
                System.out.println("Benar! Lanjut ke pertanyaan selanjutnya...");
                current = current.getNext();
            } else {
                System.out.println("SALAH! Game over.");
                break;
            }
        }
        if (current == null) {
            System.out.println("Selamat! Anda telah menjawab seluruh pertanyaan");
        }
        scanner.close();
    }
}
