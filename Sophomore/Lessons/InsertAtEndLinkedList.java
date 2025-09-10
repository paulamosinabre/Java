
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
    
    static void insertatbegin(int data) {
        node linked = new node(data);
        
        //point new node next to current head
        linked.next = head;
        
        //move head to point to the new node
        head = linked;
    }
    
    //insert a new node after a node
    static void insertafternode(node list, int data){
        node linked = new node(data);
        
        //new node points to the next given node
        linked.next = list.next;
        
        //given node points to the new node
        list.next = linked;
    }
    
    static void printList(){
        node p = head;
        System.out.print("[");
        
        while(p != null){
            System.out.print(" " + p.data + " ");
            p = p.next;
        }
        
        System.out.print("]");
    }
    
    
    public static void main(String[] args) {
        insertatbegin(12);
        insertatbegin(22);
        insertatbegin(30);
        insertatbegin(44);
        insertafternode(head.next, 50);
        insertafternode(head.next.next, 33);
        
        System.out.println("Linked List: ");
        printList();
    }
}
