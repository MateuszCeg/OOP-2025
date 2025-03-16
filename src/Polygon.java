import java.util.Arrays;
import java.util.Locale;

public class Polygon extends Shape{
    // Prywatna tablica obiektów Point
    private Point[] points;
    private Style styl;


    // Konstruktor przyjmujący tablicę obiektów Point
    public Polygon(Point[] points) {
        super(new Style());
        // this.points=points;

        // Konstruktor kopiujący, płytka kopia
        //this.points = Arrays.copyOf(points, points.length);

        // Konstruktor kopiujący, głęboka kopia
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
        styl = new Style();

    }

    public Polygon(Style styl, Point[] points) {
        super(styl);
        this.styl = styl;
        this.points = points;
    }

    // Konstruktor kopiujący wykonujący głęboką kopię obiektu
    public Polygon(Polygon other) {
        super(new Style());
        this.points = new Point[other.points.length];
        for (int i = 0; i < other.points.length; i++) {
            this.points[i] = new Point(other.points[i].getX(), other.points[i].getY());
        }
        styl = new Style();
    }

    // Metoda toString() zwracająca informacje o punktach wielokątu
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Polygon: [");
        for (Point point : points) {
            sb.append(point.toString()).append(", ");
        }
        if (points.length > 0) {
            sb.setLength(sb.length() - 2); // Usunięcie ostatniego przecinka
        }
        sb.append("]");
        return sb.toString();
    }

    // Metoda toSvg() zwracająca opis wielokąta w formacie SVG
    public String toSvg() {
        StringBuilder sb = new StringBuilder("<polygon points='");
        for (Point point : points) {
            sb.append(String.format(Locale.US, "%.2f,%.2f ", point.getX(), point.getY()));
        }
        if (points.length > 0) {
            sb.setLength(sb.length() - 1); // Usunięcie ostatniej spacji
        }
        sb.append("'  ").append(styl.toSvg()).append("/>");
        return sb.toString();
    }

    public BoundingBox boundingBox() {
        if (points.length == 0) {
            return new BoundingBox(0, 0, 0, 0);
        }

        double minX = points[0].getX();
        double minY = points[0].getY();
        double maxX = points[0].getX();
        double maxY = points[0].getY();

        for (Point point : points) {
            if (point.getX() < minX) minX = point.getX();
            if (point.getY() < minY) minY = point.getY();
            if (point.getX() > maxX) maxX = point.getX();
            if (point.getY() > maxY) maxY = point.getY();
        }

        return new BoundingBox(minX, minY, maxX - minX, maxY - minY);
    }

    // Przykładowa metoda main do testowania
    public static void main(String[] args) {
        Point point = new Point();
        Point[] points = {point, new Point(10, 0), new Point(10, 10), new Point(0, 10)};
        Polygon polygon = new Polygon(points);

        System.out.println(polygon);
        System.out.println(polygon.toSvg());

        Polygon copiedPolygon = new Polygon(polygon);

        System.out.println(polygon);
        System.out.println(polygon.toSvg());
        System.out.println(copiedPolygon);
        System.out.println(copiedPolygon.toSvg());

//        points[0]=new Point(1.,1.);
//        System.out.println(polygon);
//        System.out.println(polygon.toSvg());
//        System.out.println(copiedPolygon);
//        System.out.println(copiedPolygon.toSvg());
//
//        point.translate(2.,0.);
//
//        System.out.println(polygon);
//        System.out.println(polygon.toSvg());
//        System.out.println(copiedPolygon);
//        System.out.println(copiedPolygon.toSvg());
    }
    public static Polygon square(Segment przek, Style styl){
        Segment przek2 = przek.perpendicular();
        Point[] arr = {przek.getStart(), przek.getEnd(), przek2.getStart(), przek2.getEnd()};
        return new Polygon(styl, arr);
    }
}