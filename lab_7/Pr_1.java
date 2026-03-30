package lab_7;

// 4
interface MathCalculable {
    double PI = 3.14159;
    double pow(double base, int exponent);
    double modul(double real, double imaginary);
}

class MathFunc implements MathCalculable {

    @Override
    public double pow(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double modul(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circumference(double radius) {
        return 2 * PI * radius;
    }
}

public class Pr_1 {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double base = 2.0;
        int exponent = 5;
        System.out.println("2^5 = " + mathFunc.pow(base, exponent));

        double real = 4.0;
        double imaginary = 5.0;
        System.out.println("Модуль комплексного числа (4 + 5i) = " + mathFunc.modul(real, imaginary));

        double radius = 7.0;
        System.out.println("Длина окружности с радиусом 7 = " + mathFunc.circumference(radius));
    }
}

