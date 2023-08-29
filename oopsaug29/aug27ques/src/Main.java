import java.util.Scanner;

public class Main {
    static void sumofArray(int a[])
    { int sum=0;
        for (int i = 0; i < a.length ; i++) {
            sum=sum+a[i];
        }
        System.out.print("sum of an array  = "+sum);
    }
    static void maxNumber(int a[])
    {       int max=0;int postion=0;
        for (int i = 0; i < a.length ; i++) {
        if(a[i]>max)
        {
            max=a[i];
            postion=a[i];
        }
    }
        System.out.print("maximum element of an array  = "+max+" "+" and the postion is = "+postion);
    }
    static void FrequencyOfNumber(int a[])
    {
        for (int i = 0; i < a.length ; i++) {
            int count=0;
            for (int j = 0; j < a.length ; j++) {
                if(a[i]==a[j])
                {
                    count++;
                }
            }System.out.println(a[i]+" total times it will occur = "+count);
        }
    }
    static void countEvenandOdd(int a[])
    {   int count=0;int count1=0;
        for (int i = 0; i < a.length ; i++) {
            if(a[i]%2==0)
            {
                count++;
            }
            if(a[i]%2!=0)
            {
                count1++;
            }
    }
        System.out.print("even integer in array count is = "+count);
        System.out.println();
        System.out.println("odd integer in array count is = "+count1);
    }
    static void averageOfArray(int a[])
    {int sum=0;
        for (int i = 0; i < a.length ; i++) {
            sum=sum+a[i];
        }
        System.out.print("average of an array  = "+(sum/ a.length));
    }
    static void reversefArray(int a[])
    {
        for (int i = a.length-1; i >= 0 ; i--) {
            System.out.print(a[i]+" ");
        }

    }
    static void secondMaxNumber(int a[]) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        max=0;
        for (int i = 0; i < max; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.print("second max = "+max);
    }
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void zeroleftsift(int a[])
    {       int temp=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if(a[j]==temp)
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("etner the size of an array = ");
         int size= sc.nextInt(); int a[]=new int[size];
        System.out.print("enter the array = ");
        for (int i = 0; i < a.length ; i++) { a[i]= sc.nextInt(); }
        System.out.print("enter the question you want to see - "); int x2343232=sc.nextInt();
       switch (x2343232)  {
           case 1:  sumofArray(a); break;
           case 2: maxNumber(a); break;
           case 3: countEvenandOdd(a); break;
           case 4: averageOfArray(a); break;
           case 5:  reversefArray(a); break;
           case 6: secondMaxNumber(a); break;
           case 7:
               int a1[]=new int[size];System.out.print("enter the second array = ");
               for (int i = 0; i < a1.length; i++) { a1[i]= sc.nextInt(); }
               System.out.print("common element array between two arrays = ");
               for (int i = 0; i < a1.length ; i++) {
                   for (int j = 0; j < a.length; j++) {
                   if(a1[i]==a[j])
                   System.out.print(a[i]+" "); }} break;
           case 8: FrequencyOfNumber(a);break;
           case 9:
               int a4[]=new int[size]; System.out.print("enter the second array = ");
               for (int i = 0; i < a4.length; i++) { a4[i]= sc.nextInt(); }
               System.out.print("common element array between two arrays = ");
               for (int i = 0; i < a4.length ; i++) {
                   for (int j = 0; j < a4.length; j++) {
                       if(a4[i]==a[j])
                       System.out.print(a4[i]+" "); }} break;
           case 10:
               zeroleftsift(a);
               printArray(a);
               break;
           case 18:

               break;
       }
    }
}