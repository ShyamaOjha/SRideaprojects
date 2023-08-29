
public class Main {
    public static void main(String[] args) {
        try{
        int a=10/0;
        System.out.println(a);}
        catch (Exception ex)
        {
            System.out.println(ex);
            System.out.println("it is exception");
        }
        finally {
            System.out.println("tjos is finally");
        }
    }
}