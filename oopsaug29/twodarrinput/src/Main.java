import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        System.out.print("enter the row= ");
        int row= sc.nextInt();
        System.out.print("enter the column = ");
        int column= sc.nextInt();
        int [][]a=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
               a[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        }
    }
