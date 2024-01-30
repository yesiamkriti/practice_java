import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = sc.nextInt();
        int num =num1;
        int sum=0;
        int l = Integer.toString(num).length();
        while(num>0){
        sum = sum + (int)Math.pow(num%10,l);
        num/=10;}
        if(sum==num1){
            System.out.println("ArmStrong");
        }
        else{System.out.println("Not ArmStrong");}
    }
}
