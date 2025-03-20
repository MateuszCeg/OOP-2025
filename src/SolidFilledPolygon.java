import java.util.Locale;

public class SolidFilledPolygon extends Polygon{
    private String color;
    public SolidFilledPolygon(String color, Vec2[] arr) {
        super(arr);
        this.color = color;
    }
    @Override
    public String toSvg(String style){
            return super.toSvg(String.format(Locale.US, "fill=\"%s\" %s", style));
    }
}
