public class String_type { // file name should be different from keywords of java thats why if we take String as a file name then we get error message again and again.
    public static void main(String[] args){
        System.out.println("this is a string type");
        String str = "this is also a string";
        System.out.println(str);
        // other property of strings are

        // we can add two strings
        String greet = "Hello kriti";
        String msg = "hope you are fine";
        String space = " ";
        System.out.println(greet  + space + msg);

        // conversion of cases
        greet = greet.toLowerCase();
        System.out.println(greet);
        msg = msg.toUpperCase();
        System.out.println(msg);
    }
}
