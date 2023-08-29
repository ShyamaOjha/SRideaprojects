import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static boolean arraySorted(int a[])
    {  boolean check=true;
        for (int i = 1; i < a.length; i++) {
            if(a[i]<a[i-1])
            {
                check=false;
                break;
            }
        }
        return check;
    }
    static void swappingarray(int a121[])
    {
        for (int i = 0; i < a121.length ; i++) {
            for (int j = i+1; j < a121.length ; j++) {

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sc234= sc.nextInt();
        switch (sc234){
            case 1:
            int size= sc.nextInt();
            int a[]=new int[size];
            for (int i = 0; i < a.length ; i++) {
                a[i]= sc.nextInt();
                }
         boolean x=arraySorted(a);
        System.out.println(x);
        break;
            case 2:
                int size1= sc.nextInt();
                int a2[]=new int[size1];
                for (int i = 0; i <a2.length; i++) {
                    a2[i]=sc.nextInt();
                }
                int left=a2[0];int right=a2.length-1;
                while(left>right)
                {
                    if(a2[left]>a2[right])
                    {
                        int temp=0;
                        temp=a2[0];
                        a2[0]= a2.length;
                        a2[a2.length-1]=temp;
                        left++;
                        right--;
                    }
                //    System.out.println(a2[i]);
                }
                break;
            case 3:
                int sc1=sc.nextInt();
                int sc2=sc.nextInt();
              //  swappingarray(sc1,sc2);
                break;

        }





    }
}