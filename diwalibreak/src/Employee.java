public class Employee {

        private int id;
        private String name;

        public Employee(int id, String name)
        {
            this.id = id;
            this.name = name;
        }
        public void displayDetails() {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
        }
    }

    class Manager extends Employee {
        private String department;

        public Manager(int id, String name, String department) {
            super(id, name);
            this.department = department;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Department: " + department);
        }
    }

    class Clerk extends Employee {
        private double salary;
        public Clerk(int id, String name, double salary) {
            super(id, name);
            this.salary = salary;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Salary: " + salary);
        }
    }

