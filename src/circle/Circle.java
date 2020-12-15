package circle;

public class Circle {
    private double radius = 1.0d;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return this.radius;
    }

    private double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
