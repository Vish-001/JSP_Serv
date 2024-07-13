package JAVA;
import java.util.*;
public class array {
    public static void main(String args[])
    {
        int [] marks=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Number");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(marks[i]+" ");
        }
        sc.close();
    }
}
