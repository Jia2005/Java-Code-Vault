//Highest and total
import java.util.*;
import java.io.*;

class Marks
{
    public static void main(String a[])
    {
        int tot=0,i;
        Scanner sc = new Scanner(System.in);
        int[] mark = new int[15];
        System.out.println("Enter the number of subjects");
        int num=sc.nextInt();
        System.out.println("Enter your marks per subject");
        for(i=0;i<num;i++)
        {
            mark[i]=sc.nextInt();
            tot=tot+mark[i];
        }
        int max=mark[0];
        for(i=1;i<num;i++)
        {
            if (mark[i]>max)
            max=mark[i];
        }
        System.out.println("The total number of marks is "+tot+"\nThe highest of them is "+max);
    }
}
