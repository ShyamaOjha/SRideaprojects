import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x2134=sc.nextInt();
        switch (x2134) {
            case 1:
                int size1= sc.nextInt();
                int arr[]=new int[size1];
                for (int i = 0; i < arr.length ; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.print("enter where you have to rotation - ");
                int k=sc.nextInt();
                while(k!=0) {
                    for(int i=arr.length-k; i>=1; i--) {
                        int x=arr[i];
                        arr[i]=arr[i-1];
                        arr[i-1]=x;
                    }
                    k--;
                }
                System.out.print(Arrays.toString(arr));
                break;
            case 2:
                int[] nums = { 1, 2, 3, 4 };
                int[] result =productExceptSelf(nums);
                System.out.println(Arrays.toString(result));
                break;
            case 3:
                System.out.print("enter the size of array - ");
                int size = sc.nextInt();
                System.out.print("enter the array - ");
                int a3[] = new int[size];
                int index = 0;
                for (int i = 0; i < a3.length; i++) {
                    a3[i] = sc.nextInt();
                }
                for (int i = 0; i < a3.length - 1; i++) {
                    int peak = a3[0];
                    if (a3[i + 1] > a3[i] && a3[i + 1] > a3[i + 2]) {
                        peak = a3[i + 1];
                        index = i + 1;
                        System.out.println("peak element - " + peak);
                    }
                }
                System.out.print("index=" + index);
                break;
            case 4:
                System.out.print("enter the array size - ");
                int size4 = sc.nextInt();
                System.out.print("enter the array - ");
                int a4[][] = new int[size4][size4];int max=0;
                for (int i = 0; i < a4.length; i++) {
                    for (int j = 0; j < a4.length; j++) {
                        a4[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < a4.length; i++) {
                    int sum = 0;
                    for (int j = 0; j < a4.length; j++) {
                        sum = sum + a4[i][j];
                    }
                    int avg = sum / 3;
                    if(max<avg)
                    {
                        max = avg;
                    }
                    System.out.println("average of " + (i + 1) + " row - " + avg);
                }
                System.out.println(max);

                break;
            case 5:
                int size5= sc.nextInt();
                int a5[][]=new int[size5][size5];
                for (int i = 0; i < a5.length; i++) {
                    for (int j = 0; j <a5.length; j++) {
                        a5[i][j]= sc.nextInt();
                    }
                }
                int b5[][]=new int[size5][size5];
                for (int i = 0; i < b5.length ; i++) {
                    for (int j = 0; j <b5.length; j++) {
                       b5[i][j]=sc.nextInt();
                    }
                }
                int flagcheck=0;
                for (int i = 0; i <a5.length ; i++) {
                    for (int j = 0; j <b5.length ; j++) {
                        if(a5[i][j]==b5[i][j]) {
                            flagcheck=1;
                            break;
                        }
                    }
                }
                if(flagcheck==1)
                {
                    System.out.println("same");
                }
                else{
                    System.out.println("not same");
                }


                break;
            case 6:
                System.out.print("enter the array size - ");
                int size6= sc.nextInt();
                System.out.print("enter the array - ");int flag=0;
                int a6[][]=new int[size6][size6];
                for (int i = 0; i < a6.length ; i++) {
                    for (int j = 0; j <a6.length; j++) {
                        a6[i][j]= sc.nextInt();
                    }
                }
                System.out.print("enter the array - ");
                int a06[][]=new int[size6][size6];
                for (int i = 0; i < a06.length ; i++) {
                    for (int j = 0; j <a06.length; j++) {
                        a06[i][j]= sc.nextInt();
                    }
                }
                for (int i = 0; i <a6.length ; i++) {
                    for (int j = 0; j <a06.length ; j++) {
                        if(a6[i][j]==a06[i][j]) {
                            flag=1;
                        }
                    }
                }
                if(flag==1) {
                    System.out.println("identical");
                }
                else{
                    System.out.println("not identical");
                }
                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:
                int size10= sc.nextInt();
                int [][] arr10= new int[size10][size10];
                int r=0;
                int c=0;
                for(int i=0; i<arr10.length; i++) {
                    for(int j=0; j<arr10[i].length; j++) {
                        if(arr10[i][j]==0) {
                            r=i;
                            c=j;
                            break;
                        }
                    }
                }
                int k1=0;
                while(k1!=arr10.length) {
                    arr10[r][k1]=0;
                    arr10[k1][c]=0;
                    k1++;
                }

                for(int i=0; i<arr10.length; i++) {
                    for(int j=0; j<arr10[i].length; j++) {
                        System.out.print(arr10[i][j]);
                    }
                    System.out.println( );
                }

                break;
        }
    }
}