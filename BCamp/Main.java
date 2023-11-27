import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void count(int a[])
    {
        int count=1;int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                count++;
                max=a[i];
            }
        }
        System.out.print("the count is - "+count);
    }
    public static void seatingarrange(int no)
    {
        if(no==1)
        {
            System.out.print(1);
        }
        int seating=(no-1);
        for (int i = 0; i <no ; i++) {
          //  seating=seating+count(no-1);
        }
    }
    public static int singledigitsum(int n,int r)
    {
        if(r==0)
        {
            return 0;
        }
        int currentsum=digitsum(n);
        for (int i = 0; i <r ; i++) {
            currentsum=digitsum(currentsum+n);
        }
        return currentsum;
    }
    static int digitsum(int N)
    {   int sum=0;
        while(N>0)
        {
            sum=N%10;
            N=N/10;
        }
        return sum;
    }
    public static int oddevenfine(int a[],int size,int Date,int fine)
    {
        int count=0;
        for(int i=0;i<size;i++) {
            if(a[i]%2==0 && Date%2==0)
            {
                count++;
            }
        }
        return count*fine;
    }
    static void checkPrime(int n)
    {
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("not prime number");
        else
            System.out.println("prime number");
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the question you want to see - ");
       int x234= sc.nextInt();
       switch (x234) {
           case 1:
               System.out.print("enter the size of an array - ");
               int size=sc.nextInt();
               int a1[]=new int[size];
               for(int i=0;i<size;i++)
               {
                   a1[i]=sc.nextInt();
               }
               int count0=0;
               for(int i=0;i<size;i++)
               {
                   if(a1[i]!=0)
                   {
                       a1[count0++]=a1[i];
                   }
               }
               for(int i=count0;i<size;i++)
               {
                   a1[i]=0;
               }
               for(int i=0;i<size;i++)
               {
                   System.out.print(a1[i]+" ");
               }
           break;
           case 2:
               System.out.print("enter the size of an array - ");
               int size1=sc.nextInt();
               int a2[]=new int[size1];
               for(int i=0;i<size1;i++)
               {
                   a2[i]=sc.nextInt();
               }
                count(a2);
               break;
           case 3:
           int noofmembers=sc.nextInt();

               break;
           case 4:
               System.out.println("enter the first numbe N");
             int N=sc.nextInt();
               System.out.println("Enter the second number R");
             int R= sc.nextInt();int sum=0;
             int answer3=singledigitsum(N,R);
               System.out.println(answer3);
               break;
           case 5:
               System.out.println("enter the size of array - ");
               int size5= sc.nextInt();
               System.out.println("enter the array  -");
               int a5[]=new int[size5];
               for(int i=0;i<size5;i++)
               {
                   a5[i]=sc.nextInt();
               }
               System.out.print("enter the date - ");
               int date=sc.nextInt();
               System.out.print("enter the fine - ");
               int fineamount= sc.nextInt();
               int totalamount=oddevenfine(a5,size5,date,fineamount);
               System.out.println(totalamount);
               break;
           case 6:
               System.out.print("enter no of vehicle - ");
               int nofovehicle= sc.nextInt();
               System.out.println("total no of wheels made - ");
               int wheels= sc.nextInt();
               int noofwheels=nofovehicle/2;
                int bike=0;
                int car=0;
               if(wheels>=2 && wheels%2==0 && nofovehicle<wheels)
               {
                car=(noofwheels/2)-nofovehicle;
                bike=nofovehicle-car;
                 System.out.println("total no of car - "+car);
                 System.out.println("total bike - "+bike);
               }
               else{
                   System.out.println("invalid input");
               }
               break;
           case 7:
               System.out.print("enter the size of an array - ");
               int size7=sc.nextInt();
               int a7[]=new int[size7];
               for(int i=0;i<size7;i++)
               {
                   a7[i]=sc.nextInt();
               }
               int b7[]=new int[size7];

               System.out.println("number of guests leaving");
               for(int i=0;i<b7.length;i++)
               {
                   b7[i]=sc.nextInt();
               }

               int total=0;
               int max=0;
               for(int i=0;i<a7.length;i++)
               {
                   total=total+a7[i]-b7[i];
                   if(max<total)
                   {
                       max=total;
                   }
               }
               System.out.println("Maximum number of guests on cruise at an instance= "+max);
               break;
           case 8:
               System.out.print("enter number of candies - ");
               int candies=sc.nextInt();
               System.out.print("enter no of candies available - ");
               int available=sc.nextInt();

               if(candies>available)
               {
                   System.out.println("Invalid input");
               }
               else
               {
                   int available1=available-candies;
                   System.out.println("NUMBER OF CANDIES SOLD= "+candies);
                   System.out.println("NUMBER OF CANDIES AVAILABLE= "+available1);
               }

               break;
           case 9:
               System.out.println("enter Number of Interior walls");
               int Interior= sc.nextInt();
               System.out.println("enter Number of Exterior walls");
               int Exterior= sc.nextInt();
               System.out.println("enter surface area");
               int surfacearea= sc.nextInt();

               int total1;
               if(surfacearea==0)
               {
                   total1=Interior*18+Exterior*12;
               }
               else {
                   total1=Interior*18*4+Exterior*12;
               }
               System.out.println(total1);
               break;
           case 10:
               int primechecknumber= sc.nextInt();
               if (primechecknumber<0)
               {
                   System.out.println("please enter the positve integer");
               }
               else{
                   checkPrime(primechecknumber);
               }
               break;
       }
    }
}