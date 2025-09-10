
class Main {
    
    static class node {
        int data; //stores value
        node next; //reference to the next node
    
    
        node(int value){
            data = value;
            next = null; 
        }
    }
    
    //head pointer, points to the first node in the linked list
    static node head;
    
    static void printList(){
        node p = head;
        System.out.print("[");
        
        while(p != null){
            System.out.print(" " + p.data + " ");
            p = p.next;
        }
        
        System.out.print("]");
    }
    
    static void insertatbegin(int data) {
        node linked = new node(data);
        
        //point new node next to current head
        linked.next = head;
        
        //move head to point to the new node
        head = linked;
    }
    
    static void deleteatend(){
        node linkedlist = head;
        
        //traverse until the second to the last node 
        while(linkedlist.next.next != null){
            linkedlist = linkedlist.next;
        }
        
        linkedlist.next = null;
    }
    
    public static void main(String[] args) {
        insertatbegin(12);
        insertatbegin(22);
        insertatbegin(30);
        insertatbegin(44);
        insertatbegin(50);
        insertatbegin(33);
        
        System.out.println("Linked List: ");
        printList();
        
        //the output is reversed because you are inserting at the beginning
        deleteatend();
        System.out.println("\nLinked List after deletion: ");
        printList();
        
        
    }
}
