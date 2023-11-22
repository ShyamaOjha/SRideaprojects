public class Car {
     Car engine;

    public Car(Car engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.start();
    }

    private void start() {
        System.out.println("Car start");
    }

    public void stopEngine() {
        engine.stop();
    }
    private void stop() {
        System.out.println("car stopped");
    }
}