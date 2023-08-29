import java.util.Arrays;
import java.util.Scanner; public class Main {
    static void printArray(int array[])
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static void zerocount(int a67[])
    {   int count=0;
        for (int i = 1; i < a67.length ; i++) {
            if(a67[i]==0)
            {
               count++;
            }
        }
        System.out.print("no of zeroes are -"+count);
    }
    static boolean sortedornot(int a[])
    {       boolean check=true;
        for (int i = 1; i < a.length ; i++) {
            if(a[i]<a[i-1])
            {
               check=false;
               break;
            }
        }return check;
    }
    static void sortornot(int a324[])
    {
        int flag=0;
        for (int i = 0; i < a324.length ; i++) {
            if(a324[i]<a324[i-1])
            {
                flag=1;
                break;
            }
    } if(flag==1)
    {
        System.out.println("not sorted");
    }
    else {
        System.out.println("sorted");
    }
    }
    static void sortedarray(int a6[]){
        int left=a6[0];int right= a6.length-1;
        while(left<right)
        {
            if(a6[left]>a6[right])
            {
                swap(a6,left,right);
            }
            left++;
            right--;
        }
    }
    static void sorttheArray(int a71[])
    {
        for (int i = 0; i < a71.length ; i++) {
            for (int j = i+1; j < a71.length ; j++) {
                if(a71[i]>a71[j])
                {
                  swap(a71,i,j);
                }
            }
        }
        System.out.println();
    }
    static void swap(int a09[],int i,int j){
        int temp=a09[i];
        a09[i]=a09[j];
        a09[j]=temp;
    }
    static void odd(int a231[]){
        for (int i = 0; i <a231.length ; i++) {
            for (int j = i+1; j < a231.length ; j++) {
                if(a231[i]%2!=0){
                    swap(a231,j,i);
                }
            }
        }}
        static void even(int a232[]) {
            for (int i = 0; i <a232.length ; i++) {
                for (int j = i+1; j < a232.length ; j++) {
                    if(a232[i]%2==0){
                        swap(a232,i,j);
                    }
                    }
                }
            }
    static void arraySquare(int a51[])
    {
        System.out.print("square of array = ");
        for (int i = 0; i <a51.length ; i++) {
           a51[i]= a51[i]*a51[i];
            System.out.print(a51[i]+" ");
        }
    }
    static void sortans(int a51[])
    {
        for (int i = 0; i < a51.length ; i++) {
            for (int j = i+1; j < a51.length; j++) {
                if(a51[i]>a51[j])
                {
                    swap(a51,i,j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("question to chrck = ");
        int x24332= sc.nextInt();
        switch (x24332)
        {
            case 1:
                //Check array is sorted or not
                System.out.print("enter the size of an array - ");
                int size=sc.nextInt();
                System.out.print("enter the array = ");
                int a[]=new int[size];
                for (int i = 0; i < a.length; i++) {
                    a[i]= sc.nextInt();
                }
//                boolean x=sortedornot(a);
//                System.out.println(x);
                sortornot(a);
                break;
            case 2:
                System.out.print("enter the size of an array = ");
                int size2= sc.nextInt();
                System.out.print("enter the array = ");
                int a2[]=new int[size2];
                for (int i = 0; i < a2.length; i++) {
                    a2[i]= sc.nextInt();
                }
                System.out.print("array original be like = ");
                printArray(a2);
                sortedarray(a2);
                System.out.print("after sorting array be like = ");
                printArray(a2);
                zerocount(a2);
                break;
            case 3:
                System.out.print("enter the array size = ");
                int size3= sc.nextInt();
                System.out.print("enter the array = ");
                int a3[]=new int[size3];
                for (int i = 0; i <a3.length ; i++) {
                    a3[i]= sc.nextInt();
                }
                System.out.print("array original be like = ");
                printArray(a3);
                sorttheArray(a3);
                odd(a3);
                even(a3);
                System.out.print("enter the final array = ");
                printArray(a3);
                break;
            case 4:
                int size4= sc.nextInt();
                int a4[]=new int[size4];
                for (int i = 0; i <a4.length ; i++) {
                    a4[i]= sc.nextInt();
                }
                printArray(a4);
                sortedarray(a4);
                printArray(a4);
                break;
            case 5:
                int size5= sc.nextInt();
                int a5[]=new int[size5];
                for (int i = 0; i <a5.length ; i++) {
                    a5[i]= sc.nextInt();
                }
                System.out.print("original array = ");
                printArray(a5);
//                Arrays.sort(a5);
                sortans(a5);
                System.out.print("sorrted array = ");
                printArray(a5);
                arraySquare(a5);
//                Arrays.sort(a5);
                sortans(a5);
                System.out.println();
                System.out.print("final array output = ");
                printArray(a5);
                break;
                //
           // extras question practice
            case 6:
                int size6= sc.nextInt();
                int a61[]=new int[size6];
                for (int i = 0; i <a61.length ; i++) {
                    a61[i]= sc.nextInt();
                }
                for (int i = 0; i < a61.length ; i++) {
                    for (int j = 1; j <=10 ; j++) {
                        System.out.print((a61[i]*j)+" ");
                    }
                    System.out.println();
                }
                break;
            case 7:
                int size7= sc.nextInt();
                int a7[]=new int[size7];int max=0;
                for (int i = 0; i <a7.length ; i++) {
                    a7[i]= sc.nextInt();
                }
                for (int i = 0; i <a7.length ; i++) {
                    for (int j = i+1; j < a7.length; j++) {
                        if(a7[i]>max)
                        {
                            max=a7[i];
                        }
                    }
                }System.out.print(max);
                break;
            case 8:
                int size8= sc.nextInt();
                int a8[]=new int[size8];
                for (int i = 0; i < a8.length; i++) {
                    a8[i]= sc.nextInt();
                }
                for (int i = 0; i <a8.length ; i++) {
                    for (int j = i+1; j <a8.length ; j++) {
                        if(a8[i]==a8[j])
                        {
                            a8[i]=-1;
                            a8[j]=-1;
                        }
                    }
                }
                for (int i = 0; i <a8.length ; i++) {
                    if(a8[i]>0)
                    {
                        System.out.print(a8[i]);
                    }
                }
                break;
        }
    }
      }