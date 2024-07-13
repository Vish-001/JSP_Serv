/* package codechef; // don't place package name! */
package JAVA;
import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t--> 0)
		{
		    String a,b,c;
		    a=sc.nextLine();
		    b=sc.nextLine();
            c=a+b;
            int d=0;
            int Child;
            Child=sc.nextInt();
            for(int i=0;i<Child;i++)
            {
                String uu=sc.nextLine();
                for(int j=0;j<uu.length();j++)
                {
                    for(int k=0;k<c.length();k++)
                    {
                        if(uu.charAt(j)!=c.charAt(k))
                        {
                            d++;
                        }
                    }
                }
            }
            if(d<=0)
            {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
		}
		sc.close();
	}
}
