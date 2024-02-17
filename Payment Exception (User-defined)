//Pay out of Bound
import java.util.*;
class PayOutOfBounds extends Exception
{
PayOutOfBounds(String str)
{
super(str);
}
}
class Handling
{
public static void main(String a[]) throws PayOutOfBounds
{
boolean continueInput=true;
do
{
try
{
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the Payment of Superintendent");
int s = sc.nextInt();
if(s>=25000 && s<=50000)
{
System.out.println("Superintendent is paid");
}
else
{
 PayOutOfBounds pay = new PayOutOfBounds("Payment Out Of Bound");
throw pay;
}
continueInput=false;
}
catch(PayOutOfBounds pay)
{
System.out.println("Exception is "+pay);
}
}
while(continueInput);
}
}
