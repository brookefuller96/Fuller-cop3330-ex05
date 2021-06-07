import java.util.Scanner;
import java.lang.*;


public class Exercise5 {

    public static void main(String[] args) {
        System.out.println("What is the first number? ");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        System.out.println("What is the second number? ");
        Scanner input2 = new Scanner(System.in);
        String number2 = input2.nextLine();
        try
        {
            int x = Integer.parseInt(number);
            int y = Integer.parseInt(number2);
            double d = ((double) x)/y;
            System.out.println(x + " + " + y + " = " +  (x+y));
            System.out.println(x + " - " + y + " = " +  (x-y));
            System.out.println(x + " * " + y + " = " +  (x*y));
            System.out.println(x + " / " + y + " = " +  d);
        }
        catch(Exception e)
        {
            System.out.println("Please enter a number and try again. Thank you.");
        }
    }
}