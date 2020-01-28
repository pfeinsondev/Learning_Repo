public class SinglyLinkedList {
    public Node head; 
    
    public SinglyLinkedList() { head = null; }
    public void add(int value) {
        Node insertion = new Node(value);
        if (head == null) {
            head = insertion;
        } else {
        
            Node scan = head;
        
            while (scan.next != null) {
                scan = scan.next;
            }
            scan.next = insertion;
        }
    }
    
    public void remove() {
        Node scan = head;
        while (scan.next.next != null) { scan = scan.next; }
        scan.next = null;
    }
    
    public void printValues() {
        Node scan = head;
        while (scan != null) { System.out.println(scan.getValue()); scan = scan.next; }
    }
    
    public Node find(int value) {
        Node scan = head;
        while (scan.next != null && scan.getValue() != value) { scan = scan.next; }
        return scan;
    }
    
    public void removeAt(int index) {
        Node scan = head;
        int currentIndex = 0;
        while (scan.next != null && currentIndex++ < index) { scan = scan.next; }
        scan.next = null;
    }
}
