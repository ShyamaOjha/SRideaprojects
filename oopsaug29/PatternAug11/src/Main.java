import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the question you want to see - ");
        int x231312= sc.nextInt();
        System.out.print("enter the row - ");
        int row= sc.nextInt();
        switch (x231312)
        {
            case 1:
                for (int i = 0; i <row ; i++) {
                    for (int j = 0; j <row ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i <row; i++) {
                    for (int j = 0; j <=i; j++) {
                        if(i/2==1)
                        {
                            System.out.print("*");
                        }
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <=row ; i++) {
                    for (int j = 0; j <=i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <=2*i-1 ; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
        }
    }
}