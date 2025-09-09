public class Main {
    static void printList(Node head){
        while(head != null){ // Traverse until end of list
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    static Node reverse(Node head){
        Node prev = null; //Previous node
        Node current = head; //
        Node next = null; //temporarily store next node
        
        while(current != null){
            next = current.next; // save next node
            current.next = prev; // reverse pointer of current
            prev = current; // move prev one forward
            current = next; // move current forward
        }
        
        return prev; 
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        
        // print original list
        System.out.print("Original: ");
        printList(head);
        
        // Reverse linked list
        head = reverse(head);
        
        // Print reverse list
        System.out.print("Reversed: ");
        printList(head);
    }
    
}

class Node {
    int data; //stores the value
    Node next; // pointer reference to the next node
    
    Node (int data){
        this.data = data;
        next = null;
    }
}

class ReverseLinkedList {
   
}
