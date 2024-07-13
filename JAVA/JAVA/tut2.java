package JAVA;
import java.util.*;

class tut2{
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter Marks of Sub 1");
        arr[0]=obj.nextInt();
        System.out.println("Enter Marks of Sub 2");
        arr[1]=obj.nextInt();
        System.out.println("Enter Marks of Sub 3");
        arr[2]=obj.nextInt();
        System.out.println("Enter Marks of Sub 4");
        arr[3]=obj.nextInt();
        System.out.println("Enter Marks of Sub 5");
        arr[4]=obj.nextInt();
        int c=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        float j=(c*100)/500;
        System.out.println("Percentage of Student is:"+j+"%");
        obj.close();

    }
}