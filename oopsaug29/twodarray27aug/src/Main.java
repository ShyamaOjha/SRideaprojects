import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void printArray(int a[][]){
    for (int i = 0; i < a.length ; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row of an array = ");
        int row= sc.nextInt();
        System.out.print("enter the col of an array = ");
        int col= sc.nextInt();
        int a[][]=new int[row][col];
        System.out.print("enter the array = ");
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
            a[i][j]= sc.nextInt();
        } }
        System.out.print("enter the question you want to see = ");
        int x323= sc.nextInt();
        switch (x323)
        {
            case 1:
               printArray(a);
                break;
            case 2:
                int a2[][]=new int[row][col];
                System.out.print("enter second array = ");
                for (int i = 0; i < a2.length ; i++) {
                    for (int j = 0; j < a2.length; j++) {
                        a2[i][j]= sc.nextInt();
                    }
                }
                for (int i = 0; i <a.length ; i++) {
                    for (int j = 0; j < a2.length ; j++) {
                        if(a[i][j]==a2[i][j])
                        {
                            int sum=a[i][j]+a2[i][j];
                            System.out.print(sum+" ");
                        }
                    }
                    System.out.println();
                }
                break;
        }
        }
    }
