import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     char as=sc.next().charAt(0);
     if(as=='f'){
        System.out.print("enter the question you want too see- ");

     int x213= sc.nextInt();

     switch (x213) {
         case 1:
             List<Integer> al1 = new ArrayList<>();
             System.out.print("enter the number you want to add-  ");
             int n = sc.nextInt();
             for (int i = 0; i < n; i++) {
                 int element = sc.nextInt();
                 al1.add(element);
             }
             System.out.print(al1 + " ");
             break;
         case 2:
             List<String> ls1 = new ArrayList<>();
             System.out.print("enter the number you want to add-  ");
             int n1 = sc.nextInt();
             for (int i = 0; i < n1; i++) {
                 String element1 = sc.nextLine();
                 ls1.add(element1);
             }
             System.out.print(ls1 + " ");
         case 3:
             List<String> ls10 = new LinkedList<>();
             System.out.print("enter the number you want to add-  ");
             int n2 = sc.nextInt();
             for (int i = 0; i < n2; i++) {
                 String element1 = sc.nextLine();
                 ls10.add(element1);
             }
             System.out.print(ls10 + " ");

             break;
         case 4:
             List<String> ls11 = new LinkedList<>();
             System.out.print("enter the number you want to add-  ");
             int n11 = sc.nextInt();
             for (int i = 0; i < n11; i++) {
                 String element1 = sc.nextLine();
                 ls11.add(element1);
             }
             System.out.print(ls11 + " ");
             break;
         case 5:
             Vector al = new Vector();
             System.out.print("enter the number you want to add-  ");
             int n02 = sc.nextInt();
             System.out.println("enter the vector list - ");
             for (int i = 0; i < n02; i++) {
                 int x = sc.nextInt();
                 al.add(x);
             }
             System.out.println(al);
             break;
         case 6:
             List l1 = new ArrayList();
             System.out.print("enter the size - ");
             int n6 = sc.nextInt();
             System.out.print("enter the number you want to add-  ");
             for (int i = 0; i < n6; i++) {
                 float x = sc.nextFloat();
                 l1.add(x);
             }
             System.out.println(l1);
             break;
         case 7:
             List l2 = new ArrayList();
             System.out.print("enter the size - ");
             int n7 = sc.nextInt();
             System.out.print("enter the number you want to add-  ");
             for (int i = 0; i < n7; i++) {
                 double x = sc.nextDouble();
                 l2.add(x);
             }
             System.out.println(l2);
             break;
         case 8:
             List l3 = new ArrayList();
             System.out.print("enter the size - ");
             int n8 = sc.nextInt();
             System.out.print("enter the number you want to add-  ");
             for (int i = 0; i < n8; i++) {
                 char x = sc.next().charAt(0);
                 l3.add(x);
             }
             System.out.println(l3);
             break;
         case 9:
             Vector<Character> vc9 = new Vector();
             int n9 = sc.nextInt();

             for (int i = 0; i < n9; i++) {
                 char x = sc.next().charAt(0);
                 vc9.add(x);
             }
             System.out.println(vc9);
             break;
         case 10:
             ArrayList<Long> al10 = new ArrayList();
             int n10 = sc.nextInt();

             for (int i = 0; i < n10; i++) {
                 long x = sc.nextLong();
                 al10.add(x);
             }
             System.out.println(al10);
             break;
         case 11:
             Vector<Long> vl11=new Vector();
             int n011= sc.nextInt();

             for(int i=0;i<n011;i++)
             {
                 long x= sc.nextLong();
                 vl11.add(x);
             }
             System.out.println(vl11);
             break;
         case 12:
             LinkedList<Short> ls01=new LinkedList();
             int n12= sc.nextInt();

             for(int i=0;i<n12;i++)
             {
                 short x= sc.nextShort();
                 ls01.add(x);
             }
             System.out.println(ls01);
             break;
         case 13:
             Vector<Short> vs1=new Vector();

             int n13= sc.nextInt();

             for(int i=0;i<n13;i++)
             {
                 short x= sc.nextShort();
                 vs1.add(x);
             }
             System.out.println(vs1);
             break;
         case 14:
             ArrayList<Byte> al14=new ArrayList();
             int n14= sc.nextInt();
             for(int i=0;i<n14;i++)
             {
                 byte x= sc.nextByte();
                 al14.add(x);
             }
             System.out.println(al14);
             break;
         case 15:
             Vector<Byte> vb1=new Vector();
             int n15= sc.nextInt();
             for(int i=0;i<n15;i++)
             {
                 byte x= sc.nextByte();
                 vb1.add(x);
             }
             System.out.println(vb1);
             break;
         case 16:
             LinkedList<Boolean> bl=new LinkedList();
             int n16= sc.nextInt();

             for(int i=0;i<n16;i++)
             {
                 boolean x= sc.nextBoolean();
                 bl.add(x);
             }
             System.out.println(bl);
             break;
         case 17:
            List<Boolean> LSV=new Vector<>();
             int n17= sc.nextInt();

             for(int i=0;i<n17;i++)
             {
                 boolean x= sc.nextBoolean();
                 LSV.add(x);
             }
             System.out.println(LSV);
             break;
     }
     }
     else if(as=='c'){
         System.out.print("enter the question you want to see - ");
         int x214= sc.nextInt();
         switch (x214)
         {
             case 1:
                 ArrayList<A> al=new ArrayList();
                 A k=new A(1,"amit","amity23@gmail","arun vihar");
                 A k1=new A(2,"rakesh","roakehs21@gmail","rome");
                 A k2=new A(3,"manish","manish15@gmail","faracas");

                 al.add(k); al.add(k1); al.add(k2);

                 for(A i:al)
                 {
                     System.out.println(i.id+" "+i.name+" "+i.Email+" "+i.address);
                 }
                 break;
             case 2:
                 ArrayList<A> alk=new ArrayList();
                 System.out.println("enter id");
                 int id= sc.nextInt();
                 System.out.println("enter name");
                 String name= sc.next();
                 System.out.println("enter gmail");
                 String gmail= sc.next();
                 System.out.println("enter address");
                 String address= sc.next();
                 A k3=new A(id,name,gmail,address);

                 System.out.println("enter id");
                 int id1= sc.nextInt();
                 System.out.println("enter name");
                 String name1= sc.next();
                 System.out.println("enter gmail");
                 String gmail1= sc.next();
                 System.out.println("enter address");
                 String address1= sc.next();
                 A k4=new A(id1,name1,gmail1,address1);

                 alk.add(k3);
                 alk.add(k4);
                 for(A i:alk)
                 {
                     System.out.println(i.id+" "+i.name+" "+i.Email+" "+i.address);
                 }
                 break;
             case 3:
                 Stack<A> st=new Stack();
                 A k5=new A(1,"anand","anand@gmail.com","agra");
                 A k6=new A(2,"anandu","ananduwee@gmail.com","agatala");
                 A k7=new A(3,"anus","anauswe@gmail.com","agra fort");
                 st.push(k5);  st.push(k6);  st.push(k7);
                 for (A i :st ) {
                     System.out.println(i.id+" "+i.name+" "+i.Email+" "+i.address);
                 }
                 break;
             case 4:
                 Stack<A> st1=new Stack();
                 System.out.println("enter id");
                 int id2= sc.nextInt();
                 System.out.println("enter name");
                 String name2= sc.next();
                 System.out.println("enter gmail");
                 String gmail2= sc.next();
                 System.out.println("enter address");
                 String address2= sc.next();
                 A k8=new A(id2,name2,gmail2,address2);

                 System.out.println("enter id");
                 int id3= sc.nextInt();
                 System.out.println("enter name");
                 String name3= sc.next();
                 System.out.println("enter gmail");
                 String gmail3= sc.next();
                 System.out.println("enter address");
                 String address3= sc.next();
                 A k9=new A(id3,name3,gmail3,address3);

                 st1.add(k8);
                 st1.add(k9);

                 for(A i:st1)
                 {
                     System.out.println(i.id+" "+i.name+" "+i.Email+" "+i.address);
                 }
                 break;
             case 5:
                 LinkedList<A1> al05=new LinkedList<>();

                 A1 k50=new A1(1,"shyama","namaste",12,30000);
                 A1 k60=new A1(2,"virat","pinki",14,40000);

                 al05.add(k50);
                 al05.add(k60);

                 for(A1 i:al05)
                 {
                     System.out.println(i.id+" "+i.fname+" "+i.mname+" "+i.age+" "+i.salary);
                 }
                 break;

         }
     }
     else{
         System.out.print("enter the question you wanna see - ");
         int x2312= sc.nextInt();
         switch (x2312)
         {
             case 1:
                 ArrayList a21=new ArrayList<>();
                 a21.add(1); a21.add(2); a21.add(3); a21.add(4);
                 LinkedList <Integer> L121=new LinkedList<>(a21);
                 L121.add(10); L121.add(20); L121.add(30);
                 System.out.println(L121);
                 break;
             case 2:
                 TreeSet treeSet=new TreeSet();
                 treeSet.add(new StringBuffer("A"));
                 treeSet.add(new StringBuffer("B"));
                 treeSet.add(new StringBuffer("C"));
                 System.out.println(treeSet);
                 break;
             case 3:
                 LinkedList ll=new LinkedList();
                 ll.add(13);
                 ll.add(26);
                 ll.add(13);

                 Vector al=new Vector(ll);
                 al.add(45);
                 al.add("hii");
                 al.add("mohit");
                 System.out.println(al);
                 break;
             case 4:
                 Stack ss=new Stack();
                 ss.push(1);
                 ss.push(2);
                 ss.push(3);

                 ArrayList al1=new ArrayList(ss);
                 al1.add("hii");
                 al1.add("mohit");

                 System.out.println(al1);
                 break;
             case 5:
                 ArrayList al12=new ArrayList();
                 al12.add(1);
                 al12.add(4);
                 al12.add("hi");
                 HashSet<String> set=new HashSet(al12);
                 set.add("One");
                 set.add("Two");
                 set.add("Three");
                 System.out.println(set);
                 break;
             case 6:
                 Stack a1l=new Stack();
                 a1l.push(98);
                 a1l.push(12);
                 a1l.push("heya");

                 HashSet hs=new HashSet(a1l);
                 hs.add("lion");
                 hs.add(1);
                 hs.add("bye");
                 System.out.println(hs);
                 break;
             case 7:
                 Vector a2l=new Vector();
                 a2l.add(11);
                 a2l.add(44);
                 a2l.add("hi");

                 HashSet hs1=new HashSet(a2l);
                 hs1.add(22);
                 hs1.add(11);
                 hs1.add("bye");
                 System.out.println(hs1);
                 break;
         }
     }



    }
}