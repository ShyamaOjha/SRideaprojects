import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x453= sc.nextInt();
        switch (x453){
            case 1:
                System.out.println("enter the size of array");
                int size= sc.nextInt();
                int a[]=new int[size];
                for(int i=0;i<a.length;i++)
                {
                    a[i]= sc.nextInt();
                }
                for(int i=0;i<a.length;i++)
                 {
                System.out.print(a[i]+" ");
                  }
            break;
            case 2:
                System.out.println("enter the size of array");
                int size1= sc.nextInt();
                int a1[]=new int[size1];
                for(int i=0;i<a1.length;i++)
                {
                    a1[i]= sc.nextInt();
                }
                for(int i=a1.length-1;i>=0;i--)
                {
                    System.out.print(a1[i]+" ");
                }
                break;
            case 3:
                System.out.println("enter the size of an array");
                int size2= sc.nextInt();
                int a2[]=new int[size2];int sum=0;
                for(int i=0;i<a2.length;i++)
                {
                    a2[i]= sc.nextInt();
                }
                for(int i=a2.length-1;i>=0;i--)
                {
                    sum=sum+a2[i];
                }
                System.out.print("sum = "+sum);
                break;
            case 4:
                System.out.println("enter the size of array =  ");
                int size3= sc.nextInt();
                int a3[]=new int[size3];
                for(int i=0;i<a3.length;i++)
                {
                    a3[i]= sc.nextInt();
                }
                for(int i=0;i<a3.length;i++)
                {
                    for(int j=1;j<=10;j++){
                    System.out.println(a3[i]+"*"+j+" ="+a3[i]*j);}

                }
                break;
            case 5:
                System.out.println("enter the number the size of an array");
                int size4= sc.nextInt();
                int size5= sc.nextInt();
                int a4[]=new int[size4];int a5[]=new int[size5];int sum1=0;
                for(int i=0;i<a4.length;i++)
                {
                    a4[i]= sc.nextInt();
                }
                for(int j=0;j<a5.length;j++)
                {
                    a5[j]= sc.nextInt();
                }
                for(int i=0;i<a4.length;i++)
                {
                    for(int j=0;j<a5.length;j++)
                    {
                        if(i==j){
                        sum1=sum1+a4[i]+a5[j];
                        System.out.println("result ="+sum1);}
                    }
                }
                break;
            case 6:
                System.out.println("enter the size of an array = ");
                int size6= sc.nextInt();
                int a6[]=new int[size6];
                for(int i=0;i<a6.length;i++)
                {
                    a6[i]=sc.nextInt();
                }
                for(int i=0;i<a6.length;i++)
                {
                    if(a6[i]%2==0){
                    System.out.println(a6[i]);}
                }
                break;
            case 7:
                System.out.println("enter the size of an array = ");
                int size7= sc.nextInt();
                int a7[]=new int[size7];
                for(int i=0;i<a7.length;i++)
                {
                    a7[i]=sc.nextInt();
                }
                for(int i=0;i<a7.length;i++)
                {
                    if(a7[i]%2!=0){
                        System.out.println(a7[i]);}
                }
                break;
            case 8:
                System.out.println("enter the array size= ");
                int size8= sc.nextInt();
                int a8[]=new int[size8];int max=a8[0];
                for(int i=0;i<a8.length;i++)
                {
                    a8[i]=sc.nextInt();
                }

                for(int i=0;i<a8.length;i++)
                {
                    if(a8[i]>max) {
                        max=a8[i];
                    }

                }
                System.out.println(max);
                break;
            case 9:
                System.out.println("enter the array size = ");
                int size9= sc.nextInt();
                int a9[]=new int[size9];int min=a9[0];
                for(int i=0;i<a9.length;i++)
                {
                    a9[i]=sc.nextInt();
                }
                for(int i=0;i<a9.length;i++)
                {
                    if(a9[i]<min) {
                        min=a9[i];
                    }
                }
                System.out.println(min);
                break;
        }

    }
    }
