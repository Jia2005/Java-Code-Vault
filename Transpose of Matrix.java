// to find transpose of a matrix
import java.util.*;
import java.io.*;

class Transpose
{
    public static void main(String a[])
    {
        int i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int [row][col];
        System.out.println("Enter the matrix elements");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("The transpose of the matrix is");
        for(i=0;i<col;i++)
        {
            for(j=0;j<row;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        } 
    }
}
