public class RedPen implements DrawingAPI{
    @Override
    public void drawCircle(double radius, double x, double y) {
        System.out.println("Draw Circle [color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }

    @Override
    public void drawSquare(double side, double x, double y) {
        System.out.println("Draw Square [color: red, side: " + side + ", x: " + x + ", y: " + y + "]");
    }
}
