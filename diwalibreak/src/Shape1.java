public abstract class Shape1 {
        protected abstract double calculateArea();
    }

    class Circle2 extends Shape1 {
        private double radius;

        public Circle2(double radius) {
            this.radius = radius;
        }

        @Override
        protected double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle2 extends Shape1 {
        private double length;
        private double width;

        public Rectangle2(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        protected double calculateArea() {
            return length * width;
        }
    }


