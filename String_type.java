import java.util.*;
public class String_type { // file name should be different from keywords of java thats why if we take String as a file name then we get error message again and again.

    // defination of string 
    // Strings are the type of objects that can store the character of values and in Java, every character is stored in 16 bits i,e using UTF 16-bit encoding. A string acts the same as an array of characters in Java.


    public static void main(String[] args){
        // how to take input of string

        System.out.println("Enter the string : ");
        Scanner sc =new Scanner(System.in); 
        String st = sc.nextLine();
        System.out.println(st);

        System.out.println("this is a string type");
        String str = "this is also a string";
        // creating string literal (To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).  )

        // If you want to store this string in the constant pool then you will need to “intern” it.

        String internedString = str.intern();
        System.out.println(internedString);

        System.out.println(str);
        // other property of strings are

        // we can add two strings
        String greet = "Hello kriti";
        String msg = "hope you are fine";
        String space = " ";
        System.out.println(greet  + space + msg);///concatenation

        // conversion of cases (strings are immutable(not changeable))
        greet = greet.toLowerCase();
        System.out.println(greet);
        msg = msg.toUpperCase();
        System.out.println(msg);

        // other way to create string 
        String name  = new String ("kriti");
        String friend =new String ("Welcome");
        // crating a string using new keyword will create two object 1st created in heap memory area and 2nd String constant pool 
        // In such a case, JVM will create a new string object in normal (non-pool) heap memory and the literal “Welcome” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool)
        // other way to print string
        int a=6;
        float b = 5.4578f;
        System.out.printf("The value of a is %d and the value of b is %f",a,b);
        System.out.format("\nThe value of a is %d and the value of b is %f\n",a,b);

        // methods of String

        System.out.println(name.length());
        System.out.println(friend.length());

        System.out.println(greet.charAt(0));
        String greet2 = greet.replace('e','b');
        System.out.println(greet2);
        //  substring
        System.out.println(name.substring(3)); // start from 3 index go to end
        System.out.println(name.substring(0,3));// o included and 3 exculded

        // triming a string
        String nonTrimedStr = "     who are you ?      ";
        String TrimedStr = nonTrimedStr.trim();
        System.out.println(TrimedStr);

        // replace
        System.out.println(name.replace('k','R'));
        System.out.println(name.replace("riti","ahul"));
        
        // startsWith and endsWith
        System.out.println(name.startsWith("kr"));
        System.out.println(name.endsWith("kr"));
        // charAt(int) and indexOf(string) or indexOf(string,int starting from ) and lastIndexOf(string) or lastIndexOf(string,int starting from)
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("it"));
        String NewName = "Koushlendra kumar";
        System.out.println(NewName.length());
        System.out.println(NewName.indexOf("r",5));
        System.out.println(NewName.lastIndexOf("r"));
        System.out.println(NewName.lastIndexOf("a",16));
        System.out.println(NewName.equals("KOushlendra kumar"));
        System.out.println(NewName.equalsIgnoreCase("koushlendra kumaR"));

        // CompareTo(String)
        String s1 = " i am a good girl ,";
        String s2 =sc.nextLine();
        int out = s1.compareTo(s2);
        System.out.println(out);
        // out = s1-s2 
        // out < 0  s1 comes before s2
        // out = 0  s1 and s2 are equal.
        // out > 0  s1 comes after s2.
    }
}
