import java.util.*;
public class Main {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int x3423= sc.nextInt();
                A a1=new A();
                switch (x3423)
                {
                    case 1:
                        int a= sc.nextInt();
                        try {
                            if(a>0){
                                System.out.println("positive number ");
                            }
                            else{
                                Object InputMismatchException = null;
                            }
                        }
                        catch (InputMismatchException ex)
                        {
                            System.out.println(ex);

                        }
                        finally {
                            System.out.println("finally exceuted");
                        }
                        break;
                    case 2:
                        // not get queestion meaning
                        break;
                    case 3:
                        try {
                            a1.divi();
                        } catch (Exception e) {
                            System.out.println("here it is catch");
                        }
                        System.out.print("happily excuted");
                        break;
                    case 4:
                        try {
                            int a2=25;int b1=0;
                            System.out.println("sum = "+(a2+b1));
                            System.out.println("divi = "+(a2/b1));
                        }
                        catch (Exception ex){
                            System.out.print("exception = "+ex);
                        }
                        finally {
                            sc.close();
                        }
                        break;
                    case 5:
                        String s1= sc.next();
                        CustomUncheckedEx ce1=new CustomUncheckedEx(s1);;
                        break;
                    case 6:
                        try {
                            a1.divi();
                        } catch (Exception e) {
                            System.out.println("here it is catch in the block");
                        }
                        System.out.print("happily excuted the programme");
                        break;
                    case 7:
                        try{
                        int aas=25/0;}
                        catch (Exception e)
                        {
                            System.out.println(e);}
                        break;
                    case 8:
                        try{
                            int aas=25/0;}
                        catch (Exception e)
                        {
                            System.out.println(e);}
                        finally {
                            System.out.println("this is final");
                        }
                        break;
                    case 9:
                        try{
                            String aas=null;}
                        catch (ArithmeticException e)
                        {
                            System.out.println("Arithmetic Exception");}
                        catch (ArrayIndexOutOfBoundsException e)
                        {
                            System.out.println("ArrayIndexOutOfBoundsException");}
                        catch (StringIndexOutOfBoundsException e)
                        {
                            System.out.println("StringIndexOutOfBoundsException");}
                        catch (NumberFormatException e)
                        {
                            System.out.println("NumberFormatException");}
                        catch (NullPointerException e)
                        {
                            System.out.println("NullPointerException");}
                        finally {
                            System.out.println("this is final");
                        }
                        break;
                }
            }
        }


