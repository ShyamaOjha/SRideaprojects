import java.util.Scanner;
public class Main {
    static void Printtwodarray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void sort(int a[]) {
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            if (a[l] > a[r]) {
                swap(a, l, r);
            }
            l++;
            r--;
        }
    }
    static void sort1(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

            }
        }
    }
    static void square(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static void printTwoDarray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    //    static void swap2(int a[],int r,int c)
//    {
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                int temp1=a[i][j];
//                a[i][j]=a[j][i];
//
//            }
//        }
//    }
    static void transpose(int arr[][], int r, int c) {
        int ans[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverse(int a[]) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp1 = a[i];
            a[i] = a[j];
            a[j] = temp1;
            i++;
            j--;

        }
    }

    static void rototeArray(int a[][], int n) {
        transpose(a, n, n);
        for (int i = 0; i < a.length; i++) {
            reverse(a[i]);
        }
        printTwoDarray(a);
    }

    static int[][] pascal(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {

        }
    }




    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("enter the question no you want to check= ");
        int x32432= sc.nextInt();
        switch (x32432){
            case 1:
                int size= sc.nextInt();
                int a[]=new int[size];
                System.out.print("enter the array = ");
                for (int i = 0; i < a.length ; i++) {
                    a[i]= sc.nextInt();
                }
                System.out.print("original array = ");
                printArray(a);
                sort(a);
                System.out.println();
                printArray(a);
                break;
            case 2:
                int size1= sc.nextInt();
                int a1[]=new int[size1];
                System.out.print("enter the array = ");
                for (int i = 0; i < a1.length ; i++) {
                    a1[i]= sc.nextInt();
                }
                System.out.print("original array = ");
                printArray(a1);
                System.out.println();sort(a1);
                System.out.print("array sorted =  ");
                printArray(a1);
                System.out.println();
                System.out.print("square of given array = ");
                square(a1);
                sort(a1);
                System.out.print("final array = ");
                printArray(a1);

                break;
            case 3:
                int size3= sc.nextInt();
                int a3[][]=new int[size3][size3];
                for (int i = 0; i < a3.length ; i++) {
                    for (int j = 0; j < a3.length ; j++) {
                        a3[i][j]=sc.nextInt();
                    }
                }
                transpose(a3,3,3);
                break;
            case 4:
                System.out.print("enter the size of array = ");
                int size4= sc.nextInt();
                int a6[][]=new int[size4][size4];
                System.out.print("enter the array = ");
                for (int i = 0; i < a6.length ; i++) {
                    for (int j = 0; j < a6.length; j++) {
                        a6[i][j]=sc.nextInt();
                    }
                }
                int a7[][]=new int[size4][size4];System.out.print("enter the array = ");
                for (int i = 0; i < a7.length ; i++) {
                    for (int j = 0; j <a7.length; j++) {
                        a7[i][j]=sc.nextInt();
                    }
                }
//                for (int i = 0; i <r ; i++) {
//                    for (int j = 0; j < ; j++) {
//                        for (int k = 0; k < ; k++) {
//
//                        }
//                    }
//                }
                break;
                // 29 august 2023 // 90 degree change
            // 1) transpose array  2) reverse array
            case 5:
                System.out.print("enter the size of an array");
                int size5= sc.nextInt();
                int a5[][]=new int[size5][size5];
                for (int i = 0; i < a5.length; i++) {
                    for (int j = 0; j <a5.length ; j++) {
                        a5[i][j]=sc.nextInt();
                    }
                }
               rototeArray(a5,3);


                break;
            case 6:
                int n= sc.nextInt();
            //    int a6[][]=pascal(n);
                break;
        }
    }
}