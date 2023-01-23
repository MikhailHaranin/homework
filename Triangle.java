public class Triangle implements Figure {
    private int a, b, c;
    private double p;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super();
    }

    @Override
    public double findPerimeter() {
        return a + b + c;
    }

    @Override
    public double findSquare() {
        p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}