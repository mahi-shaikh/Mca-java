interface Drawable {
    void draw();
    }
    // Implement the interface in a class
    class Circle implements Drawable {
    private int radius;

    public Circle(int radius) {
    this.radius = radius;
    }
    @Override
    public void draw() {
    System.out.println("Drawing a circle with radius " + radius);
    }
    }
    public class InterfaceDemo {
    public static void main(String[] args) {
    // Create an object of the class that implements the interface
    Circle circle = new Circle(5);
    circle.draw();
    }
    }