
class Main {
    final static int MAXSIZE = 8;
    
    static int stack[] = new int[MAXSIZE];
    
    //keeps track of the last pushed element
    static int top = -1;
    
    public static int isfull(){
        if(top == MAXSIZE)
            return 1;
        else 
            return 0;
    }
    
    public static int push(int data){
        if(isfull() !=1 ){
            top = top + 1;
            stack[top] = data;
        } else {
            System.out.print("Could not insert data. Stack is already full!");
        }
        return data;
    }
    public static void main(String[] args) {
        push (44);
        push (10);
        push (62);
        push (123);
        push (15);
        
        System.out.println("Output: ");
        //uninitialized is included
        for(int i = 0; i < MAXSIZE; i++){
            System.out.print(stack[i] + " ");
        }
        
        System.out.println("\nBetter looping: ");
        //much better looping
        for(int i = 0; i < top; i++){
            System.out.print(stack[i] + " ");
        }
        
        
    }
}
