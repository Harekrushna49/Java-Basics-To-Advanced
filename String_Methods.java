import java.util.Locale;
import java.util.Scanner;
public class String_Methods {

        public static void main(String[] args) {

            // 1. Printing String Name.
            String name = new String("Pintu");
            // String name = "Pintu";
            System.out.println(name);

            // 2. String Length
            String name1 = "Pintu";
            int a = name1.length();
            System.out.println(a);

            // 3.Lower Case
            String name2 = "PINTU";
            String a2 = name.toLowerCase();
            System.out.println(a2);

            // 4. Upper Case
            String name3 = "pintu";
            String a3 = name3.toUpperCase();
            System.out.println(a3);

            // 5. Trim Method
            String name4 = "    Pintu    ";
            System.out.println(name4);
            String a4 = name4.trim();
            System.out.println(a4);

            // 6. Substring
            String name5 = "Pintu";
            //String a5 = name5.substring(1);
            System.out.println(name5.substring(0));

            // 7. Substring(Start,end)
            String name6 = "Pintu";
            System.out.println(name6.substring(1,4));

            // 8. Replace Name
            String name7 = "Pintu";
            System.out.println(name7.replace('u','n'));
            System.out.println(name7.replace("Pintu", "Chintu"));

            // 9. Starts with
            String name8 = "Pintu";
            System.out.println(name8.startsWith("Chi"));

            // 10. Ends With
            String name10 = "Pintu";
            System.out.println(name10.endsWith("ntu"));

            // 11. CharAT
            String name11 = "Pintu";
            System.out.println(name10.charAt(4));

            // 12. IndexOf
            System.out.println(name11.indexOf('n'));
            System.out.println(name11.indexOf('n',2));

            // 13. LastIndexOf
            System.out.println(name11.lastIndexOf('u'));

            // 14. Equals
            String name12 = "Pintu";
            System.out.println(name12.equals("ljijhi"));

            // 15. equalsIgnoreCase
            String name13 = "PiNtU";
            System.out.println(name13.equalsIgnoreCase("Pintu"));
        }
}