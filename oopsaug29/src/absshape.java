abstract class absshape {
    abstract void calarea();
    abstract void calper();
}
class circle2 extends absshape{
    @Override
    void calarea() {
        System.out.println("this is area of circle");
    }

    @Override
    void calper() {
        System.out.println("this is peri of circle");
    }
}
class rectangle2 extends absshape{
    @Override
    void calarea() {
        System.out.println("area of rectang");
    }

    @Override
    void calper() {
        System.out.println("peri of rec");
    }
}

