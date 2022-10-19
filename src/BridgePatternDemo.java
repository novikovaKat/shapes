public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedPen(), 4, 1.4, 3.2);
        Shape greenCircle = new Circle(new GreenPen(), 12.2, 2, 1);
        Shape redSquare = new Square(new RedPen(), 3, 2.3, 7);
        Shape greenSquare = new Square(new GreenPen(), 12, 1, 1);

        redCircle.draw();
        greenCircle.draw();
        redSquare.draw();
        greenSquare.draw();
    }
}
