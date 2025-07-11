public class Methods {
    static int num(int x, int y){
        if (y>x){
            System.out.println(y-x);
        }
        else {
            System.out.println(x+y);
        }
        return 0;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = num(a,b);
    }
}
