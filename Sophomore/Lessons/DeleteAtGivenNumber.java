
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
    
    static void deletenode(int key){
        node temp = head; //starts from head
        node prev = null; //keeps track of prev node
        
        //case 1: if head contains the key
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        
        //case 2: traverse the list until key is found
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        
        //case 3: if key is not found, exit
        if(temp == null) return;
        
        //case 4: found + remove the node by skipping it
        prev.next = temp.next;
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
        deletenode(12);
        System.out.println("\nLinked List after deletion: ");
        printList();
        
        
    }
}
