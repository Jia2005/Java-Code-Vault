import java.util.Scanner;
class Emp
{
    int empid;
    String name;
    float noh;
    void Details()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Empolyee id : ");
        empid = in.nextInt();
        System.out.print("Enter the Name of the empolyee : ");
        name = in.next();
        System.out.print("Enter the Number of hours : ");
        noh = in.nextFloat();
        System.out.println(" ");
    }
    void display()
    {
        System.out.print(empid);
        System.out.print(" ");
        System.out.print(name);
        System.out.print(" ");
        System.out.print(noh);
        System.out.print(" ");
        System.out.print((noh*100));
        System.out.print(" ");
        System.out.println("");
    }
    public static void main(String[] args)
    {
        int i;
        float high=0;
        Emp e[] = new Emp[5];
        for(i=0; i<5; i++)
        {
            e[i] = new Emp();
            e[i].Details();
        }
        System.out.println("Id \t Name \t Number of hours \t Salary");
        for(i=0; i<5; i++)
        {
            e[i].display();
        }
        high = e[0].noh;
        int position = 0;
        for(i=0;i<5;i++)
        {
            if(e[i].noh > high)
            { 
                high = e[i].noh;
                position = i;
            }
        }
        System.out.println("Employee "+ e[position].name + " with Empolyee Id "+e[position].empid+" has
        the highest wage of rupees "+(high*100));
    }
}
