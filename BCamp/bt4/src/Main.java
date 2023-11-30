import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int MaxExponents (int a , int b){
        int c=0;
        int r=0;
        int max=Integer.MIN_VALUE;
        for(int i=a; i<=b; i++) {
            int x=i;
            while(x%2==0) {
                x=x/2;
                c++;
            }
            if(max<c) {
                max=c;
                r=i;
                c=0;
            }
            else {
                c=0;
            }
        }
        return r;
    }
    public static void sort(int a[])
    {
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length-i ; j++) {
                if(a[i] > a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void Prime(int a,int b){
        int f=0;
        for(int i=a; i<=b; i++) {
            for(int j=2; j<=i/2; j++) {
                if(i%j==0) {
                    f=1;
                }
            }
            if(f==0){
                System.out.print(i+" ");
            }
            else {
                f=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x12321= sc.nextInt();
        switch (x12321)
        {
            case 1:
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.print(MaxExponents(a,b));
            break;
            case 2:
                System.out.println("enter first numner - ");
                int n = sc.nextInt();
                System.out.println("enter second number - ");
                int n2= sc.nextInt();int sum=0;
                for (int i = n; i <=n2 ; i++) {
                    if(n/3==0 && n/5==0)
                    {
                        sum=sum+i;
                    }
                }
                System.out.println("sum"+sum);
                break;
            case 3:
                System.out.print("enter the size nof array - ");
                int size= sc.nextInt();
                System.out.print("enter the array - ");
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i]=sc.nextInt();
                }
                System.out.println("sorted even array - ");

                System.out.println("sorted odd array");

                break;
            case 4:
                System.out.print("Enter the no of table you have to print - ");
                int tableni= sc.nextInt();int sum04=0;
                for (int i = 1; i <=10 ; i++) {
                    System.out.print((tableni*i)+" ");
                    sum04=sum04+tableni*i;
                }
                System.out.println();
                System.out.println("sum of the table - "+sum04);

                break;
            case 5:
                System.out.println("Enter the size of an attay-  ");
                int size5= sc.nextInt();
                System.out.println("enter the array - ");
                int array[]=new int[size5];
                for(int i=0;i<array.length;i++)
                {
                    array[i]=sc.nextInt();
                }
                int max=array[0];
                for (int i = 0; i <array.length ; i++) {
                    if(array[i]>max)
                    {
                        max=array[i];
                    }
                }
                System.out.println("max="+max);
                break;
            case 6:
                System.out.print("enter the array size-  ");
                int size6= sc.nextInt();
                System.out.print("enter the array - ");
                int a6[]=new int[size6];int count=0;
                for (int i = 0; i <a6.length ; i++) {
                    a6[i]=sc.nextInt();
                }
                for (int i = 0; i < a6.length-1; i++) {
                        if(a6[i]==a6[i+1]){
                            count++;
                        }

                }
                System.out.print("Count: " + count);
                break;
            case 7:
                System.out.println("enter first no - ");
                int start= sc.nextInt();
                System.out.println("enter second no - ");
                int end= sc.nextInt();
                Prime(start,end);
                break;
            case 8:
                System.out.print("enter the total semester -  ");
                int semester= sc.nextInt();
                System.out.print("enter the array - ");
                int maxmarks[]=new int[semester];
                for (int i = 0; i <semester ; i++) {
                    System.out.print("enter no of subject in  semester - ");
                    int noofsubject=sc.nextInt();

                    for (int j = 0; j <noofsubject ; j++) {
                        System.out.print("enter the number of marks - ");
                        int marks=sc.nextInt();

                        if(marks<0 || marks>100)
                        {
                            System.out.println("invalid marks");
                        }
                    }
                }
                break;
            case 9:
                int num=sc.nextInt();
                for(int i=1; i<=Math.abs(num); i++) {
                    if(num%i==0) {
                        System.out.print(i+" ");
                    }}
                break;

            case 10:
                int n1=sc.nextInt();
                int k=sc.nextInt();
                int c=0;
                int i=1;
                if(k!=1) {
                    while(true) {
                        for(int j=1; j<=n1; j++) {
                            if(j%i==0) {
                                c++;

                            }
                        }
                        if(i==n1) {
                            break;
                        }
                        i++  ;
                    }
                    System.out.println(c);
                }else {
                    System.out.println(n1);
                }
                break;

        }
    }
}