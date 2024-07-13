package JAVA;
import java.util.*;
public class tut4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Choise:");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("You have Chosen 1");
                break;
            case 2:
                System.out.println("You have Chosen 2");
                break;
            case 3:
                System.out.println("You have Chosen 3");
                break;
            case 4:
                System.out.println("You have Chosen 4");
                break;
            // default:
                // System.out.println("You have Chosen Nothing valid");
                // break;

        }
            sc.close();
    }
}
