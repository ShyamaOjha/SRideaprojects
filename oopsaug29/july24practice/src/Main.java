import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("which program you to see");
        int x21332= sc.nextInt();
        System.out.print("enter the size = ");
        int size= sc.nextInt();
        switch (x21332)
        {
            case 1:
                if(x21332=='1') {
                    int x[] = new int[size];
                    for (int i = 0; i < x.length; i++) {
                        x[i] = sc.nextInt();
                    }
                    System.out.println(Arrays.toString(x));
                }
                else{
                    String [] str = new String[size];
                for (int i = 0; i < str.length; i++) {
                    str[i] = sc.next();
                }
                System.out.println(Arrays.toString(str));
                 }
                break;
            case 2:


        }

    }
}
