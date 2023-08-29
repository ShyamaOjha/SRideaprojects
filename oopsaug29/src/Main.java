import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int z213= sc.nextInt();
    switch (z213){
        case 1:
            System.out.print("enter the name = ");
            String name= sc.next();
            System.out.print("enter the age = ");
            int age= sc.nextInt();
            person p1=new person(name,age);
            p1.setName(name);p1.setAge(age);
          p1.name_ag();
            break;
        case 2:
            String name12= sc.next();
            int age12= sc.nextInt();
            int id= sc.nextInt();
            Student st1=new Student(name12,age12,id);
            break;
        case 3:
            System.out.print("enter answer check = ");
            char c21=sc.next().charAt(0);
            if(c21=='c'){
                int r= sc.nextInt();
            cirlcle c1=new cirlcle(r);
            c1.calculateArea();}
            else{
                int l= sc.nextInt();
                int b= sc.nextInt();
            rectangle r1=new rectangle(l,b);
            r1.calculateArea();}
            break;
        case 4:
            int actno= sc.nextInt();
            int balno= sc.nextInt();
            String ow= sc.next();
            Bankaccount bc1=new Bankaccount(actno,balno,ow);
            
            break;
        case 5:
            new cat().makeSound();
            System.out.println();
            new Dog().makeSound();
            break;
        case 6:
            int make= sc.nextInt();
            int year= sc.nextInt();
            String model= sc.next();
            Car c1=new Car();
            Car c2=new Car(make,model,year);

            break;
        case 7:
            int a= sc.nextInt();
            int b= sc.nextInt();
            Calculator c12=new Calculator(a,b);
            c12.add();
            System.out.println();c12.add(2);
            System.out.println();c12.add(4.6f);
            System.out.println();c12.add(1,1);
            break;
        case 9:
            Guitar g1=new Guitar();
            g1.methodplay();
        break;
        case 10:
            char c23=sc.next().charAt(0);
            if(c23=='r'){
            int l1= sc.nextInt();
            int b1= sc.nextInt();
            rectangle1 r1=new rectangle1(l1,b1);}
            else {
                int r12= sc.nextInt();
                circle1 c123=new circle1(r12);
            }
            break;
            // moderate level
        case 11:
            String book1= sc.nextLine();
            sc.next();
            String authore= sc.nextLine();
            Book b1=new Book(book1,authore);
            if(b1.equals("Shriram")&&b1.equals("ram"))
            {
                System.out.println("book availble");
            }
            else {
                System.out.print("not avaible");
            }
            break;
        case 12:
           new MP3Player().playmusic();
            break;
        case 13:
            char c546=sc.next().charAt(0);
            if(c546=='c'){
            circle2 c324=new circle2();}
            else{
            rectangle2 r345=new rectangle2();}
            break;
        case 14:
           new document().print();
           new IMAGE().print();
            break;
        case 15:
            int moakeyear= sc.nextInt();
            sc.next();
            String model1= sc.nextLine();
           new Car6(moakeyear,model1).display();
            new Motorcycle(moakeyear,model1).display();
            break;
    }
    }
}