import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the question you want to see = ");
        int x23= sc.nextInt();int minbalance=50000;
        switch (x23)
        {
            case 1:
                for (int i = 2; i <= 100; i++)
                {
                    int flag=0;
                    for( int j =2; j<i; j++)
                    {
                        if(i%j==0)
                        {
                            flag= 1;
                            break;
                        }
                    }
                    if (flag ==0)
                    {
                        System.out.print(i+" ");
                    }
                }

                break;
            case 2:
                System.out.print("enter the bank rbi ,sbi or others - ");
                String a1= sc.next();
                if(a1.equals("rbi"))
                {
                    System.out.println("enter current or savings");
                    String a2= sc.next();
                    if(a2.equals("current")){

                        System.out.print("enter the balance - ");
                        int balance= sc.nextInt();
                        if(balance>50000){
                        System.out.print("enter the rate - ");
                        int r= sc.nextInt();
                        System.out.print("enter the time - ");int t=sc.nextInt();
                        double interest=(balance*r*t)/100;
                        double totalamount=balance+interest;
                        System.out.println("total amount - "+(totalamount));
                        System.out.print("enter w for withdraw and d for depoist");
                        char xc=sc.next().charAt(0);
                        if(xc=='d')
                        {
                            System.out.print("enter the amount to depoist - ");
                            int addbalance= sc.nextInt();
                            double xas= totalamount+addbalance;
                            System.out.println("total balance after deposit - "+(xas));
                        }
                        if(xc=='w')
                        {
                            System.out.print("enter the amount to withdrwal - ");
                            double withd= sc.nextInt();
                            System.out.println("total balance after withdrwal - "+(totalamount-withd));
                        }

                    }
                    else{
                            System.out.println("no interest");
                            System.out.println(balance);
                        }
                    }
                    else{
                        System.out.println("saving");
                    }
                }
                if(a1.equals("sbi")) {
                    System.out.println("enter current or savings");
                    String a2 = sc.next();
                    if (a2.equals("current")) {

                        System.out.print("enter the balance - ");
                        int balance = sc.nextInt();
                        if (balance > 50000) {
                            System.out.print("enter the rate - ");
                            int r = sc.nextInt();
                            System.out.print("enter the time - ");
                            int t = sc.nextInt();
                            double interest = (balance * r * t) / 100;
                            double totalamount = balance + interest;
                            System.out.println("total amount - " + (totalamount));
                            System.out.print("enter w for withdraw and d for depoist - ");
                            char xc = sc.next().charAt(0);
                            if (xc == 'd') {
                                System.out.print("enter the amount to depoist - ");
                                int addbalance = sc.nextInt();
                                double xas = totalamount + addbalance;
                                System.out.println("total balance after deposit - " + (xas));
                            }
                            if (xc == 'w') {
                                System.out.print("enter the amount to withdrwal - ");
                                double withd = sc.nextInt();
                                System.out.println("total balance after withdrwal - " + (totalamount - withd));
                            }

                        }
                        else {
                            System.out.println("balance - "+balance);
                        }
                    }
                }else {
                    System.out.println("no other bank");
                }
                break;
        }
    }
}