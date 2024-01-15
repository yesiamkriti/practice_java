import java.util.Scanner;
public class Q_I {
    public static void main(String[] args) {
        //  Q1. write a program to calculate percentage of a given  student in CBSe board exam .His marks from 5 sub must be taken from the user.
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the marks of maths :");
        float s1 = sc.nextFloat();
        System.out.println("Enter the marks of english :");
        float s2 = sc.nextFloat();
        System.out.println("Enter the marks of hindi :");
        float s3 = sc.nextFloat();
        System.out.println("Enter the marks of science :");
        float s4 = sc.nextFloat();
        System.out.println("Enter the marks of sst :");
        float s5 = sc.nextFloat();
        float total = s1+s2+s3+s4+s5;
        float per = total/5;
        System.out.println("Student obtain "+per+" percent.");
        

        // Q2.Write a program to sum three numbers

        
        System.out.println("Enter num1");
        int a1 = sc.nextInt();
        System.out.println("Enter num2");
        int a2 = sc.nextInt();
        System.out.println("Enter num3");
        int a3 = sc.nextInt();
        int r1 = a1+a2+a3;
        System.out.println("Sum of the number is "+r1);
        

        // Q3 Write the program which ask the user to enter his/her name and greet them with "hello <name> have a good day ." text.
        
        
        System.out.println("Enter the name : ");
        String name = sc.next();
        System.out.println("Hello " +name+ ", have a good day.");
        

        // Q4 Write a program to convert kilometers to miles.

        
        System.out.println("enter the value in km : ");
        double km = sc.nextInt();
        double miles = 0.621371 * km;
        System.out.println(km + " km = " + miles + " miles");
        

        // Q5 Write a java program to detect whether a number entered by the user is integer or not

        boolean num = sc.hasNextInt();
        boolean num1 = sc.hasNextLine();
        boolean num2 = sc.hasNextDouble();
        
        System.out.println(num);


    } 
}
