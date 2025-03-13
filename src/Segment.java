import java.lang.reflect.Array;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment() {
    }

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                 '}';
    }

    public double length() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public Point center(){
        double x1 = p1.getX(), y1 = p1.getY(), x2 = p2.getX(), y2 = p2.getY();
        double xs = (x1+x2)/2;
        double ys = (y1+y2)/2;
        return new Point(xs,ys);
    }

    public static Segment[] prependicular(Segment segment, Point point){
        double x1 = segment.p1.getX(), y1 = segment.p1.getY(), x2 = segment.p2.getX(), y2 = segment.p2.getY();

        double xs = (x1+x2)/2;
        double ys = (y1+y2)/2;

        double x1_2 = xs+x1, y1_2 = ys+y2, x2_2 = xs+x2, y2_2 = ys + y1;

        Segment segout = new Segment();

        Segment[] arr = new Segment[2];


        return arr;
    }
    public static Segment[] prependicular(Segment segment, Point point, double length){
        Segment[] prependiculars = Segment.prependicular(segment,point);

        for (Segment s:prependiculars){
            double scale =length / segment.length();
            double dx = s.p2.getX() - s.p1.getX(), dy = s.p2.getY() - s.p2.getY();
            s.p2.setX(s.p2.getX()-dx*scale);
            s.p2.setY(s.p2.getY()-dy*scale);
        }
        return prependiculars;
    }
    public static Segment sort_segment(Segment[] arr){
        int n = Array.getLength(arr);
        int numb=0;
        double max=arr[0].length();
        for (int i = 1; i<n ; i++){
            if(max<arr[i].length()) {
                max = arr[i].length();
                numb = i;
            }
        }

        return arr[numb];
    }
}
