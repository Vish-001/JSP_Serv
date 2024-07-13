package JAVA;

import java.util.*;
public class For {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println("here: "+i);
        }
        
        Sc.close();
    }
}
