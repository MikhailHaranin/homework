public class Circle implements Figure {
    private int a;

    public Circle(int a) {
        this.a = a;
    }

    @Override
    public double findPerimeter() {
        return Math.PI * a * 2;
    }

    @Override
    public double findSquare() {
        return Math.PI * a * a;
    }
}