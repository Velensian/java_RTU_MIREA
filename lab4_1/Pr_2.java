package lab4_1;

//2
abstract class Transport {
    protected double speed;
    protected double costPerKm;

    public Transport(double speed, double costPerKm) {
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public abstract double calculateTime(double distance);
    public abstract double calculateCost(double distance, int passengers, double cargoWeight);
}

class Car extends Transport {
    public Car() {
        super(100, 0.5);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance, int passengers, double cargoWeight) {
        return distance * costPerKm;
    }
}

class Plane extends Transport {
    public Plane() {
        super(800, 2.0);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance, int passengers, double cargoWeight) {
        return distance * costPerKm + passengers * 50 + cargoWeight * 0.1;
    }
}

class Train extends Transport {
    public Train() {
        super(160, 1.0);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance, int passengers, double cargoWeight) {
        return distance * costPerKm + passengers * 30;
    }
}

class Ship extends Transport {
    public Ship() {
        super(40, 1.5);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance, int passengers, double cargoWeight) {
        return distance * costPerKm + cargoWeight * 0.2;
    }
}

public class Pr_2 {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport plane = new Plane();
        Transport train = new Train();
        Transport ship = new Ship();

        double distance = 500;
        int passengers = 30;
        double cargoWeight = 1000;

        System.out.println("Время езды на машине = " + car.calculateTime(distance) + " часов, Стоит = " + car.calculateCost(distance, passengers, cargoWeight));
        System.out.println("Время полетов на самолете = " + plane.calculateTime(distance) + " часов, Стоит = " + plane.calculateCost(distance, passengers, cargoWeight));
        System.out.println("Время езды на поезде = " + train.calculateTime(distance) + " часов, Стоит = " + train.calculateCost(distance, passengers, cargoWeight));
        System.out.println("Время в пути на корабле = " + ship.calculateTime(distance) + " часов, Стоит = " + ship.calculateCost(distance, passengers, cargoWeight));
    }
}

