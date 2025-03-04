public class Point {
    private double x;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    private double y;
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public String toString(){
        return "X: "+x+" Y: "+y;
    }

    public String toSvg(){
        return " <svg height=\"1000\" width=\"500\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <circle r=\"250\" cx=\"" + x + "\" cy=\"" + y + "\" fill=\"blue\" />\n" +
                "</svg> ";
    }

    public void translate(double dx, double dy){
        x+=dx;
        y+=dy;
    }
    public Point translated(double dx, double dy){
        Point tr = new Point();
        tr.x=x+dx;
        tr.y=y+dy;
        return tr;
    }

}