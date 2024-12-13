//In-built Exception Handling
import java.util.*;
import java.io.*;
class Exception
{
public static void main(String a[])
{
int x,v,w,z=2;
int a1[]=new int[5];
Scanner sc = new Scanner(System.in);
try
{
x=a1[5];
v=z/0;
System.out.println("Enter a number");
w=sc.nextInt();
}
catch(InputMismatchException e)
{
System.out.println("The number should be an integer. Please try again");
}
catch(ArithmeticException e)
{
System.out.println("Division by zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array Exception");
}
}
}
