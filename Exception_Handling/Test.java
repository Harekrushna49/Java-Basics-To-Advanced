package Exception_Handling;

public class Test {
    public static void main(String...args) throws Exception
    {
        // try...catch block from Runtime class by creating object
        Runtime r = new Runtime(10,0);

        // try...catch finally block from try_catch_finally class by creating object
        try_catch_finally obj = new try_catch_finally();
        obj.add(10);
        obj.add(5);
        obj.add(7);
        obj.add(9);
        obj.add(1);
    }
}
