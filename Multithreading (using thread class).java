//To get name of the Thread
import java.util.*;
import java.io.*;
public class Tname extends Thread
{
public void run()
{
String threadName = Thread.currentThread().getName();
System.out.println("The name of the Thread is "+threadName);
}
public static void main(String a[])
{
Tname s1 = new Tname();
Tname s2 = new Tname();
Thread thread1 = new Thread(s1);
thread1.start();
Thread thread2 = new Thread(s2);
thread2.start();
}
}
