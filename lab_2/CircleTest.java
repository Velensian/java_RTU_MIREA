package lab_2;

// 6
public class CircleTest {
    public static void main (String [] args) {
        Circle circle1 = new Circle( 3.1, 4.1,5.0, "red");
        Circle circle2 = new Circle( 3.1, 4.1,5.1, "green");
        System.out.println(circle1.toString());
        System.out.println("Длина окружности = " + circle1.getPerimetr () + " см");
        System.out.println("Площадь круга = " + circle1.getSquare () + " см^2");
        System.out.println(circle2.toString());
        System.out.println("----------------------");
        circle1.comparison(circle2);
    }
}

class Circle {
    private double x;
    private double y;
    private double r;
    private String colour;

    public Circle(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public double getR() { return r; }
    public void setR(double r) { this.r = r; }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public double getPerimetr() { return 2 * Math.PI * this.getR(); }
    public double getSquare() { return Math.PI * this.getR() * this.getR(); }

    public void comparison(Circle circle) {
        if (this.x == circle.x && this.y == circle.y) { System.out.println("Центры окружностей находятся в одной точке."); }
        else { System.out.println("Центры окружностей находяться в разных точках."); }

        if (this.r == circle.r) { System.out.println("Радиусы окружностей равны."); }
        else {
            System.out.println("Радиусы окружностей различны.");
            if (this.r > circle.r) { System.out.println("Радиус первой окружности больше."); }
            else { System.out.println("Радиус второй окружности больше."); }
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", colour=" + colour +
                '}';
    }
}
