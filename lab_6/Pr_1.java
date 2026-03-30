package lab_6;

// 3
public class Pr_1 {

    interface Nameable {
        String getName();
    }

    static class Planet implements Nameable {
        private String name;

        public Planet(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    static class Car implements Nameable {
        private String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    static class Animal implements Nameable {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
    static class drink implements Nameable {
        private String name;

        public drink(String name) {this.name = name;}

        @Override
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Planet("Porche");
        Nameable animal = new Planet("Cat");
        Nameable drink = new drink("Coffee");
        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(animal.getName());
        System.out.println(drink.getName());

    }
}

