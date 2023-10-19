import java.util.Scanner;

public class Main {
    static void count(char a[])
    {
        int count=0;
        for (int i = 0; i <a.length ; i++) {
            count++;
        }
        System.out.print("length of string is - "+count);
    }
    static void printArray(char a1[])
    {
        for (int i = 0; i <a1.length ; i++) {
            System.out.print(a1[i]);
        }
    }
    static void charcheck(char a1[],char check){
        int flag=0;
        for (int i = 0; i < a1.length ; i++) {
                if(a1[i]==check)
                {
                    flag=1;
                }
            }
            if(flag==1){
                System.out.println("present");}
            else {
                System.out.println("not there");
            }
        }

        static void indexcheck(char a[],int check)
        {
            for (int i = 0; i <a.length ; i++) {
                if(check==a[i])
                {
                    System.out.print(i);
                }
            }
        }
        static void stringreverse(char a[])
        {
            for (int i = a.length-1; i >=0 ; i--) {
                System.out.print(a[i]);
        }}
    static void spacecount(char a[])
    {   int count09=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==' ')
            {
                count09++;
            }
        }
        System.out.println("total space count - "+count09);
    }
    static void vowelcheck(char a[])
    {   int flag11=0;
        for (int i = 0; i <a.length ; i++) {
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
        {
           flag11++;
        }
        }
        System.out.println("total vowels are - "+flag11);

    }
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
        int x234= sc.nextInt();
        switch (x234)
        {
            case 1:
            String name= sc.next();
            char []a=name.toCharArray();
            //count(a);
            count(a);

                break;
            case 2:
            String name1= sc.next();
            char []a1=name1.toCharArray();
               printArray(a1);
                break;
            case 3:
                String name2= sc.next();
                char []a2=name2.toCharArray();
                int count3=0;
                for (int i = 0; i <a2.length ; i++) {
                   count3++;
                }
                System.out.println(count3);
                break;
            case 4:
            String charactercheck= sc.next();
            char []a3=charactercheck.toCharArray();
                System.out.println("enter the charcater which you want to check");
                char check11=sc.next().charAt(0);
            charcheck(a3,check11);
                break;
            case 5:
            String a11= sc.next();
            String b12= sc.next();
            String c13=a11.concat(b12);
                System.out.println(c13);
                break;
            case 6:
            String a6= sc.next();
            String charindex= sc.next();
            int i=a6.indexOf(charindex);
            System.out.println(i);

                break;
            case 7:
            String a7= sc.next();
            String charindex1= sc.next();
            int i1=a7.indexOf(charindex1,2);
            System.out.println(i1);
                break;

            case 8:
            String name3="regex is a learning";
            boolean k=name3.contains("learning");
                System.out.println(k);
                break;
        // while using null in contain if the condtion is not satifsfied than its throw nullpointer exception
            case 9:
            String name4= sc.next();
            sc.nextLine();
            String asc3= sc.next();
            boolean k1=name4.contains(asc3);
                System.out.println(k1);
                break;
            case 10:
            // join
            String sc10=String.join("-","Salom","Israel");
                System.out.println(sc10);
                break;
            case 11:
            String indexheck1=sc.next();
                char []a4=indexheck1.toCharArray();
            char xsc213=sc.next().charAt(0);
            indexcheck(a4,xsc213);
                break;
            case 12:
                String a121=sc.next();
                char []acsas=a121.toCharArray();
            stringreverse(acsas);
            case 13:
                Scanner sc213=new Scanner(System.in);
            String a123321=sc213.nextLine();
            char []c342=a123321.toCharArray();
            vowelcheck(c342);
                break;
            case 14:
                Scanner ssc=new Scanner(System.in);
            String a32132=ssc.nextLine();
            char []a234=a32132.toCharArray();
            spacecount(a234);
                break;
            case 15:
                Scanner sc312=new Scanner(System.in);
                String x2123132=sc312.nextLine();
                char a13[]=x2123132.toCharArray();
              palindromecheck(a13);
                //palindromecheck(a13);
                break;
            // 20,21,22 string method to applied

         }
    }
}