import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n,sum=0;
                  
                  Scanner sc=new Scanner(System.in);
 
	    System.out.println("enter how many numbers you want sum");
                   n=sc.nextInt();
                   int a[]=new int[n]; 
	    System.out.println("enter the "+n+" numbers ");
                   for(int i=0;i<n;i++)
                   {      
	             
                           a[i]=sc.nextInt();
                   }
                   for(int i=0;i<n;i++)
                   {
                           sum+=a[i];
                   }  	    
                   System.out.println("sum of "+n+" numbers is ="+sum);                  

	}
}
