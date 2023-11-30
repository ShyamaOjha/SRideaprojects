import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int findcount(int a[],int len,int num,int diff)
    {
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(a[i]==num)
            {
                count++;
            }
        }
        return count;
    }
    public static int findCount(int n, int m) {
        int d=0;
        int nd=0;
        for(int i=1; i<=m; i++) {
            if(i%n==0) {
                d+=i;
            }
            if(i%n!=0) {
                nd+=i;
            }
        }
        return Math.abs(d-nd);

    }
    public static int ProductSmallestPair(int sum) {
        int count=0;
        int [] arr= {5, 2 ,4 ,3 ,9 ,7 ,1};
        if(arr.length<2) {
            return -1;
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                int a=arr[i]+arr[j];
                int m=arr[i]*arr[j];
                if(a<sum&&i!=j) {
                    count++;
                }
                if(m<sum&&i!=j) {
                    count++;
                }
            }
        }
        if(count==0) {
            return 0;
        }
        return count;
    }
    public static int OperationChoices(int a,int b , int c ) {
        switch(c) {
            case 1:
                return a+b;

            case 2:
                return a-b;

            case 3:
                return a*b;

            case 4:
                return a/b;

            default : return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter question no to show - ");
        int x213= sc.nextInt();
        System.out.print("enter the size of the array - ");
        int size= sc.nextInt();
        System.out.print("enter the array - ");
        int arr[]= new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        switch (x213)
        {
            case 1:
                System.out.println("enter the number - ");
                int n = sc.nextInt();
                int odd = 1;
                int even = 1;
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 1) {
                        odd= odd*2;
                    } else {
                        even= even*3;
                    }
                }
                if (n % 2 == 1)
                {
                    System.out.println(odd);
                }
                else
                {
                    System.out.println(even);
                }
                break;
                case 2:
                    System.out.print("Enter the number - ");
                    int case2 = sc.nextInt();
                    int begin = 0;
                    boolean oddpos = true;
                    for (int i = 1; i <= case2; i++) {
                        if (oddpos)
                        {
                            begin = 2 * (i - 1);
                        }
                        else {
                            begin=begin/ 2;
                        }
                        oddpos = !oddpos;
                    }

                    System.out.println(begin);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("enter first number - ");
                double firstno= sc.nextDouble();
                    System.out.print("enter second number - ");
                Double secondno= sc.nextDouble();
                double answer4=firstno+secondno;
                    System.out.println(answer4);
                    break;
            case 5:
                System.out.print("enter total rat - ");
                int rat= sc.nextInt();
                System.out.print("enter the food ate by each rat - ");
                int foodconsuption=sc.nextInt();
                int count=0;int sum=0;
                int taotalconsuptionbyrat=rat*foodconsuption;
                for (int i = 0; i < arr.length ; i++) {
                    sum=sum+arr[i];
                    count++;
                        if(sum>=taotalconsuptionbyrat)
                        {
                            break;
                        }
                }
                if(sum<=taotalconsuptionbyrat)
                {
                    System.out.println("not enough");
                    break;
                }
                System.out.println(count);
                    break;
            case 6:
                
                break;
            case 7:
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.print(findCount(a,b));
                break;
            case 8:
                int sum1=sc.nextInt();
                System.out.print(ProductSmallestPair(sum1));
                break;
            case 9:
                break;
            case 10:
                int a1=sc.nextInt();
                int b1=sc.nextInt();
                int c1=sc.nextInt();
                System.out.print(OperationChoices(a1,b1,c1));

                break;

        }
    }
}