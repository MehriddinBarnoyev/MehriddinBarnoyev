public class Shapes {
    public static void main(String[] args) {
        GeometrikFigure triangle = new Triangle();
        GeometrikFigure trapezium = new Trapezium();
        GeometrikFigure rectangle = new Rectangle();

        triangle.area();
        trapezium.area();
        rectangle.area();
    }
    
}
