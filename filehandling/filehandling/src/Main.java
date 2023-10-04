import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cx234= sc.nextInt();
        switch (cx234)
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
                   f1.write("java is programuing lagungage");
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
                    File f2=new File("first.txt");
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
                File k=new File("first.txt");
                if(k.delete())
                {
                    System.out.println("deleted");
                }
                else {
                    System.out.println("not deleted");
                }
                break;
            case 5:
                String a1="667A5y7";
                String re="[0-9]{3}[a-zA-z][1][0-9]{1}[a-z][0-9]";
                Pattern p1=Pattern.compile(re);
                Matcher m1= p1.matcher(a1);

                if(m1.find()&&m1.group().equals(a1)){
                    System.out.println("valid");
                }
                else {
                    System.out.println("not valid");
                }
                break;
            case 6:
                String i1="you are java developer with id 1234567891";
                String re1="[0-9]\\d{9}";
                Pattern p12=Pattern.compile(re1);
                Matcher m12=p12.matcher(i1);
                while (m12.find())
                {
                    System.out.println(m12.group());
                }

                break;
        }
    }
}