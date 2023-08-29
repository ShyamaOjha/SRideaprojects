import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int a[]) {
        int n = a.length;
        int[] prefix = new int[n];
        prefix[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        return prefix;
    }
    static void arraysortedorNot(int a[]){int flag=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    flag=1;
                    break;
                }
            }
        }if(flag==1)
        {
            System.out.print(" not sorted");
        }
        else {
            System.out.print("sorted");
        }
    }
    static void arraySort(int a[])
    {
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if(a[i]>a[j])
                {
                    swap(a,i,j);
                }
            }
        }
    }
    static void sortWithTwoPointers(int a[])
    {       int left=a[0],right=a[a.length-1];
        while(left<right)
        {
            if(a[left]>a[right])
            {
                swap(a,left,right);
            }left++;
            right--;
        }
    }
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void oddArray(int a[])
    {
        for (int i = 0; i < a.length; i++) {

            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    static void evenArray(int a[])
    {
        for (int j = 0; j < a.length; j++) {
            if(a[j]%2==0)
            {
                System.out.print(a[j]);
            }
        }
    }
    static void squareArray(int a[])
    {
        for (int i = 0; i < a.length ; i++) {
            a[i]=a[i]*a[i];
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x35423= sc.nextInt();
        switch (x35423) {

            case 1:
            int size1= sc.nextInt();
            int a1[]=new int[size1];
                for (int i = 0; i < a1.length ; i++) {
                    a1[i]= sc.nextInt();
                }
                arraysortedorNot(a1);
            break;
            case 2:
                int size2= sc.nextInt();
                int a2[]=new int[size2];
                for (int i = 0; i < a2.length ; i++) {
                    a2[i]= sc.nextInt();
                }
                System.out.print("original array = ");
                printArray(a2);
                sortWithTwoPointers(a2);
                System.out.print("sorted array = ");
                printArray(a2);
                break;
            case 3:
                int size3= sc.nextInt();
                int a3[]=new int[size3];
                for (int i = 0; i < a3.length ; i++) {
                    a3[i]= sc.nextInt();
                }
                System.out.print("original array = ");
                printArray(a3);
                arraySort(a3);
                System.out.print("array sorted odd with even = ");
                oddArray(a3);
                evenArray(a3);
                printArray(a3);
                break;
            case 4:
                int size4= sc.nextInt();
                int a4[]=new int[size4];
                for (int i = 0; i < a4.length; i++) {
                    a4[i]= sc.nextInt();
                }
                System.out.print("orignal array = ");
                printArray(a4);
                sortWithTwoPointers(a4);
                System.out.print("sorted array = ");
                printArray(a4);
                break;
            case 5:
                int size5= sc.nextInt();
                int a5[]=new int[size5];
                for (int i = 0; i < a5.length; i++) {
                    a5[i]= sc.nextInt();
                }
                System.out.print("orignal array = ");
                printArray(a5);
                arraySort(a5);
                System.out.print("array sorted = ");
                printArray(a5);
                System.out.print("square of array sorted = ");
                squareArray(a5);
                System.out.println();
                System.out.print("final sorted array = ");
                arraySort(a5);
                printArray(a5);
                break;
            case 6:
                int size = sc.nextInt();
                int a[] = new int[size];
                for (int i = 0; i < a.length; i++) {
                    a[i] = sc.nextInt();
                }
                System.out.print("orignal array = ");
                printArray(a);
                int[] prefix = prefixSum(a);
                System.out.print("orignal array = ");
                printArray(prefix);
//        int index = sc.nextInt();
                break;
            case 7:
                int size7 = sc.nextInt();
                int a7[] = new int[size7];
                for (int i = 0; i < a7.length; i++) {
                    a7[i] = sc.nextInt();
                }
                System.out.print("orignal array = ");
                printArray(a7);
                prefixSum(a7);
                printArray(a7);
                break;
        }

    }


}