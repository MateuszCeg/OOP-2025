public class Style {
    public String fillColor;
    public String strokeColor;
    public Double strokeWidth;

    public Style(String fillColor, String strokeColor, Double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }
    public String toSvg(Style a){
        return "fill = \"" + fillColor + "\" ";
    }
}
