// Computing table of a number
import java.util.*;

class Table
{
    public static void main(String a[])
    {
         int n,i;
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the number whose table you require");
         n=sc.nextInt();
         System.out.println("The table of "+n+" is ");
         for(i=1;i<=10;i++)
         System.out.println(n+"*"+i+"="+n*i);
    }
}
