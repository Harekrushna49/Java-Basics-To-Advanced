package Exception_Handling;

public class Runtime {
    private int num1;
    private int num2;

    public Runtime(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

        try
        {
            int result =  num1/num2;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
