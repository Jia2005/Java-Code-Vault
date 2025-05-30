// to find the sum of diagonal elements of a square matrix
import java.util.*;
import java.io.*;

class Diagonal
{
    public static void main(String a[])
    {
        int i,j,diagsum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        if(row!=col)
            System.exit(0);
        else
        {
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
            for(i=0;i<row;i++)
            {
                diagsum = diagsum + arr[i][i];
            } 
            System.out.println("The sum of the diagonals is "+diagsum);
        }
    }
}
