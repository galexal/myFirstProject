package lesson_8;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle(15, 50);
        System.out.println(rectangle.getPerimeter());

        Square square = new Square(25);
        System.out.println(square.getPerimeter());
    }
}
