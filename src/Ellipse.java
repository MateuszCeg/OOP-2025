public class Ellipse extends Shape{
    private Point center;
    private double radiusx, radiusy;
    private Style styl;

    public Ellipse(Style x, Point center, double radiusx, double radiusy) {
        super(x);
        this.center = center;
        this.radiusx = radiusx;
        this.radiusy = radiusy;
        this.styl = x;
    }
    public String toSvg(){
        return "<ellipse cx='" + center.getX() + "' cy='" + center.getY() + "' rx='" + radiusx + "' ry='" + radiusy + "' " + styl.toSvg() + ">";
    }
}
