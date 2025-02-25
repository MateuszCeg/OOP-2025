public class Point {
    public double x;
    public double y;
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
