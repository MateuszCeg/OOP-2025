public abstract class Shape {
    protected Style x;
    public Shape(Style x) {
        this.x = x;
    }
    public abstract String toSvg();
}
