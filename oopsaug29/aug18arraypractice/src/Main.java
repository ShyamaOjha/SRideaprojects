import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the question you wanna see = ");
        int a54634 = sc.nextInt();
        switch (a54634) {
            case 1:
                System.out.print("enter the size of an array = ");
                int size = sc.nextInt();
                int array[] = new int[size];
                System.out.print("enter the array = ");
                for (int i = 0; i < array.length; i++) {
                    array[i] = sc.nextInt();
                }
                System.out.print("enter the number you want to see = ");
                int numbercheck = sc.nextInt();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > numbercheck) {
                        System.out.print(array[i] + " ");
                    }

                }
                System.out.println();
                break;
            case 2:
                System.out.print("enter the size of an array = ");
                int size1 = sc.nextInt();
                int array1[] = new int[size1];
                System.out.print("enter the array = ");
                for (int i = 0; i < array1.length; i++) {
                    array1[i] = sc.nextInt();
                }
                System.out.print("enter the number to check dupilcay of a number = ");
                int duplicateNumber = sc.nextInt();int second=0;
                for (int i = 0; i < array1.length; i++) {
                    {
                        if (array1[i] == duplicateNumber) {
                            second=i;
                        }
                    }

                } System.out.print("indexing of copied number = "+second);
                break;
            case 3:
                System.out.print("enter the size of an array = ");
                int size2 = sc.nextInt();
                int array2[] = new int[size2];
                System.out.print("enter the array = ");
                for (int i = 0; i < array2.length; i++) {
                    array2[i] = sc.nextInt();
                }int count03=0;
                System.out.println("duplicate number are as follows = ");
                for (int i = 0; i < array2.length; i++) {
                    for (int j = i + 1; j < array2.length; j++) {
                        if (array2[i] == array2[j]) {
                            count03++;
                            System.out.println(array2[i] + " " + array2[j]);
                        }System.out.println("count = "+count03);
                    }
                }
                break;
            case 4:
                System.out.print("enter the size of an array = ");
                int size4 = sc.nextInt();
                int array4[] = new int[size4];

                System.out.print("enter the array = ");
                for (int i = 0; i < array4.length; i++) {
                    array4[i] = sc.nextInt();
                }
                int array41[] = array4.clone();
                Arrays.sort(array4);
                System.out.println(Arrays.equals(array4,array41));

                break;
            case 5:
                System.out.print("enter the size of an array = ");
                int size5 = sc.nextInt();
                int array5[] = new int[size5];
                int max = 0;
                System.out.print("enter the array = ");
                for (int i = 0; i < array5.length; i++) {
                    array5[i] = sc.nextInt();
                }
                for (int i = 0; i < array5.length; i++) {
                    if (array5[i] > max) {
                        max = array5[i];
                    }
                }
                int min = array5[0];
                System.out.print("maximum number in array = " + max);
                for (int i = 0; i < array5.length; i++) {
                    if (array5[i] < min) {
                        min = array5[i];
                    }
                }
                System.out.println();
                System.out.print("minimum number in an arrry = " + min);
                break;
            case 6:
                System.out.print("enter the size of an array = ");
                int sizeofanArray = sc.nextInt();
                int a91[] = new int[sizeofanArray];

                System.out.print("enter the target sum of two number");
                int target2 = sc.nextInt();
                for (int i = 0; i < a91.length; i++) {
                    a91[i] = sc.nextInt();
                }
                for (int i = 0; i < a91.length; i++) {
                    for (int j = i + 1; j < a91.length; j++) {
                        if (a91[i] + a91[j] == target2) {
                            System.out.println("sum of two number = " + a91[i] + " " + a91[j]);
                        }
                    }
                    System.out.println();
                }
                break;
            case 7:
                System.out.print("enter the size of an array = ");
                int array7 = sc.nextInt();
                int a7[] = new int[array7];

                System.out.print("target of three number sum = ");
                int target1 = sc.nextInt();
                for (int i = 0; i < a7.length; i++) {
                    a7[i] = sc.nextInt();
                }
                for (int i = 0; i < a7.length; i++) {
                    for (int j = i + 1; j < a7.length; j++) {
                        for (int k = j + 1; k < a7.length; k++) {
                            if (a7[i] + a7[j] + a7[k] == target1) {
                                System.out.println(a7[i] + " " + a7[j] + " " + a7[k]);
                            }
                        }
                    }
                }
                break;
            case 8:
                System.out.print("enter the size of any array = ");
                int array8 = sc.nextInt();
                int a8[] = new int[array8];
                for (int i = 0; i < a8.length; i++) {
                    a8[i] = sc.nextInt();
                }
                for (int i = 0; i < a8.length; i++) {
                    for (int j = i + 1; j < a8.length; j++) {
                        if (a8[i] == a8[j]) {
                            a8[i] = -1;
                            a8[j] = -1;
                        }
                    }
                }
                for (int i = 0; i < a8.length; i++) {
                    if (a8[i] > 0) {
                        System.out.println("number which is = " + a8[i]);
                    }
                }
                System.out.println();
                break;
            case 10:
                System.out.print("enter the size of any array = ");
                int array10 = sc.nextInt();
                int a10[] = new int[array10];
                System.out.print("please enter array value = ");
                for (int i = 0; i < a10.length; i++) {
                    a10[i] = sc.nextInt();
                }
                int flag1=0;
                for(int i=0; i<a10.length; i++){
                    for(int j=0; j<a10.length; j++){
                        if(a10[i]==a10[j]&&i!=j){
                            System.out.print(a10[i]+" ");
                            flag1=1;
                            break;
                        }
                    } if(flag1==1) {break;
                    }
                }
                if(flag1==0){
                    System.out.println(-1);
                    break;
                }
                break;
            case 11:
                System.out.print("enter the size of any array = ");
                int array11 = sc.nextInt();
                int a11[] = new int[array11];System.out.print("please enter array value = ");
                for (int i = 0; i < a11.length; i++) {
                    a11[i] = sc.nextInt();
                }
                int flag=0;
                for(int i=0; i<a11.length; i++){
                    for(int j=0; j<a11.length; j++){
                        if(a11[i]==a11[j]&&i!=j){
                            System.out.print(a11[i]+" ");
                            flag=1;
                        }
                    }
                }
                if(flag==0){
                    System.out.println(-1);
                }
                break;
            case 12:
                System.out.print("enter the size of any array = ");
                int array12 = sc.nextInt();
                int a12[] = new int[array12];System.out.print("please enter array value = ");
                for (int i = 0; i < a12.length; i++) {
                    a12[i] = sc.nextInt();
                }
                for (int i = 0; i <a12.length ; i++) {
                    for (int j = i+1; j <a12.length ; j++) {
                        if (a12[i] == a12[j]){

                        }
                    }
                }
                break;
                //2nd maximum check
            case 13:
                System.out.print("enter the size of any array = ");
                int array13 = sc.nextInt();
                int a13[] = new int[array13];System.out.print("please enter array value = ");
                for (int i = 0; i < a13.length; i++) {
                    a13[i] = sc.nextInt();
                }int count3=0;int x32=0;
                for (int i = 0; i <a13.length ; i++) {
                    for (int j = i+1; j <a13.length ; j++) {
                        if(a13[i]==a13[j]){count3++;
                            System.out.println("the repeating number are:- = "+a13[i]+" "+count3);
                            x32=a13[i];
                        }
                    } System.out.println(x32+" "+count3);
                }
               break;
        }}
        }

