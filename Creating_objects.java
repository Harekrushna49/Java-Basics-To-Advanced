public class Creating_objects {
    int object(int a, int b){
        int c;
        if (a<b){
            System.out.println(a+" is less than "+b);
        }
        else {
            System.out.println(a+" is greater than "+b);
        }
        return 0;
    }
    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int z;
        Creating_objects obj = new Creating_objects();
        z = obj.object(x,y);
    }
}
