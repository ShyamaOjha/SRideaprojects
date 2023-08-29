interface  A {
    void add();

}
interface B {
   void sub();
    }
interface X{
    default void mul(){
        System.out.println();
    }
}
class C implements A,B{
    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }
}