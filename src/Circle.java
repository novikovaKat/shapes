public class Circle extends Shape {

    private double radius;
    private double x;
    private double y;

    public Circle(DrawingAPI drawingAPI, double radius, double x, double y) {
        super(drawingAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(radius, x, y);
    }
}
