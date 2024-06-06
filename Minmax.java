//calculate minimum and maximum
import java.lang.*;
import java.io.*;
import java.util.*;
class Compare
{
    public static void main(String a[])
    {
        int n1,n2,n3,c1,c2,ans1,ans2;
        n1=Integer.parseInt(a[0]);
        n2=Integer.parseInt(a[1]);
        n3=Integer.parseInt(a[2]);
        c1=n1>n2?n1:n2;
        ans1=c1>n3?c1:n3;
        System.out.println("The maximum of "+n1+","+n2+" and "+n3+" is "+ans1);
        c1=n1<n2?n1:n2;
        ans2=c1<n3?c1:n3;
        System.out.println("The minimum of "+n1+","+n2+" and "+n3+" is "+ans2);
    }
}
