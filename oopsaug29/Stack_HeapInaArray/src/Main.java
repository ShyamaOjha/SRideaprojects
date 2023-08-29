import java.util.Arrays;
import java.util.Scanner;

/*
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void printarr(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    */
/*static void change_Value(int a)
    {
        a=65;
        System.out.println(a+" hello this is ghanshyajm");
    }*//*

  */
/*  static void printArray(int a[]){
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }*//*

    public static void main(String[] args) {
        int arr4[]=new int[8];
        arr4 [0]=23;
        arr4 [1]=63;
        arr4 [2]=53;
        arr4 [3]=43;
        arr4 [4]=13;
        arr4 [5]=87;
        arr4 [6]=234;
        arr4 [7]=76;
        printarr(arr4);
        int arr6[]= Arrays.copyOf(arr4,arr4.length);
        printarr(arr6);
        int arr7[]=Arrays.copyOfRange(arr4,2,6);
        printarr(arr7);
      */
/*  //copy of arr4
        int arr5[]=arr4.clone();
        printarr(arr5);
        //changing value of arr5
        arr5[0]=0;
        arr5[1]=0;
        printarr(arr5);
        printarr(arr4);*//*



      */
/* int a[]=new int[6];
       a[0]=1;
        a[1]=131;
        a[2]=13;
        a[3]=12;
        a[4]=14;
        a[5]=11;
        printArray(a);
        //copy array
        int arr[]=a;
        printArray(arr);
        //changed the vlaue of an array
        // shallow copy define
        a[0]=123;
        a[1]=231;
        printArray(a);
        printArray(arr);
        // for using clone method
        int arr3[]=a.clone();
        printArray(arr3)
        *//*

       */
/* int a=54;
        change_Value(a);
        System.out.println(a);*//*

    }
}*/
//    static void printArray(int a21[]){
//        for (int i = 0; i < a21.length ; i++) {
//            System.out.print(a21[i]+" ");
//        }
//        System.out.println();
//    }
//    int b=25;
//    public static void main(String[] args) {
//        int b=65;
//        System.out.println(b);
//        int a[]=new int[5];
//        a[0]=11;
//        a[1]=21;
//        a[2]=12;
//        a[3]=22;
//        a[4]=20;
//        System.out.print("array original - ");
//        printArray(a);
//        int a1[]=a.clone();
//        System.out.print("array copied - ");
//        printArray(a1);
//        a1[1]=0;
//        a1[4]=0;
//        System.out.print("change array copied- ");
//        printArray(a1);
//        System.out.print("orignal array - ");
//        printArray(a);
public class Main {
    static void printArray(int a[]){
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array");
        int size= sc.nextInt();
        int array[]=new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
        printArray(array);
        int array2[]=array;
        printArray(array2);
        array2[0]=0;
        array2[1]=5;
        printArray(array2);
        printArray(array);


    }
}

