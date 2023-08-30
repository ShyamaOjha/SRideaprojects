import java.util.Scanner;

public class Main {
    static void printArray(int a[]){
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void numbergreater(int a[],int x){
        int count=0;
        for (int i = 0; i < a.length ; i++) {
            if(x<a[i])
            {
                count++;
            }
        }
        System.out.println("total no which are greater thann giver number = "+count);
    }
    static void duplicatenumber(int a[])
    {
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if(a[i]==a[j])
                {
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }
        for (int i = 0; i < a.length ; i++) {
            if(a[i]>0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    static void isaRRAYisSORTEDORNOT(int a[]){
        int flag=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.print("not sorted");
        }
        else System.out.print("sorted");
    }
    static void smallandlarge(int a[]){
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j])
                {
                  int temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                }
            }
        }
       System.out.println("smallest = "+a[0]);
        System.out.println("largest = "+a[a.length-1]);
        }
        static void secondlargest(int a[]){
            duplicatenumber(a);
            for (int i = 0; i <a.length ; i++) {

            }
            System.out.print(a.length-1);
        }
        static void twonumbersum(int a[],int x)
        {
            for (int i = 0; i < a.length ; i++) {
                for (int j = i+1; j <a.length ; j++) {
                    if(a[i]+a[j]==x)
                    {
                        System.out.print(a[i]+ " , "+a[j]);
                    }
                }
            }
        }
    static void threenumbersum(int a[],int x)
    {
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                for (int k = j+1; k < a.length ; k++) {
                if(a[i]+a[j]+a[k]==x)
                {
                    System.out.print(a[i]+ " , "+a[j]);
                }
            }
        }
    }}
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size = ");
     int arraysize= sc.nextInt();
     int a[]=new int[arraysize];
        System.out.print("enter the array = ");
        for (int i = 0; i <a.length ; i++) {
            a[i]= sc.nextInt();
        }
        System.out.print ("enter whhich question to access=");
        int xw2432= sc.nextInt();
     switch (xw2432){
         case 1:
             printArray(a);
             break;
         case 2:
             int a2121= sc.nextInt();
             numbergreater(a,a2121);
             break;
         //traverse question practice
         case 3:
             duplicatenumber(a);
         break;
         case 4:
             isaRRAYisSORTEDORNOT(a);
             break;
         case 5:
             smallandlarge(a);
             break;
         case 6:
             int addnumber= sc.nextInt();
             twonumbersum(a,addnumber);
             break;
         case 7:
             int threenumebr= sc.nextInt();
             threenumbersum(a,threenumebr);
             break;
         case 8:
             duplicatenumber(a);
             break;
         case 9:
            secondlargest(a);
             break;
         default:
             System.out.println("enter 1 to 9 numbers");
     }
    }
}