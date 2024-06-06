//Construct Overloading
import java.io.*;
class Rectangle
{
    int length,breadth;
    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    int Area()
    {
        return length*breadth;
    }
}
class Square
{
    int side;
    Square(int s)
    {
        side = s;
    }
    int Area()
    {
        return side*side;
    }
}
class Circle
{
    int radius;
    Circle(int r)
    {
        radius = r;
    }
    double Area()
    {
        return (3.14*radius *radius) ;
    }
}
class Construct
{
    public static void main(String[] args)throws IOException
    {
        int re,sq;
        double ci;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the length and breadth of rectangle");
        int l = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println("Enter the side of square");
        int side=Integer.parseInt(br.readLine());
        System.out.println("Enter the radius of circle");
        int r=Integer.parseInt(br.readLine());
        Rectangle rec=new Rectangle(l,b);
        Square s=new Square(side);
        Circle c=new Circle(r);
        re = rec.Area();
        sq = s.Area();
        ci = c.Area();
        System.out.println("Area of rectangle is "+re);
        System.out.println("Area of square is "+sq);
        System.out.println("Area of circle is "+ci);
    }
}
