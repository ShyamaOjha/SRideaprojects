import java.util.Arrays;
import java.util.Scanner;
public class Arrayrelated {
    static Scanner sc1=new Scanner(System.in);
     void noRepeatNumber() {
         System.out.print("enter the size of any array = ");
         int array= sc1.nextInt();
        int a9[] =new int[array];
         for (int i = 0; i <a9.length ; i++) {
             a9[i]= sc1.nextInt();
         }
        for (int i = 0; i < a9.length; i++) {
            for (int j = i+1; j < a9.length; j++) {
                if(a9[i]==a9[j])
                {
                    a9[i]=-1;
                    a9[j]=-1;
                }
            }
        }
        for (int i = 0; i <a9.length ; i++) {
            if(a9[i]>0)
            {
                System.out.println("number which is = "+a9[i]);
            }
        }
         System.out.println();
    }
    void secondLargestNum(int a1[]){
        for (int i = 0; i < a1.length ; i++)
        {
            a1[i]=sc1.nextInt();
        }
        Arrays.sort(a1);
        for (int i = 0; i < a1.length ; i++) {
            if(a1[i]==a1[i+1])
            {

            }
        }
    }
    void secondMax(){
        System.out.print("enter the array size - ");
         int array= sc1.nextInt();
         int a98[]=new int[array];
        for (int i = 0; i <a98.length ; i++) {
            a98[i]= sc1.nextInt();
        }
        int max=0, secmax=0;
        for (int i = 0; i <a98.length; i++) {
            if(max<a98[i])
            {
                secmax=max;
                max=a98[i];
            }
        }
        System.out.println("second max = "+secmax);
    }
     void threeNumberSum(){
         System.out.print("enter the size of an array = ");
         int sizeofanArray= sc1.nextInt();
         int a90[]=new int[sizeofanArray];

         System.out.print("target of sum = ");
        int target1= sc1.nextInt();
        for (int i = 0; i <a90.length ; i++) {
            a90[i]= sc1.nextInt();
        }
        for (int i = 0; i < a90.length ; i++) {
            for (int j = i+1; j < a90.length ; j++) {
                for (int k = j+1; k < a90.length; k++) {
                    if(a90[i]+a90[j]+a90[k]==target1)
                    {
                        System.out.println(a90[i]+" "+a90[j]+" "+a90[k]);
                    }
                }
            }
        }
    }
    void numebrGreater(){
        System.out.print("enter the size of an array = ");
        int sizeofanArray= sc1.nextInt();
        int a92[]=new int[sizeofanArray];

        System.out.print("print number greater than given number = ");
        int max= sc1.nextInt();
        for (int i = 0; i <a92.length ; i++) {
            a92[i]= sc1.nextInt();
        }int count=0;
        for (int i = 0; i <a92.length ; i++){
                if(max<a92[i])
                {
                    System.out.println(a92[i]+" ");
                    count++;
                }
            }

        System.out.println("total no of digit greater than given number = "+count);
        }
     void twoNumberSum(){
         System.out.print("enter the size of an array = ");
        int sizeofanArray= sc1.nextInt();
        int a91[]=new int[sizeofanArray];

        System.out.print("enter the target sum of two number");
        int target2= sc1.nextInt();
        for (int i = 0; i <a91.length ; i++) {
            a91[i]= sc1.nextInt();
        }
        for (int i = 0; i <a91.length ; i++) {
            for (int j = i+1; j <a91.length ; j++) {
                if(a91[i]+a91[j]==target2)
                {
                    System.out.println("sum of two number = "+a91[i]+" "+a91[j]);
                }
            }
            System.out.println();
        }
    }
    void twoMultiple(){
        System.out.print("enter the size of an array = ");
         int sizeofArray=sc1.nextInt();
         int a94[]=new int[sizeofArray];
        System.out.println("enter the mulitple of two number");
        int target3= sc1.nextInt();
        for (int i = 0; i < a94.length; i++) {
            a94[i]= sc1.nextByte();
        }
        for (int i = 0; i < a94.length; i++) {
            for (int j = i+1; j <a94.length ; j++) {
                if(a94[i]*a94[j]==target3)
                {
                    System.out.print(a94[i]+" "+a94[j]);
                }
            }
            System.out.println();
        }
    }


}
