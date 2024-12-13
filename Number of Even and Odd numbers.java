//Number of even and odd numbers
import java.io.*;
import java.util.*;
class Even
{
public static void main(String a[])
{
int Even=0,Odd=0,i;
int[] Numbers = new int[50];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of inputs");
int num = sc.nextInt();
for(i=0;i<num;i++)
{
Numbers[i]=sc.nextInt();
}
for(i=0;i<num;i++)
{
if(Numbers[i]%2==0)
Even++;
else
Odd++;
}
System.out.println("The number of even numbers are "+Even+" and the number of 
odd numbers are "+Odd);
}
}
