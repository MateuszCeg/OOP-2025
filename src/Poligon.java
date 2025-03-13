import java.util.ArrayList;

public class Poligon {
    private ArrayList<Point> points;
    private Style styl;
    public Poligon(ArrayList<Point> points) {
        super(styl);
        this.points = points;
    }


    @Override
    public String toString() {

        return "Poligon{" +
                "points=" + points +
                '}';
    }

    public static Poligon square(Segment segm, Style b){
        Segment[] diagonals = Segment.prependicular(segm, segm.center(), segm.length()/2);
            Point p1,p2,p3,p4;
            p1=segm.getP1(), p3=segm.getP2(), p2=diagonals[0].getP2(), p4=diagonals[1].getP2();

        return new Poligon(new Point[]{p1,p2,p3,p4});
    }

}
