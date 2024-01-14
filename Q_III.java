import java.util.*;
public class Q_III {
    public static void main(String[] arg){
        // q1 write a java program to convert a string to lowercase
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str1 = sc.nextLine();
        str1=str1.toLowerCase();
        System.out.println("String in loweer case : "+str1);

        // q2 write a java program to replace spaces with underscore
        System.out.println("write a sentence : ");
        String str2 = sc.nextLine();
        str2 = str2.replace(" ","_");
        System.out.println(str2);


        // q3 fill in letter -> "Dear <name>, Thanks a lot."

        System.out.println("what's your name : ");
        String name = sc.nextLine();
        String str3 = "Dear <|name|>, Thanks a lot.";
        String str4 = str3.replace("<|name|>",name);
        System.out.println(str4);

        // q4 detect double or triple space in a string
        int twoSp = str1.indexOf("  ");
        int threeSp = str1.indexOf("   ");
        if (twoSp>0) {
            System.out.println("there is double white space in the sentence.\n");
        }
        else {
            System.out.println("there is no double white space in the sentence.\n");
        } 
        if (threeSp>0) {
            System.out.println("there is triple white space in the sentence.\n");
        } else {
            System.out.println("there is no triple white space in the sentence.\n");
        }

    // q5 write formate of letter 
    System.out.println("salutation <name>,\n\t<write the body here>\n\n\nThanks");
    }
    
    
}
