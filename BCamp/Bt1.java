import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the question you want to see - ");
        int x213= sc.nextInt();
        switch (x213)
        {
        case 1:
                System.out.print("enter vechile number - ");
                int vechileno=sc.nextInt();int sum=0;int count=0;
                while (vechileno>0)
                {
                    int rev=vechileno%10;
                    sum=sum+rev;
                    count++;
                }
                if((sum%3==0||sum%5==0||sum%7==0)&&count>3)
                {
                    System.out.print("lucky number");
                }
                else{
                    System.out.println("not lucky number");
                }
            break;
        case 2:
                System.out.print("enter the salary - ");
                int salary= sc.nextInt();
                System.out.print("enter the rating - ");
                float rating= sc.nextFloat();

                if(salary<0)
                 {
                System.out.print("invalid input");
                }
                else{
                if (rating<1 && rating<3)
                {
                    int total=salary+(int)(0.10*salary);
                    System.out.println(total);
                }
                else if (rating>3 &&rating<=4)
                {
                    int total=salary+(int)(0.25*salary);
                    System.out.println(total);
                }
                else if(rating>=4 && rating<=5){
                    int total=salary+(int)(0.30*salary);
                    System.out.println(total);
                }
                }
                break;
        case 3:
                System.out.print("enter the number - ");
                int number=sc.nextInt();int extranumber=number;
               int sum1=0;
                while (number>0)
                {
                    int rem=number%10;
                    sum1=(sum1*10)+rem;
                    number=number/10;
                }
                if(sum1==extranumber)
                {
                    System.out.print("palindrome");
                }
                else {
                    System.out.println("not palindrome");
                }
                break;
        case 4:
        System.out.println("Enter first number");
        System.out.println("Enter first number");
        int b= sc.nextInt();
        int a= sc.nextInt();
         if(a>=b || a<0 || b<0)
         {
             System.out.println("Provide valid input");
         }
         else {
            for(int i=a;i<=b;i++)
            {
                int flag=0;
                int j=2;
                while (j<i)
                {
                    if(i%j==0)
                    {
                        flag=1;
                        break;
                    }
                    j++;
                }
                if(flag==0)
                    System.out.print(i+" ");
            }
         }
                break;
        case 5:
                int monthcehck=sc.nextInt();
                if(monthcehck>=3 && monthcehck<=5)
                {
                    System.out.println("Spring");
                } else if (monthcehck>=6 && monthcehck<=8) {
                    System.out.println("summer");
                }
                else if(monthcehck>=9 && monthcehck<=11)
                {
                    System.out.println("Autumn");
                }
                else {
                    System.out.println("Winter");
                }
                break;
        case 6:
                System.out.print("enter the no of ticket - ");
                int noofticket= sc.nextInt();
                System.out.print("refreshement yes or no- ");
                boolean refresment= sc.nextBoolean();
                System.out.print("coupon code yes or no - ");
                boolean coupon= sc.nextBoolean();
                System.out.print("ent the circle - ");
                char class1=sc.next().charAt(0);
                if((noofticket>20)&& refresment==true && coupon==true)
                {
                    if(class1=='k') {
                        int k = 75;
                        int refresprice = 50;
                        int refreshmentexpense=(noofticket*refresprice);
                        int ticekexpense = (k * noofticket);
                        double afterdis=ticekexpense-(ticekexpense*0.10);
                        double copoumafrer=afterdis-(afterdis*0.02);
                        double totalamount=copoumafrer;
                        double finalamount=totalamount+refreshmentexpense;
                        System.out.println(finalamount);
                    }
                    else if(class1=='q')
                    {
                        int q = 150;
                        int refresprice = 50;
                        int refreshmentexpense=(noofticket*refresprice);
                        int ticekexpense = (q * noofticket);
                        double afterdis=ticekexpense-(ticekexpense*0.10);
                        double copoumafrer=afterdis-(afterdis*0.02);
                        double totalamount=copoumafrer;
                        double finalamount=totalamount+refreshmentexpense;
                        System.out.println(finalamount);
                    }
                }
                else if(noofticket==1)
                {
                    System.out.println("Minimum of five ticekts and 40 tickets required for booking");
                }
                break;
        case 7:
                System.out.print("enter studelnt placed in cse - ");
                int cse= sc.nextInt();
                System.out.print("enter studelnt placed in ece - ");
                int ece= sc.nextInt();
                System.out.print("enter studelnt placed in mech - ");
                int mech= sc.nextInt();
                if(cse<0 || ece<0 || mech<0)
                {
                    System.out.println("invalid input");
                }
                else{
                if(cse==0 || ece==0 || mech==0)
                {
                    System.out.println("nono of department");
                }
                else if(cse>ece || ece>mech)
                {
                    System.out.println("cse - "+cse);
                }
                else if(cse==ece && ece==mech)
                {
                    System.out.println("all department have equal placmenet");
                }
                else if(cse==ece)
                {
                    System.out.println("cse and ese are equal palcement");
                }
                else if(ece==mech)
                {
                    System.out.println("ece and mech are equal palcement");
                }
                else if(ece>mech)
                {
                    System.out.println("ece - "+ece);
                }
                else if(mech>ece && ece>cse)
                {
                    System.out.println("mech - "+mech);
                }
                }
                break;
        case 8:
                int a008= sc.nextInt();int a08= sc.nextInt(); int a8= sc.nextInt(); int case8= sc.nextInt();
                char c008=(char)a008; char c08=(char)a08; char c8=(char)a8; char case008=(char)case8;
                System.out.println(a008+" - "+c008); System.out.println(a08+" - "+c08); System.out.println(a8+" - "+c8);
                System.out.println(case8+" - "+case008);
                break;
        case 9:
                int pizza= sc.nextInt(); int puff= sc.nextInt(); int drink= sc.nextInt();
                System.out.println("pizza - "+pizza); System.out.println("puff - "+puff); System.out.println("drink - "+drink);
                int total=(pizza*100)+(puff*20)+(drink*10);
                System.out.println("total price - "+total);
                System.out.println("ENJOY THE SHOW!!");
                break;
        case 10:
                System.out.print("enter the quantity of diesel to fill up the tank - "); int diesel= sc.nextInt();
                System.out.print("enter the distance covered till the tank goes dry - ");int distance= sc.nextInt();
                int fuel=diesel*100+(distance*10);
                System.out.println("fuel - "+fuel);
                System.out.println();
                break;
        }
    }
}
