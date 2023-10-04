import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class A{
    void show(int...b)
    {
        for(int i:b)
        {
            System.out.println(i);
        }
    }
}

public class Main {

   static void javadefine(){
        System.out.println("java is define");
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int x234234= sc.nextInt();
        switch (x234234)
        {
            case 1:
                try {
                    String name= sc.next();
                    File f1=new File(name);
                    if(f1.createNewFile())
                    {
                        System.out.println("file is created "+f1.getName());
                    }
                }
                catch (IOException E)
                {
                    System.out.println("error");
                }
                break;
            case 2:
                try {
                    FileWriter f1=new FileWriter("first.txt");
                    String x23= sc.nextLine();
                    f1.write(x23);
                    f1.close();
                    System.out.println("successufulyy file is maded");
                }
                catch (Exception ex){
                    System.out.println("error");
                }
                break;
            case 3:
                String s1= sc.nextLine();
                File k=new File(s1);
                if(k.equals(s1))
                {
                    System.out.println("yes file present");
                }
                else {
                    System.out.println("not present");}
                break;
            case 4:
                try {
                String name= sc.next();
                File f1=new File(name);
                if(f1.createNewFile())
                {
                    System.out.println("file is created "+f1.getName());
                }
                FileWriter f2=new FileWriter(f1);
                String x23= sc.nextLine();
                f2.write(x23);
                f2.close();
                }
                catch (Exception e)
                {
                    System.out.println("error");
                }
                break;
            case 5:
                String email= sc.nextLine();
                String username= sc.nextLine();

                break;
            case 6:
                        new A().show(1,2,3,4,5,6,7,8);

                break;
            case 7:
                System.out.println("enter which question you want to see");
                int a21= sc.nextInt();
                switch (a21)
                {
                    case 1:

                        break;
                    case 2:
                        System.out.print("swap tow number");
                        int a= sc.nextInt();
                        int b= sc.nextInt();

                        int temp=a;
                         a=b;
                        b=temp;
                        System.out.println("swaped number "+a+ " "+b);
                        break;
                    case 3:
                    int x21= sc.nextInt();int sum=0;int x1212=x21;
                    while (x21>0)
                    {
                        int rem=x21%10;
                        sum=sum+(rem*rem*rem);
                        x21=x21/10;
                    }
                    if(sum==x1212)
                    {
                        System.out.println("armstrong");
                    }
                    else {
                        System.out.println("not armstrong");
                    }
                        break;
                    case 4:
                        int n= sc.nextInt();
                        int a01=0;
                        int b01=1;
                        System.out.print(a01+" ");
                        System.out.print(b01+" ");

                        for(int i=3;i<=n;i++)
                        {
                            int temp1;
                            temp1=a01+b01;
                            System.out.print(temp1+" ");
                            a01=b01;
                            b01=temp1;
                        }
                        break;
                    case 5:
                    int x23234= sc.nextInt();int facto=1;
                        for (int i = 1; i <= x23234; i++) {
                            facto=facto*i;
                        }
                        System.out.println(facto);
                        break;
                    case 6:
                        int x22= sc.nextInt();int sum1=0;int x12112=x22;
                        while (x22>0)
                        {
                            int rem=x22%10;
                            sum1=(sum1*10)+rem;
                            x22=x22/10;
                        }
                        if(sum1==x12112)
                        {
                            System.out.println("pallindrome");
                        }
                        else {
                            System.out.println("not pallindrome");
                        }
                        break;
                }
            case 8:
                System.out.print("enter the size of an array - ");
                int x2321= sc.nextInt();
                int a12[]=new int[x2321];
                int flag=0;

                int i=0;
                int j=a12.length-1;
                for (int l = 0; l < a12.length; l++) {
                    a12[i]=sc.nextInt();
                }
                while(i<j)
                {
                    if(a12[i]!=a12[j])
                    {
                        flag=1;
                        break;
                    }
                    i++;
                    j--;
                }
                if(flag==0)
                    System.out.println(" palindrome");
                else
                    System.out.println("not palindrome");
                break;
            case 9:
                String asd= sc.nextLine();
                try {
                    File f2=new File(asd);
                    Scanner reader=new Scanner(f2);

                    while (reader.hasNextLine())
                    {
                        String data=reader.nextLine();
                        System.out.println(data);
                        reader.close();
                        break;
                    }
                }
                catch (Exception E)
                {
                    System.out.println("error");
                }
                break;
            case 10:
                File k1=new File("first.txt");
                if(k1.delete())
                {
                    System.out.println("deleted");
                }
                else {
                    System.out.println("not deleted");
                }
                break;
            case 11:
                int x213= sc.nextInt();
                switch (x213){
                    case 1:
                        try {
                        String filename= sc.nextLine();
                            File f1=new File(filename);
                            if(f1.createNewFile())
                            {
                                System.out.println("file is created "+f1.getName());
                            }
                        }
                        catch (IOException E)
                        {
                            System.out.println("error");
                        }
                        break;
                    case 2:
                        try {
                            String sdfs= sc.nextLine();
                            FileWriter f1=new FileWriter(sdfs);
                            String sdfsa= sc.nextLine();
                            f1.write(sdfsa);
                            f1.close();
                            System.out.println("successufulyy file is maded");
                        }
                        catch (Exception E)
                        {
                            System.out.println("error");
                        }
                        break;
                    case 3:
                        try {
                            String sdffdssfd= sc.nextLine();
                            File f2=new File(sdffdssfd);
                            Scanner reader=new Scanner(f2);

                            while (reader.hasNextLine())
                            {
                                String data=reader.nextLine();
                                System.out.println(data);
                                reader.close();
                                break;
                            }
                        }
                        catch (Exception E)
                        {
                            System.out.println("error");
                        }
                        break;
                    case 4:
                        File k3=new File("first.txt");
                        if(k3.delete())
                        {
                            System.out.println("deleted");
                        }
                        else {
                            System.out.println("not deleted");
                        }
                        break;
                }
                break;
        }
    }
}