public class Basic {
    public static void main(String[] args) {
          
        int a[] ={2,4,6,8,10};
        float b[] = {1.1f,1.2f,1.3f,1.4f,1.5f};
        char ch[] = {'a','b','c','d'};

        System.out.println("3rd element is "+a[2]);
    
        
        a[2]=11; //updating an array.
        
        System.out.println("5th element is "+a[4]);
        System.out.println("3rd element is "+a[2]);    

        System.out.println("1st element is "+b[0]);
        System.out.println("1st element is "+ch[0]);

    }
}
