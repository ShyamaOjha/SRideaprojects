import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x93 = sc.nextInt();
        switch (x93) {
            case 1:
                int size = sc.nextInt();
                int[] a1 = new int[size];
                for (int i = 0; i < a1.length; i++) {
                }
                System.out.println(a1.length);
                break;
            case 2:
                int size2 = sc.nextInt();
                int[] a2 = new int[size2];
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = sc.nextInt();
                }
                for (int i = 0; i < a2.length; i++) {
                    System.out.println(a2[i]);
                }
                break;
            case 3:
                int size3 = sc.nextInt();
                int size4 = sc.nextInt();
                int[] a3 = new int[size3];
                int[] a4 = new int[size4];
                int sum1 = 0;
                for (int i = 0; i < a3.length; i++) {
                    a3[i] = sc.nextInt();
                }
                for (int j = 0; j < a4.length; j++) {
                    a4[j] = sc.nextInt();
                }
                for (int i = 0; i < a3.length; i++) {
                    for (int j = 0; j < a4.length; j++) {
                        if (i == j) {    sum1 = sum1 + a3[i] + a4[j];
                        }
                      

                    }   System.out.println("result =" + sum1);
                }
                break;
            case 4:
                int size5 = sc.nextInt();
                int[] a5 = new int[size5];
                for (int i = 0; i < a5.length; i++) {
                    a5[i] = sc.nextInt();}
                System.out.print("Etnter the number you want to check in array = ");
                int a6=sc.nextInt();
                for(int i=0;i<a5.length;i++)
                {
                    if(a5[i]==a6)
                    {
                        System.out.println("yes it is present ");
                        break;
                    }
                    else{
                        System.out.println("not present");
                    break;
                    }

                }
                    break;
            case 5:
                System.out.println("enter the size of an array = ");
                int size7= sc.nextInt();
                int a7[]=new int[size7];
                for(int i=0;i<a7.length;i++)
                {
                    a7[i]=sc.nextInt();
                }
                for(int i=0;i<a7.length;i++)
                {
                    if(a7[i]%2==0){
                        System.out.println(a7[i]);}
                }
                break;
            case 6:
                System.out.println("enter the size of an array = ");
                int size8= sc.nextInt();
                int a8[]=new int[size8];
                for(int i=0;i<a8.length;i++)
                {
                    a8[i]=sc.nextInt();
                }
                for(int i=0;i<a8.length;i++)
                {
                    if(a8[i]%2!=0){
                        System.out.println(a8[i]);}
                }
                break;
            case 7:
                System.out.println("enter the size of array =  ");
                int size9= sc.nextInt();
                int a9[]=new int[size9];
                for(int i=0;i<a9.length;i++)
                {
                    a9[i]= sc.nextInt();
                }
                for(int i=0;i<a9.length;i++)
                {
                    for(int j=1;j<=10;j++){
                        System.out.println(a9[i]+"*"+j+" ="+a9[i]*j);}

                }
                break;
            case 8:
                System.out.println("enter the array size= ");
                int size10= sc.nextInt();
                int a10[]=new int[size10];int max=a10[0];
                for(int i=0;i<a10.length;i++)
                {
                    a10[i]=sc.nextInt();
                }

                for(int i=0;i<a10.length;i++)
                {
                    if(a10[i]>max) {
                        max=a10[i];
                    }
                }
                System.out.println(max);
                break;
            case 9:
                System.out.println("enter the array size= ");
                int size11= sc.nextInt();
                int a11[]=new int[size11];
                for(int i=0;i<a11.length;i++)
                {
                    a11[i]= sc.nextInt();
                }
                for(int i=0;i<a11.length;i++)
                {
                    if(a11[i]>0)
                    {
                        System.out.println("positve");
                    }
                    if(a11[i]<0)
                    {
                        System.out.println("negative");
                    }
                    if(a11[i]==0)
                    {
                        System.out.println("zero");
                    }
                    if(a11[i]%2==0)
                    {
                        System.out.println("even = "+a11[i]);
                    }
                    if(a11[i]%2!=0)
                    {
                        System.out.println("odd = "+a11[i]);
                    }
                }
              
        }     
    }         
}             


