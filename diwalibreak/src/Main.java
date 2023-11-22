import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;

public class Main {
    static Scanner sc1=new Scanner(System.in);
    public static void scanarray(int a[])
    {
        for (int i = 0; i <a.length ; i++) {
            a[i]=sc1.nextInt();
        }
    }
    public static int calculateAge(LocalDate birthdate) {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthdate, currentDate).getYears();
        return age;
    }
    public static boolean isStrongNo(int number) {
        int sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
         //   sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == number;
    }
    public static int[] intersectioncheck(int[] a1, int[] a12)
    {
        HashSet<Integer> intersection = new HashSet<>();
        for (int i = 0; i < a1.length; i++) {
            if (intersection.contains(a1[i])) {
                intersection.add(a1[i]);
            }
        }
        int[] intersectionArray = new int[intersection.size()];
        int i = 0;
        for (int element : intersection) {
            intersectionArray[i] = element;
            i++;
        }
        return intersectionArray;
    }
    public static boolean isStrongNumber(int n3) {
        int sum = 0;
        int originalNumber = n3;

        while (n3 > 0) {
            int digit = n3 % 10;
            sum += factorial(digit);
            n3 /= 10;
        }
        return false;
    }
    private static int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }}


    static void removeDuplicates(int[] array) {
        int i = 0;
        int j = 1;

        while (j < array.length) {
            if (array[j] == array[i]) {
                j++;
                continue;
            }
            int temp = array[i + 1];
            array[i + 1] = array[j];
            array[j] = temp;
            i++;
            j++;
        }
    }
    public static int secondSmall(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }
    public static void rotatearray(int[] a3, int k) {
        k = k % a3.length;
        for (int i = 0; i < k; i++) {
            int temp = a3[a3.length - 1];
            for (int j = a3.length - 1; j > 0; j--) {
                a3[j] = a3[j - 1];
            }
            a3[0] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter question you want to see - ");
        int zcxwe123= sc.nextInt();
        switch (zcxwe123)
        {
            case 1:
                System.out.print("Player 1, choose rock, paper, or scissors:");
                String p1choice = sc.next();
                System.out.print("Player 2, choose rock, paper, or scissors:");
                String p2choice = sc.next();

                if (p1choice.equals("rock") && p2choice.equals("scissors")) {
                    System.out.println("Player 1 wins!");
                } else if (p1choice.equals("scissors") && p2choice.equals("paper")) {
                    System.out.println("Player 1 wins!");
                } else if (p1choice.equals("paper") && p2choice.equals("rock")) {
                    System.out.println("Player 1 wins!");
                } else if (p1choice.equals(p2choice)) {
                    System.out.println("Tie.");
                } else {
                    System.out.println("Player 2 wins!");
                }
                break;
            case 2:
                int year= sc.nextInt();
                Boolean isLeapyear= year%4==0 && (year%100!=0 ||year%400==0);
                if(isLeapyear)
                {
                    System.out.print("leap year");
                }
                else {
                    System.out.print("Not a leap year");
                }
                break;
            case 3:
                int number3= sc.nextInt();
                if(number3>0)
                {
                    System.out.print("positive");
                }
                else if(number3<0)
                {
                    System.out.println("negative");
                }
                else {
                    System.out.print("zero");
                }
                break;
            case 4:
                String email="sw.ghanshyam@gmail.com";
                Pattern pat1=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9. -]+$");
                Matcher match=pat1.matcher(email);
                break;
            case 5:
                int number01= sc.nextInt();
                int number02= sc.nextInt();
                System.out.print("sum = "+(number01+number02));
                System.out.println();
                System.out.print("sub = "+(number01-number02));
                System.out.println();
                System.out.print("mul = "+(number01*number02));
                System.out.println();
                System.out.print("divi = "+(number01/number02));
                break;
            case 6:
                System.out.print("Enter the year:");
                int year1 = sc.nextInt();

                System.out.print("Enter the month:");
                int month1 = sc.nextInt();

                int noofday = 0;

                if (month1 == 2) {
                    boolean isLeapYear = year1 % 4 == 0 && (year1 % 100 != 0 || year1 % 400 == 0);
                    noofday = isLeapYear ? 29 : 28;
                } else {
                 //   noofday = month1 in (1, 3, 5, 7, 8, 10, 12) ? 31 : 30;
                }
                System.out.println("The number of days in " + month1 + "/" + year1 + " is " + noofday);
                break;
            case 7:
                int number07 = sc.nextInt();
                boolean isperfsquare = Math.sqrt(number07) % 1 == 0;
                if (isperfsquare) {
                    double squareRoot = Math.sqrt(number07);
                    System.out.println(number07 + " is a perfect square. Its square root is " + squareRoot);
                }
                else {
                    System.out.println(number07 + " is not a perfect square.");
                }
                break;
            case 8:
                System.out.print("enter your birthday (yyyy-mm-dd)");
                String birthdaystring= sc.nextLine();
                LocalDate birthdate=LocalDate.parse(birthdaystring);
                int age=calculateAge(birthdate);
                System.out.println(age);
                break;
            case 9:
                
                break;
            case 10:
                System.out.println("Enter annual income: ");
                double income = sc.nextDouble();
                double taxRate;
                if (income <= 50000) {taxRate = 0.1;}
                else if (income <= 100000) { taxRate = 0.2; }
                else { taxRate = 0.3;}

                double incomeTax = income * taxRate;
                System.out.println("Income tax -" + incomeTax);
                break;
            case 11:
                for (int i = 2; i <= 100; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(i);
                    }
                }
                break;
            case 12:
                int sum = 0;
                for (int i = 2; i <= 100; i += 2) {
                    sum =sum+(i * i);
                }
                System.out.println("sum = : " + sum);
            case 13:
                int n13 = sc.nextInt();
                if (isStrongNumber(n13)) {
                    System.out.println(n13 + " is a strong number.");
                } else {
                    System.out.println(n13 + " is not a strong number.");
                }
                break;
            case 14:
                int rows = sc.nextInt();
                int[][] pass = new int[rows][rows];
                pass[0][0] = 1;
                for (int i = 1; i < rows; i++) {
                    pass[i][0] = 1;
                    for (int j = 1; j < i + 1; j++) {
                        pass[i][j] = pass[i - 1][j - 1] + pass[i - 1][j];
                    }
                }
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(pass[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 15:
                int[] arr15 = {14, 11, 3, 9, 2, 16, 4};
                int secondSmallest = secondSmall(arr15);
                System.out.println("Second smallest element: " + secondSmallest);
                break;
            case 16:
                int[] arr16 = {1, 2, 3, 4, 5, 6, 7};
                int k = 2;
                System.out.println("Original array:");
                for (int i = 0; i < arr16.length; i++) {
                    System.out.print(arr16[i] + " ");
                }

                rotatearray(arr16, k);

                System.out.println("\nArray after rotating to the right by " + k + " steps:");
                for (int i = 0; i < arr16.length; i++) {
                    System.out.print(arr16[i]+" ");
                }
                break;
            case 17:

                break;
            case 18:
                int size= sc.nextInt();
                int array1[]=new int[size] ;
                scanarray(array1);

                break;
            case 19:
                int size19= sc.nextInt();
                int array19[]=new int[size19];
                for (int i = 0; i <array19.length ; i++) {
                array19[i]= sc.nextInt();
               }
                int array019[]=new int[size19];
                for (int i = 0; i <array019.length ; i++) {
                    array019[i]= sc.nextInt();
                }
                int [] intersect=intersectioncheck(array19,array019);
                System.out.print("intersection array are - ");
                for (int i:intersect) {
                    System.out.print(i+" ");
                }
                break;
            case 20:

                break;
            case 21:

                break;
            case 22:

                break;
            case 23:

                break;
            case 24:

                break;
            case 25:
                Employee e1 = new Employee(1, "John Doe");
                e1.displayDetails();
                Manager ma1 = new Manager(2, "Jane Doe", "Sales");
                ma1.displayDetails();
                Clerk cl1 = new Clerk(3, "Peter Parker", 10000);
                cl1.displayDetails();
                break;
            case 26:
                Circle ci1 = new Circle(7);
                ci1.displayDetails();
                Rectangle rect1 = new Rectangle(11, 15);
                rect1.displayDetails();
                Triangle tri1 = new Triangle(7, 8);
                tri1.displayDetails();
                break;
            case 27:
                Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1000);
                book.checkOut();
                DVD dvd = new DVD("The Shawshank Redemption", "Frank Darabont", 142);
                dvd.checkOut();
                book.returnItem();
                dvd.returnItem();
                break;
            case 28:
                Circle2 circle = new Circle2(6);
                double circleArea = circle.calculateArea();
                System.out.println("area : " + circleArea);
                Rectangle2 rectangle = new Rectangle2(7, 5);
                double rectangleArea = rectangle.calculateArea();
                System.out.println("area of the rectangle: " + rectangleArea);
                break;
            case 29:
                Dog dog = new Dog();
                dog.makeSound();
                Cat cat = new Cat();
                cat.makeSound();
                Horse horse = new Horse();
                horse.makeSound();
                break;
            case 30:

                break;
            case 31:
                ArrayList a31=new ArrayList();
                a31.add(1);a31.add(2);a31.add(3);a31.add(4);a31.add(5);a31.add(6);
                Iterator i1=a31.iterator();
                while (i1.hasNext()){
                    System.out.print(i1.next()+" ");
                }
                System.out.println();
                break;
            case 32:
                HashMap <String,Integer> a32=new HashMap<>();
                a32.put("ankit",20);a32.put("rohit",21);a32.put("saket",30);a32.put("mohit",15);a32.put("manish",18);
                for (Map.Entry m:a32.entrySet())
                {
                    System.out.println(m.getKey()+"   "+m.getValue());
                }
                System.out.println();
                boolean answer32= a32.containsKey("ankit");
                System.out.println(answer32);
                System.out.println();
                Iterator<Map.Entry<String, Integer>> iterator = a32.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, Integer> entry = iterator.next();
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                break;
            case 33:
                HashSet <String> h33=new HashSet<>();
                h33.add("ankit"); h33.add("sumit"); h33.add("mokit"); h33.add("sohit"); h33.add("manish");h33.add("ankit");
                for(String obj:h33){
                    System.out.println(obj+" ");
                }
                HashSet <String> h033=new HashSet<>();
                h033.add("nimesh"); h033.add("sumit"); h033.add("lokesh"); h033.add("sohit"); h033.add("manish");h033.add("suresh");
                break;
            case 34:
                Pattern pattern1 = Pattern.compile("[a-z]+");
                System.out.println(pattern1);
                break;
            case 35:
                Pattern pattern = Pattern.compile("[a-z]+");
                Matcher matcher = pattern.matcher("Hello, world!");
                boolean matchFound = matcher.matches();
                System.out.println("Match found: " + matchFound);
                break;
            case 36:
                String str = "My name is sumo panda";
                String[] split = str.split("\\s+");
                for (String word : split) {
                    System.out.println(word);
                }
                break;
            case 37:
                try (FileReader reader = new FileReader("myfile.txt")) {

                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 38:
                try (FileWriter writer = new FileWriter("manish.txt")) {
                    writer.write("lines as - ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 39:
                try (FileReader reader1 = new FileReader("myfile1.txt")) {
                    Scanner scanner = new Scanner(reader1);
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        System.out.println(line);
                    }
                    scanner.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 40:

                break;
            case 41:
                
                break;
            case 42:

                break;
            case 43:
            try {
                int a=45/0;
            }catch (Exception ex)
            {
                System.out.print(ex);
                System.out.println();
            }
            finally {
                System.out.print("finally excuted");
            }
                break;
            case 44:
                int a44[]={1,2,3,4,5};
                try {
                    int x=a44[7];
                }catch (Exception ex)
                {
                    System.out.println(ex);
                }
                break;
            case 45:
                File file = new File("my_file.txt");
                try {
                    FileWriter wr1 = new FileWriter(file);
                    wr1.write("This is a interview.");
                    wr1.close();
                } catch (IOException e) {
                    System.out.println("Error writing");
                    e.printStackTrace();
                } finally {
                sc.close();
                }
                break;
            case 46:
                try {
                    int q46 = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                    sc.nextLine(); }//
                break;
            case 47:

                break;
            case 48:
                break;
            case 49:
                break;
            case 50:
//                Car car = new Car(engine);
//                car.startEngine();
//                car.stopEngine();
                break;
        }
    }
}

