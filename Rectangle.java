public class Rectangle implements Figure {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double findPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double findSquare() {
        return a * b;
    }


}