import java.util.Scanner;
public class Q_II {
    public static void main(String[] args) {
        // Q1 what will be the result of the following  expression

        float a = 7/4 * 9/2;
        System.out.println(a);

        // Q2 write a java program to encrypt a grade bu adding 8 to it. Decrypt it to show the correct grade.
        System.out.println("before encrypting");
        char grade = 'J';
        grade = (char)(grade - 8);
        System.out.println(grade);

        System.out.println("after decrypting");
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Q3 use comprasion operator to find out whether a given number is greater than the user entered number or not

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for comprasion");
        int b = sc.nextInt();
        System.out.println(b>96);

        // Q4 

        int v=5;int u=6; int q=9; int s=2;
        int r = (v*v - u*2) /2*q*s;
        System.out.println(r);

    }
}
