import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        // array is non primitive data type
        String []sub_name = {"maths","english","hindi","science"};
        System.out.println(sub_name[1]);
        int [] marks = new int[3];
        marks[0] = 45;
        marks[1] = 25;
        marks[2] = 35;
        boolean [] bool = new boolean[3];
        // System.out.println(bool); // it will address assing to bool
        System.out.println(bool[2]);//false because we have not enter the value for it .
        // System.out.println(bool[3]);//out of range it will show error.
        System.out.println(marks.length);

        // sort
        System.out.println(marks[0]);//before sorting the mark at 0 index is 45
        Arrays.sort(marks);
        System.out.println(marks[0]);//after sorting the mark at 1 index is 25

        // 2d array
        int [][] finalmarks ={{47,58},{66,32}};
        System.out.println(finalmarks[1][1]);

        //casting
        double price = 100.00;
        double finalprice = price+18; // implicit  casting
        System.out.println(finalprice);

        int price2 =200;
        // int finalprice2 = price2 + 18.0; // this code show error, we can't convert a double to int due to range
        int finalprice2 = price2 + (int)18.0; // to resolve above problem we can use explict casting
        System.out.println(finalprice2);

        // final key use to define constant
        final int a = 45;
        //we cant change it.
        // a=45;
    }
}
