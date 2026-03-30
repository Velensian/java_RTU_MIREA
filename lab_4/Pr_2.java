package lab_4;

public class Pr_2 {

    public enum Brand {
        Redmi,
        HP,
        APPLE,
        ASUS,
        LENOVO
    }

    public static class Processor {
        private String model;
        private double speed;

        public Processor(String model, double speed) {
            this.model = model;
            this.speed = speed;
        }

        public String getModel() {
            return model;
        }

        public double getSpeed() {
            return speed;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "model='" + model + '\'' +
                    ", speed=" + speed +
                    " GHz}";
        }
    }

    public static class Memory {
        private int size;

        public Memory(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        @Override
        public String toString() {
            return "Memory{" +
                    "size=" + size +
                    " GB}";
        }
    }

    public static class Monitor {
        private String resolution;

        public Monitor(String resolution) {
            this.resolution = resolution;
        }

        public String getResolution() {
            return resolution;
        }

        @Override
        public String toString() {
            return "Monitor{" +
                    "resolution='" + resolution + '\'' +
                    '}';
        }
    }

    public static class Computer {
        private Brand brand;
        private Processor processor;
        private Memory memory;
        private Monitor monitor;

        public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.monitor = monitor;
        }

        public Brand getBrand() {
            return brand;
        }

        public Processor getProcessor() {
            return processor;
        }

        public Memory getMemory() {
            return memory;
        }

        public Monitor getMonitor() {
            return monitor;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "brand=" + brand +
                    ", processor=" + processor +
                    ", memory=" + memory +
                    ", monitor=" + monitor +
                    '}';
        }
    }

    // Пример использования
    public static void main(String[] args) {
        Processor processor = new Processor("Ryzen 5 5600", 3.5);
        Memory memory = new Memory(16);
        Monitor monitor = new Monitor("1920x1080");

        Computer computer = new Computer(Brand.Redmi, processor, memory, monitor);

        System.out.println(computer);

    }
}



