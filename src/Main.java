import abstraction.Circle;
import abstraction.Rectangle;
import abstraction.Square;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0, "blue", false);


        Rectangle rectangle = new Rectangle(4.0, 6.0, "pink", true);


        Square square = new Square(3.0, "yellow", true);


        System.out.println("Circle:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());


        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());


        System.out.println("\nSquare:");
        System.out.println("Color: " + square.getColor());
        System.out.println("Filled: " + square.isFilled());
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
