public class Vehicle {
   private int make;String model12;

    public Vehicle(int make, String model12) {
        this.make = make;
        this.model12 = model12;
    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getModel12() {
        return model12;
    }

    public void setModel12(String model12) {
        this.model12 = model12;
    }
}
class Car6 extends Vehicle{
    public Car6(int make, String model12) {
        super(make, model12);
    }

    void display(){

        System.out.println("car mf "+getMake()+" "+" car  model year = "+getModel12());
    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(int make, String model12) {
        super(make, model12);
    }

    void display(){
        System.out.println("motor cycke "+getMake()+" "+" motorcycle model year = "+getModel12());
    }
}
