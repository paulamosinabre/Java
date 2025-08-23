Scanner scan = new Scanner(System.in);
        String [] userName = new String[5];
        
        String [] names = {"Ana", "Jose", "Juan"}; 
        System.out.print(names[2] + ",");
        System.out.println(names[1] );
       
        for(int i = 0; i < names.length; i++){
            System.out.println("Enter a name: ");
            userName [i] = scan.nextLine();
            
            if(userName.equals(5)){
                System.out.println(userName[i]);
                break;
            }

Scanner scan = new Scanner(System.in);
        String [] userName = new String[5];
        
        String [] names = {"Ana", "Jose", "Juan"}; 
        
        System.out.print(names[2] + ",");
        System.out.println(names[1] );
        /*
        for(int i = 0; i < userName.length; i++){
            System.out.println("Enter a name: ");
            userName [i] = scan.nextLine();
            
            
            if(userName.length == 5){
                System.out.println(userName[i]);
                break;
            }
        
        }*/
        
        
