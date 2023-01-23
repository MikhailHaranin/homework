import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figureArr = new Figure[5];
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(4, 1);
        Circle circle1 = new Circle(5);
        Triangle triangle1 = new Triangle(3, 4, 5);
        Circle circle2 = new Circle(6);
        figureArr[0] = rectangle1;
        figureArr[1] = rectangle2;
        figureArr[2] = circle1;
        figureArr[3] = triangle1;
        figureArr[4] = circle2;
        double sumPerimeter = 0;
        double sumSquare = 0;
        for (Figure figure : figureArr) {
            sumPerimeter += figure.findPerimeter();
            sumSquare += figure.findSquare();
        }
        System.out.println("Perimeter: " + sumPerimeter);
        System.out.println("Square: " + sumSquare);
    }
}