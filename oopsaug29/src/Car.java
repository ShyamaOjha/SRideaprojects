public class Car {
    private int make,year;
    String model;

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(){

    }
    public Car(int make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

}
