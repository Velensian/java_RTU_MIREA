package lab_6;

// 11
public class Pr_2 {

    interface Convertable {
        double convert();
    }

    static class Celsius implements Convertable {
        private double temperature;

        public Celsius(double temperature) {
            this.temperature = temperature;
        }

        public double toKelvin() {
            return temperature + 273.15;
        }

        public double toFahrenheit() {
            return temperature * 9/5 + 32;
        }

        @Override
        public double convert() {
            return toFahrenheit();
        }
    }

    public static void main(String[] args) {
        Celsius celsius = new Celsius(25);

        System.out.printf("Температура по Цельсию: %.2f °C%n", celsius.temperature);
        System.out.printf("Температура по Кельвину: %.2f K%n", celsius.toKelvin());
        System.out.printf("Температура по Фаренгейту: %.2f °F%n", celsius.convert());
    }
}

