class A extends Thread{
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
 class B extends Thread{
     public void run() {
         for (int i = 1; i <=5 ; i++) {
             try {
                 Thread.sleep(500);
                 System.out.print(i*2+" ");
             }catch (Exception ex){
                 System.out.println(ex);
             }
         }
     }
}
 class C extends Thread{
     public void run() {
         for (int i = 1; i <=5 ; i++) {
             try {
                 Thread.sleep(500);
                 System.out.print(i*3+" ");
             }catch (Exception ex){
                 System.out.println(ex);
             }
         }
     }
}
