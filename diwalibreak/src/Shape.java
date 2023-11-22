
    public abstract class Shape {
        protected abstract double calculateArea();
        protected abstract double calculatePerimeter();
        public void displayDetails() {
            System.out.println("Area: " + calculateArea());
            System.out.println("Perimeter: " + calculatePerimeter());
        }
    }

    class  Circle extends Shape
    {
        private double radius;

        public  Circle(double radius)
        {
            this.radius = radius;
        }
        @Override
        protected double calculateArea()
        {
            return Math.PI * radius * radius;
        }

        @Override
        protected  double calculatePerimeter()
        {
            return 2 * Math.PI * radius;
        }
    }
    class Rectangle extends  Shape

    {
        private  double length;
        private double width;

        public Rectangle(double length, double width)

        {
            this.length = length;
            this.width = width;
        }

        @Override
        protected double calculateArea()
        {
            return length * width;
        }

        @Override
        protected double calculatePerimeter()
        {
            return 2 * (length + width);
        }
    }

    class Triangle extends Shape
    {
        private double base;
        private double height;
        private double hypotenuse;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
            this.hypotenuse = Math.sqrt(base * base + height * height);
        }
        @Override
        protected double calculateArea() {
            return 0.5 * base * height;
        }

        @Override
        protected double calculatePerimeter() {
            return base + height + hypotenuse;
        }
    }
