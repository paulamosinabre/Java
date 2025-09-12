import java.util.Scanner;
class Main {
    
    static class node {
        int data;
        node next;
        
        node(int value){
            this.data = value;
            next = null;
        }
    }
    
    static node head;
    
    static void insertNode(int value){
        node list = new node(value);
        list.next = head;
        head = list;
    }
    
    static int searchList(int key){
        node temp = head;
        
        while(temp != null){
            if(key == temp.data){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
    
    static void printList(){
        node p = head;
        while(p != null){
            System.out.print(" " + p.data + " ");
            p = p.next;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Linked List: ");
        insertNode(33);
        insertNode(50);
        insertNode(44);
        insertNode(30);
        insertNode(22);
        insertNode(12);
        printList();
        System.out.print("\nElement to be searched is: ");
        int num = scan.nextInt();
        
        if(searchList(num) == 1){
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }
    }
}
