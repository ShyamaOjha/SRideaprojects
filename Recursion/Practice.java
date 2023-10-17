import java.lang.invoke.CallSite;
import java.util.Scanner;

public class Main {
    static int fibo(int a)
    {
        if(a==0||a==1)
        {
            return a;
        }
        int previous=fibo(a-1);
        int p=fibo(a-2);
        return previous+p;
    }

        static int sumofdigit(int a)
        {
            if(a>=0&&a<=9)
            {
                return a;
            }
            int small=sumofdigit(a/10);
            int ans=small+(a%10);
            return ans;
    }
    static int facto(int a)
    {
        if(a==0)
        {
            return 1;
        }
        int ans=facto(a-1);
        int g=a*ans;
        return g;
    }
    static void print(int a)
    {
    if(a==1)
    {
        System.out.print(a);
        return;
    }
    print(a-1);
        System.out.print(a+" ");
    }
    static int sum1(int a)
    {
        if(a==0)
        {
            return 0;
        }
        if(a%2==0)
        {
            return sum1(a-1)+a;
        }
        else {
            return sum1(a-1)-a;
        }
    }
    static int mul(int k,int a)
    {
        if(a==1)
        {
            return a;
        }
        return mul(k,a-1);
       // System.out.println((k*a)+" ");
    }
    static void Printarray(int a[],int index)
    {
        if(index==a.length)
        {
            return;
        }
        System.out.print(a[index]+" ");
        Printarray(a,index+1);
    }
    static int sumarray(int a[],int index)
    {
        if(index==a.length)
        {
            return 0;
        }
        int small1=sumarray(a,index+1);
        return small1+a[index] ;
    }
    static boolean target(int a[],int length,int target,int index)
    {
        if(index>=length)
        {
            return false;
        }
        if(a[index]==target)
        {
            return true;
        }
        return target(a,length,target,index);
    }
    static void printindexofdup(int a[],int length,int target,int index)
    {
        if(index>=length)
        {
            return;
        }
        if(a[index]==target)
        {
            System.out.println(index+" ");
        }
        printindexofdup(a,length,target,index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x23123= sc.nextInt();
        switch (x23123)
        {
            case 1:
            int x= sc.nextInt();
            print(x);
                break;
            case 2:
            int y= sc.nextInt();
            int total=  facto(y);
            System.out.println(total);
                break;
            case 3:
            int fibp= sc.nextInt();
            for (int i = 0; i <=fibp ; i++) {
            System.out.println(fibo(i)); }
                break;
            case 4:
            System.out.println(fibo(5));
                break;
            case 5:
            int x4= sc.nextInt();
            int answer=sumofdigit(x4);
            System.out.println(answer);
                break;
            case 6:
            mul(5,6);
                break;
            case 7:
                int recsum= sc.nextInt();
                System.out.println(sum1(recsum));
                break;
            case 8:
            
                break;
            /// Array question
            case 9:
            int size= sc.nextInt();
            int a[]=new int[size];
                for (int i = 0; i <a.length ; i++) {
                    a[i]= sc.nextInt();
                }
            //int a[]={2,3,4,5,6,8,9};
            Printarray(a,0);
                break;
            case 10:
                int size1= sc.nextInt();
                int a1[]=new int[size1];
                for (int i = 0; i <a1.length ; i++) {
                    a1[i]= sc.nextInt();
                }
            int sumofarray=sumarray(a1,0);
                System.out.println(sumofarray);
                break;
            case 11:
                int size2= sc.nextInt();
                int a2[]=new int[size2];int length=a2.length;
                for (int i = 0; i <a2.length ; i++) {
                    a2[i]= sc.nextInt();
                }
                System.out.println("enter the no you want to check it is presornor not");
                int numchec= sc.nextInt();
                if(target(a2,length,numchec,0))
                {
                    System.out.println("yes no is present");
                }
                else {
                    System.out.println("not present ");
                }
                break;
            case 12:
                int size3= sc.nextInt();
                int a3[]=new int[size3];int length1=a3.length;
                for (int i = 0; i <a3.length ; i++) {
                    a3[i]= sc.nextInt();
                }
                System.out.println("enter the no you want to check it is presornor not");
                int numchec1= sc.nextInt();
               printindexofdup(a3,length1,numchec1,0);
                break;


        }
    }
}
