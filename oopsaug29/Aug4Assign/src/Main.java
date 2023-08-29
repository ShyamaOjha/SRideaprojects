import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of the programe which you want to see - ");
        int sx453 = sc.nextInt();
        switch (sx453) {
            case 2:
                System.out.print("enter first number - ");
                int a1 = sc.nextInt();
                System.out.print("enter seconf number - ");
                int a2 = sc.nextInt();
                a2 = a1 + a2;
                a1 = a2 - a1;
                a2 = a1 - a2;
                System.out.println("the swapped number are given below");
                System.out.println("a = " + a1 + " " + "a2 = " + (a2 * -1));
                break;
            case 4:
                System.out.print("enter the number to whether it is prime or not - ");
                int primenumbercheck = sc.nextInt();
                int a32443 = 2;
                while (primenumbercheck > 0) {
                    if (primenumbercheck % a32443 == 0) {
                        System.out.println("not prime");
                        break;
                    }
                    if (primenumbercheck - 1 == a32443) {
                        System.out.println("prime number");
                        break;
                    }
                    a32443++;
                }
                break;
            case 5:
                System.out.println("enter to print the fibonacci - ");
                int fiboNum = sc.nextInt();
                int a1234 = 0;
                int a1235 = 1;
                System.out.print(a1234 + " " + a1235);
                for (int i = 3; i <= fiboNum; i++) {
                    int c2134 = a1234 + a1235;
                    System.out.print(" " + c2134);
                    a1234 = a1235;
                    a1235 = c2134;
                }

                break;
            case 6:
                System.out.print("enter the size of an array - ");
                int size6= sc.nextInt();
                int a06[]=new int[size6];
                for (int i = 0; i < a06.length; i++) {
                    a06[i]= sc.nextInt();
                }
                System.out.print("the odd integers from an array - ");
                for (int i = 0; i < a06.length; i++) {
                    if(a06[i]%2!=0)
                    {
                        System.out.print(a06[i]+" ");
                    }
                }
                break;
            case 7:
                char sc324 = sc.next().charAt(0);
                if (sc324 == 'i') {
                    System.out.println("whether integer is palindrome or not");
                    int a3 = sc.nextInt();
                    int sum1232 = 0;
                    int real = a3;
                    while (a3 > 0) {
                        int rem = a3 % 10;
                        sum1232 = (sum1232 * 10) + rem;
                        a3 = a3 / 10;
                    }
                    if (real == sum1232) {
                        System.out.println("no is palindrome");
                    } else {
                        System.out.println("not palindrome");
                    }
                } else if (sc324 == 's') {
                    String sc654 = sc.nextLine();
                    String rev = "";
                    for (int i = sc654.length() - 1; i >= 0; i--) {
                        rev = rev + sc654.charAt(i);
                    }
                    if (sc654.equals(rev)) {
                        System.out.println("pallindrome string");
                    } else {
                        System.out.println("not palindrome");
                    }
                }

                break;
            case 9:
                System.out.print("enter the size of an array - ");
                int size = sc.nextInt();
                int a[] = new int[size];
                for (int i = 0; i < a.length; i++) {
                    a[i] = sc.nextInt();
                }
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a.length - i - 1; j++) {
                        if (a[j] > a[j + 1]) {
                            int temp;
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }
                System.out.print("sorted array - ");
                for (int j = 0; j < a.length; j++) {

                    System.out.print(" " + a[j] + " ");
                }
                break;
            case 10:
                System.out.print("enter the number for facto of number - ");
                int number = sc.nextInt();
                int facto = 1;
                for (int i = 1; i <= number; i++) {
                    facto = facto * i;
                }
                System.out.print("factorial of number - " + facto);
                break;
            case 12:
                System.out.print("enter the size of an array - ");
                int size5 = sc.nextInt();
                int a321[] = new int[size5];
                for (int i = 0; i < a321.length; i++) {
                    a321[i] = sc.nextInt();
                }
                for (int i = 0; i < a321.length; i++) {
                    for (int j = 0; j < a321.length - i - 1; j++) {
                        if (a321[j] > a321[j + 1]) {
                            int temp2;
                            temp2 = a321[j];
                            a321[j] = a321[j + 1];
                            a321[j + 1] = temp2;
                        }
                    }
                }
                System.out.print("second max number is - " + a321[a321.length - 2]);
                break;
            case 17:
                System.out.print("enter no for checking the armstrong number - ");
                int armstrngnumber = sc.nextInt();
                int total1 = 0;
                int armcheck = armstrngnumber;
                while (armstrngnumber > 0) {
                    int rem3 = armstrngnumber % 10;
                    total1 = total1 + (rem3 * rem3 * rem3);
                    armstrngnumber = armstrngnumber / 10;
                }
                if (armcheck == total1) {
                    System.out.print("armstrong number");
                } else {
                    System.out.println("not armstrong");
                }
                break;
            case 18:
                System.out.print("enter the row - ");
                int a36 = sc.nextInt();
                for (int i = 1; i <= a36; i++) {
                    for (int j = i; j < a36; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        if (k == 1 || i == a36 || k == (2 * i - 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 19:
                System.out.print("enter the number to print diamond shape - ");
                int a37 = sc.nextInt();
                for (int i = 1; i <= a37; i++) {
                    for (int j = 1; j < a37 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        if (k == 1 || k == (2 * i - 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                for (int i = a37 - 1; i >= 1; i--) {
                    for (int j = 1; j < a37 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        if (k == 1 || k == (2 * i - 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();

                }
                break;
            case 20:
                System.out.print("enter the row - ");
                int pattern20 = sc.nextInt();
                for (int i = 1; i <= pattern20; i++) {
                    int c20=11;
                    for (int j = 1; j <= pattern20 - i; j++) {
                        System.out.print(" ");
                        for (int k = 1; k <= (2*i-1); k++) {
                            System.out.print(c20*i);
                        }
                    }
                    System.out.println();
                }
                break;
            case 21:
                int a33 = sc.nextInt();
                for (int i = 1; i <= a33; i++) {
                    for (int j = 1; j <= a33 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = i; k > 0; k--) {
                        System.out.print(k);
                    }
                    for (int j = 2; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }

                break;
            case 22:
                int a31 = sc.nextInt();
                for (int i = 1; i <= a31; i++) {
                    for (int j = 1; j <= a31; j++) {
                        if ((i + j) % 2 == 0) {
                            System.out.print(1);
                        } else {
                            System.out.print(0);
                        }
                    }
                    System.out.println();
                }
                break;

            case 23:
                int a32 = sc.nextInt();
                for (int i = 1; i <= a32; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (j % 2 != 0) {
                            System.out.print(1);
                        } else {
                            System.out.print(0);
                        }
                    }
                    System.out.println();
                }
                break;
            case 24:
                int a42 = sc.nextInt();
                char n7 = 'A';
                for (int i = 1; i <= a42; i++) {
                    for (int j = i; j < a42; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        if (k == 1 || k == (2 * i - 1)) {
                            System.out.print(n7);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    n7++;
                    System.out.println();
                }
                char n8 = n7--;
                for (int i = a42 - 1; i >= 1; i--) {
                    for (int j = 1; j < a42 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        if (k == 1 || k == (2 * i - 1)) {
                            System.out.print(n8);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    n8--;
                    System.out.println();
                }

                break;
            case 25:
                int a21 = sc.nextInt();
                for (int i = 1; i <= a21; i++) {
                    for (int j = 1; j <= a21; j++) {
                        if (i == 1 || j == 1 || j == a21 || (i == a21 / 2)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 27:
                int a7 = sc.nextInt();
                int n1 = 1;
                for (int i = 1; i <= a7; i++) {

                    for (int j = 1; j <= i; j++) {
                        int xer = (2 * n1) - 1;
                        System.out.print(xer + " ");
                        n1++;
                    }
                    System.out.println();
                }
                break;
            case 28:
                System.out.println("enter the row - ");
                int a71 = sc.nextInt();
                int a12354 = 1;
                int a12235 = 1;
                System.out.print(a12354);

                for (int i = 2; i <= a71; i++) {
                    for (int j = 1; j <= i; j++) {
                        int c234 = a12354 + a12235;
                        System.out.print(" " + c234 + " ");
                        a12354 = a12235;
                        a12235 = c234;
                    }
                    System.out.println();
                }
                break;
            case 29:
                int a8 = sc.nextInt();
                int n3 = 1;
                for (int i = 1; i <= a8; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print((n3 * n3) + " ");
                        n3++;
                    }
                    System.out.println();
                }
                break;
            case 30:
                int a9 = sc.nextInt();
                int n6 = 1;
                for (int i = 1; i < a9; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (j % 2 == 0) {
                            System.out.print(n6);
                        } else {
                            System.out.print((n6));
                        }
                    }
                    System.out.println();
                }

                break;
            case 39:
                System.out.print("enter the row size - ");
                int row39 = sc.nextInt();
                for (int i = 1; i <= row39; i++) {
                    int d39 = 1;
                    for (int j = 1; j <= i; j++) {
                        if (i % 2 == 0) {
                            System.out.print((j * 2) + " ");
                        } else if (i % 2 != 0) {
                            System.out.print((d39) + " ");
                            d39++;
                            d39++;
                        }
                    }
                    System.out.println();
                }
                break;
            case 40:
                System.out.print("enter the row - ");
                int n12 = sc.nextInt();
                int d, v;
                for (int i = 1; i <= n12; i++) {
                    d = n12 - 1;
                    v = i;
                    for (int j = 1; j <= i; j++) {
                        System.out.print(v + " ");
                        v = v + d;
                        d--;
                    }
                    System.out.println();
                }
                break;

            case 41:
                int row41 = sc.nextInt();
                int ex = row41;
                for (int i = 1; i <= row41; i++) {
                    for (int j = row41; j >= i; j--) {
                        System.out.print(row41 - j + 1);
                    }
                    if (i > 1) {
                        for (int p = 1; p <= 2 * (i - 1); p++) {
                            System.out.print("*");
                        }
                    }
                    for (int j = ex; j >= 1; j--) {
                        System.out.print(j);

                    }
                    ex = ex - 1;
                    System.out.println();
                }
                break;
            case 42:
                System.out.println("enter the number");
                int a5 = sc.nextInt();
                for (int i = 1; i <= a5; i++) {
                    for (int j = a5; j >= 1; j--) {
                        if (j == i)
                            System.out.print("*");
                        else {
                            System.out.print(j);
                        }
                    }
                    System.out.println();
                }
                break;

            case 43:
                System.out.println("enter the number");
                int a4 = sc.nextInt();
                int n = 1;
                for (int i = 1; i <= a4; i++) {
                    {
                        for (int j = 1; j <= a4 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i) - 1; j++) {
                            System.out.print("   " + (n * n) + " ");
                            n++;
                        }
                        System.out.println();
                    }
                }
                break;
            case 45:
                int size2 = sc.nextInt();
                int a45[][] = new int[size2][size2];
                int a46[][] = new int[size2][size2];
                for (int i = 0; i < a45.length; i++) {
                    for (int j = 0; j < a45.length; j++) {
                        a45[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < a46.length; i++) {
                    for (int j = 0; j < a46.length; j++) {
                        a46[i][j] = sc.nextInt();
                    }
                }
                int a47[][] = new int[size2][size2];
                for (int i = 0; i < a47.length; i++) {
                    for (int j = 0; j < a47.length; j++) {
                        System.out.print(" " + (a45[i][j] + a46[i][j]) + " ");
                    }
                    System.out.println();

                }
                break;
            case 46:
                int size3 = sc.nextInt();
                int a48[][] = new int[size3][size3];
                int a49[][] = new int[size3][size3];
                for (int i = 0; i < a48.length; i++) {
                    for (int j = 0; j < a48.length; j++) {
                        a48[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < a49.length; i++) {
                    for (int j = 0; j < a49.length; j++) {
                        a49[i][j] = sc.nextInt();
                    }
                }
                int a50[][] = new int[size3][size3];
                for (int i = 0; i < a50.length; i++) {
                    for (int j = 0; j < a50.length; j++) {
                        System.out.print("   " + (a48[i][j] * a49[i][j]) + "   ");
                    }
                    System.out.println();

                }
                break;
        }
    }
}
// Have doubts in 26 ,30 // I dont tried 20 & 44 // & in 18 & 24 programme is slighly error.