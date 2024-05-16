public class LinkedList {
    Node head; //posisi awal linked list
   
    public boolean isEmpty(){
        return head == null;
    }

    public void print () {
        if (!isEmpty()) {
            Node currentNode = head;
            System.out.print("Isi Linked List : \t");

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;    
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input) {
        Node newNode = new Node(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast (int input) {
        Node newNode = new Node(input, null);
        
        if (isEmpty()) {
            head = newNode;
            
        } else {
            Node currentNode = head;
            
            while (currentNode.next != null) {
                currentNode = currentNode.next;    
            }
            currentNode.next = newNode;
        }
    }
    public void insertAfter (int key, int input) {
        Node  newNode  = new Node(input, null);
       
            if (!isEmpty()) {
                Node currentNode = head;
                
            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next; 
        } while (currentNode!= null);
    }
}
 public void insertBefore(int key, int input){
    Node newNode = new Node(input, null);
    Node currentNode = head;
    
    if(currentNode == null) { // Linked list kosong, node baru akan menjadi node pertama
        this.addFirst(input);
        return;
    }

    if(currentNode.data == key) { // Jika key ada pada node pertama, sisipkan node baru sebelumnya
        this.addFirst(input);
        return;
    }

    while(currentNode.next != null){
        if(currentNode.next.data == key){ // Jika key ada pada node selanjutnya
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            return;
        }
        currentNode = currentNode.next;
    }

    System.out.println("Node dengan key " + key + " tidak ditemukan dalam linked list");
}
    public void insertAt (int index, int key) {
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(key);
        }else {
            Node  currentNode = head;
            for (int i = 0; i < index -1; i ++) {
            }
            currentNode.next = new Node(key, currentNode.next);
            if (currentNode.next.next==null) currentNode = currentNode.next;
        }
    }

public int gedData (int index){
    Node  currentNode = head;
    for(int i=0; i<index; i++){
        currentNode = currentNode.next;
    }
    return currentNode.data;
}

public int indexOf (int key){
    Node currentNode = head;
    int index = 0;

    while (currentNode != null && currentNode.data != key){
        currentNode = currentNode.next;
        index++;
    }
    if(currentNode == null){
        return -1;
    }else{
        return index;
    }
}
public void removeFirst(){
    if(! isEmpty()){
        head = head.next;
    }else {
        System.out.println("Linked List masih Kosong");
    }
}

public void removeLast(){
    if(isEmpty()){
        System.out.println("Linked List masih Kosong");
    }else if(head.next == null){
        head = null;
    }else{
        Node currentNode = head;

        while(currentNode.next != null){
            if (currentNode.next.next!= null) {
                currentNode.next = null;
                break;
        }
        currentNode = currentNode.next;
    }
}
}
public void removeAt(int index){
    if (index == 0){
        removeFirst();
    }else{
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(temp.next == null){
        }
    }
}
public void remove (int key) {
    if(isEmpty()){
        System.out.println("Linked List masih Kosong");
    }else if (head.data == key) {
        removeFirst();
    } else {
        Node currentNode = head;

        while(currentNode != null){
            if(currentNode.next.data ==key){
                currentNode.next = currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
        }
    }
}
}
