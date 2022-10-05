import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
    public static Shape getShape(String shapeID){
        Shape cachedShape = shapeMap.get(shapeID);
        return (Shape) cachedShape.clone();
    }
}
