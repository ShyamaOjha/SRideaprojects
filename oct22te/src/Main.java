import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void palindromecheck(char a[]){
        int i=0, j=a.length-1;
        int flag=0;

        while(i<j){
            if( a[i]!= a[j]){
                flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag==1) {
            System.out.println("no pallindrome");
        }
        else{
            System.out.println("pallindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x213= sc.nextInt();
        switch (x213)
        {
            case 1:
                ArrayList <Integer> a1=new ArrayList<>();
                a1.add(1); a1.add(2); a1.add(3); a1.add(4); a1.add(5);
               // first answeer
                System.out.print(a1+" ");
                System.out.println();
                a1.remove(2);
                //second answeer
                System.out.println(a1);
                //third ans
                a1.set(1,10);
                //fourth answer
                int sum = 0;
                for (Integer element :a1) {
                    sum= sum+element;
                }
                System.out.println("sum of array list "+sum);
                //fifthsout;
                Collections.sort(a1);
                break;
            case 2:
                HashMap <String,Integer> hs1=new HashMap<>();
                hs1.put("Alice",90); hs1.put("bob",85); hs1.put("charlie",95);
                System.out.println(hs1);
                hs1.remove(hs1,85);
                System.out.println(hs1);
                boolean iskey=hs1.containsKey("charlie");
                System.out.println(iskey);

                break;
            case 3:
                HashSet h1=new HashSet<>();
                h1.add("Red"); h1.add("Green"); h1.add("blue"); h1.add("Red");h1.add("yellow");
                System.out.println(h1);
                //b
                boolean as=h1.contains("Green");
                System.out.println(as);
                //c
                h1.remove("blue");
                System.out.println(h1);
                // d
                for (Object colour:h1)
                {
                    System.out.println(colour);
                }
                break;
            case 4:
                String email = "sw.ghanshyam@gmail.com";
                Pattern emailid = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
//                Matcher emailMatcher = emailid.matches(email);
//                boolean isvalid = emailMatcher.matches();
//                System.out.println( isvalid);
                break;
            case 5:
            String palincehck= sc.next();
            char ap[]=palincehck.toCharArray();
            palindromecheck(ap);
                break;
            case 6:
            int x1= sc.nextInt();
            int x2= sc.nextInt();
            char x=sc.next().charAt(0);
            if(x=='v'){
            int temp=x1;
            x1=x2;
            x2=temp;
                System.out.println("after swaped "+x1);
                System.out.println("last swaped "+x2);}
            else{
                x1=x1+x2;
                x2=x1-x2;
                x1=x1-x2;
                System.out.println(x1+" "+x2);
            }
                break;
            case 7:
            int primenumbercheck = sc.nextInt(); int flag=0;
                for(int i=2;i<primenumbercheck;i++){
                    if(primenumbercheck%i==0){
                        System.out.println(primenumbercheck+"is not prime");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)  {
                    System.out.println(primenumbercheck+"is a prime"); }
                break;

            case 8:
                System.out.println("take a input");
                int x2131= sc.nextInt();
                switch (x2131)
                {
                    case 1:
                        int x2132= sc.nextInt();
                        if(x2132%2==0)
                        {
                            System.out.println("even");
                        }
                        else {
                            System.out.println("odd");
                        }
                        break;
                    case 2:
                        int x21321= sc.nextInt();
                        if(x21321%2==0)
                        {
                            System.out.println("even no");
                        }
                        else {
                            System.out.println("odd no");
                        }
                        break;
                    case 3:
                        int armstorn= sc.nextInt();int sum1=0;int x23231=armstorn;
                        while (armstorn>0)
                        {
                            int rem=armstorn%10;
                            sum1=sum1+(rem*rem*rem);
                            armstorn=armstorn/10;
                        }
                        if(x23231==sum1)
                        {
                            System.out.println("armstrong");
                        }
                        else {
                            System.out.println("not armstrong");
                        }

                        break;
                    case 4:
                        int palin= sc.nextInt();int sum2=0;int x232311=palin;
                        while (palin>0)
                        {
                            int rem1=palin%10;
                            sum2=(sum2*10)+(rem1);
                            palin=palin/10;
                        }
                        if(sum2==x232311)
                        {
                            System.out.println("palindrome");
                        }
                        else {
                            System.out.println("not palindrome");
                        }
                    break;
                    case 5:
                    int facto= sc.nextInt();int fact=1;
                        for (int i = 1; i <=facto ; i++) {
                            fact=fact*i;
                        }
                        System.out.println(fact);
                    break;
                    case 6:
                    int f1=0;
                    int f2=1;
                    int f3;
                    int no1= sc.nextInt();
                        System.out.print(f1+" "+f2+" ");
                        for (int i =3 ; i <= no1; i++) {
                           f3= f1 + f2;
                            System.out.print(f3+" ");
                            f1 = f2;
                            f2 = f3;
                        }
                        break;
                }
                break;
            case 9:
                int abc= sc.nextInt();
                int square = abc * abc;
                int sum3 = 0;

                while (square != 0) {
                    sum3 += square % 10;
                    square /= 10;
                }
                System.out.println(sum3);
                break;
            case 10:
            int x21= sc.nextInt();
                for (int i = 1; i <=x21 ; i++) {
                    for (int j = 1; j <=x21 ; j++) {
                        if(i==1||j==1||i==j)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("enter the input 1 to 10");
                break;

        }
    }


}