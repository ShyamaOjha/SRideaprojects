public class A {
        static int a=25;static int b=0;
        void divi()throws Exception
        {
            try {
                int c=a/b;
                System.out.print("c"+c);
            }
            catch (Exception ex)
            {
                System.out.println("exception ="+ex);
            }
        }
    }
    class CustomUncheckedEx extends RuntimeException{
        CustomUncheckedEx(String mess)
        {
            super(mess);
        }
    }

