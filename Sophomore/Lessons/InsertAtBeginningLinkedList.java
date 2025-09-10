class Main {
    
    static class node {
        int data;
        node next;
    
    
        node(int value){
            data = value;
            next = null;
        }
    }
    
    static node head;
    
    static void insertatbegin(int data) {
        node linked = new node(data);
        
        //point new node next to current head
        linked.next = head;
        
        //move head to point to the new node
        head = linked;
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
        insertatbegin(50);
        
        System.out.println("Linked List: ");
        printList();
    }
}
