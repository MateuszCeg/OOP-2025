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
