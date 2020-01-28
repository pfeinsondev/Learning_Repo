public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;
        
        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }
    
    public void printValuesBackward() {
        Node current = this.tail;
        
        while (current != null) {
            System.out.println(current.value);
            current = current.previous;
        }
    }
    
    public Node pop() {
        Node current = this.tail;
        current.previous.next = null;
        this.tail = current.previous;
        return current;
    }
    
    public boolean contains(int value) {
        Node current = this.head;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }
    
    public int size() {
        int counter = 0;
        Node focus = this.head;
        while (focus != null) {
            focus = focus.next; 
            counter++;
        }
        return counter;
    }
    
    public void insertAt(Node newNode, int index) {
        Node focus = this.head;
        if (index == 0) { focus.previous = newNode;  newNode.next = focus; this.head = newNode; }
        int counter = 0;
        while (focus != null && counter < index) { focus=focus.next; counter++; }
        if (counter < index) { System.out.println("Error"); }
        else { focus.previous.next = newNode; newNode.next = focus; focus.previous = newNode; }
    }
    
    public void removeAt(int index) {
        if (index > size()) System.out.println("Invalid index");
        Node focus = this.head;
        int counter = 0;
        while (focus != null && counter < index) { focus = focus.next; counter++; }
        if (focus.next == null) { focus.previous.next = null; return; }
        focus.previous.next = focus.next;
        focus.next.previous = focus.previous;
    }
    
    public boolean isPalindrome() {
        if (size() == 0 || size() == 1) { return true; }
        Node focus_left = this.head;
        Node focus_right = this.tail;
        int index_left = 0; 
        int index_right = size()-1;
        while ( focus_left != null && focus_right != null && index_left < index_right ) { 
            if (focus_left.value != focus_right.value) { return false; }
            focus_left = focus_left.next; index_left++;
            focus_right = focus_right.previous; index_right++;
        }
        return true;
    }
    
}
