//Method Overloading
import java.io.*;
class Overload
{
    int area(int l,int b)
    {
        int area=l*b;
        return area;
    }
    int area(int side)
    {
        int area=side*side;
        return area;
    }
    double area(double radius)
    {
        double area=3.14*radius*radius;
        return area;
    }
}
class Method
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the length and breadth of rectangle");
        int l = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println("Enter the side of square");
        int side=Integer.parseInt(br.readLine());
        System.out.println("Enter the radius of circle");
        double radius=Double.parseDouble(br.readLine());
        Overload o=new Overload();
        System.out.println("Area of rectangle is "+o.area(l,b));
        System.out.println("Area of square is "+o.area(side));
        System.out.println("Area of circle is "+o.area(radius));
    }
}
