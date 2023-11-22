
    public abstract class Animal {
        protected abstract void makeSound();
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow!");
        }
    }

    class Horse extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Neigh!");
        }
    }


