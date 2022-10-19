public class Square extends Shape {
    private double side;
    private double x;
    private double y;

    public Square(DrawingAPI drawingAPI, double side, double x, double y) {
        super(drawingAPI);
        this.side = side;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawingAPI.drawSquare(side, x, y);
    }
}
