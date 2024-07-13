package JAVA;
import java.util.*;

public class tut3 {
    public static void main(String args[]) {
        String letter="Hello My Name Is <|name|> and i live in <|town|>";
      
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String Name=sc.nextLine();
        System.out.print("Enter Your town Name:");
        System.out.println();
        letter.replace("<|name|>", Name);
         
        
        sc.close();
        
    }
}
