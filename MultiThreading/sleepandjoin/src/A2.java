 class A2 extends Thread{

     public void run() {
         for (int i = 1; i <=5 ; i++) {
             try {
                 Thread.sleep(500);
                 System.out.print(i+" ");
             }catch (Exception ex){
                 System.out.println(ex);
             }
         }
     }
 }
 class B2 implements Runnable{
     public void run() {
         for (int i = 1; i <=5 ; i++) {
             try {
                 Thread.sleep(500);
                 System.out.print(2*i+" ");
             }catch (Exception ex){
                 System.out.println(ex);
             }
         }
     }
 }
