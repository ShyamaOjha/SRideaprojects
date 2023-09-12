import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void printarray(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void sortearray (int a[]){
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        printarray(a);
    }
    static void palindrome(int a[])
    {       int flag=0;
        int l=0,r=a.length-1;
        while(l<r)
        {
            if(a[l]!=a[r])
            {
                flag=1;
                break;
            }
            l++;
            r--;
        }
        if(flag==1)
            System.out.println("array is not palindrome");
        else
            System.out.println("array is palindrome");
    }

    static void arraysortinzeroorderinleft(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==0)
                {
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
       printarray(a);
    }
    static void firstduplicateremoveinarray(int []a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                a[i]=-1;
                break;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array - ");
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.print("enter the array - ");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        System.out.print("enter the question which you want to see - ");
        int x234=sc.nextInt();
        switch (x234){
            case 1:
            printarray(a);
            sortearray(a);
                break;
            case 2:
            palindrome(a);
                break;
            case 3:
                // don't tried doubt in this question
                break;
            case 4:
            arraysortinzeroorderinleft(a);
                break;
            case 5:
            firstduplicateremoveinarray(a);
                break;
        }
    }
}