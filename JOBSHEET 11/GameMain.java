import java.util.Scanner;
import org.w3c.dom.Node;
public class GameMain {
    
        public static void main(String[] args) {
            ScavengerHuntGame11 hunt = new ScavengerHuntGame11();
            hunt.addNode("Apa makanan khas padang ?", "Rendang");
            hunt.addNode(" Dimana letak candi borobudur?", "Yogja");
            hunt.addNode(" siapa nama presiden ke 7 RI?", " Jokowi");
            hunt.addNode(null, null);
            hunt.play();
        }
    }
