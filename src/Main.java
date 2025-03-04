import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Point pkt1 = new Point();
        pkt1.setX(3);
        pkt1.setY(6);
        System.out.println(pkt1+"\n");
        Point p2 = pkt1.translated(4,6);
        System.out.println(p2);
        System.out.println(pkt1);


        Segment[] arr = new Segment[3];
        for (int i = 0 ; i<3; i++) {
            arr[i] = new Segment();
            arr[i].setP1(new Point());
            arr[i].setP2(new Point());
        }
        arr[0].getP1().setX(2);
        arr[0].getP1().setY(3);

        arr[0].getP2().setX(5);
        arr[0].getP2().setY(8);

        arr[1].setP1(arr[1].getP1().translated(2, 5));
        arr[1].setP2(arr[1].getP2().translated(2, 5));

        arr[2].setP1(arr[1].getP1().translated(1, 3));
        arr[2].setP2(arr[1].getP2().translated(2, 0));

        Segment bigg;
        bigg = Segment.sort_segment(arr);
        System.out.println(bigg);
        Point copy = new Point(bigg.getP1());
        bigg.setP1(p2);

        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(1,2));
        points.add(new Point(2,6));
        points.add(new Point(3,1));
        points.add(new Point(4,3));

        Poligon poli = new Poligon(points);

        System.out.println(poli);
    }
}