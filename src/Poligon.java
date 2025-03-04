import java.util.ArrayList;

public class Poligon {
    private ArrayList<Point> points;

    public Poligon(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Poligon{" +
                "points=" + points +
                '}';
    }
}
