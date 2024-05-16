import org.w3c.dom.Node;

public class NodeGame11 {

    private String question;
    private String answer;
    private NodeGame11 next;

    public NodeGame11(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public NodeGame11 getNext() {
        return next;
    }

    public void setNext(NodeGame11 next) {
        this.next = next;
    }
}

