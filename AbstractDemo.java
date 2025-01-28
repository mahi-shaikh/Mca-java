abstract class Shape {
    protected String color;
    public Shape(String color) {
    this.color = color;
    }
    public abstract double getArea();
    public void display() {
    System.out.println("Color: " + color);
    }
    }
    class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
    }
    @Override
    public double getArea() {
    return Math.PI * radius * radius;
    }
    }
    class Square extends Shape {
    private double length;
    private double width;
    public Square(String color, double length, double width) {
    super(color);
    this.length = length;
    this.width = width;
    }
    @Override
    public double getArea() {
    return length * width;
    }
    }
    public class AbstractDemo {
    public static void main(String[] args) {
    Circle circle = new Circle("Red", 5.0);
    circle.display();
    System.out.println("Area of circle: " + circle.getArea());
    Square rectangle = new Rectangle("Blue", 3.0, 4.0);
    rectangle.display();
    System.out.println("Area of rectangle: " + rectangle.getArea());
    }
    }