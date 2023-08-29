import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter which question you wanna see - ");
        int a32423= sc.nextInt();
        Arrayrelated a1=new Arrayrelated();
        switch (a32423)
        {
            case 1:
               a1.noRepeatNumber();
                break;
            case 2:
                a1.twoNumberSum();
                break;
            case 3:
              a1.threeNumberSum();
                break;
            case 4:
            a1.numebrGreater();
                break;
            case 5:
            a1.twoMultiple();
            break;
            case 6:
            a1.secondMax();
            break;
        }
    }
}