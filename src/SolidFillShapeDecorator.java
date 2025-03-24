import java.util.Locale;

public class SolidFillShapeDecorator extends ShapeDecorator{
    private String color;

    public SolidFillShapeDecorator(Shape abc, String color) {
        super(abc);
        this.color = color;
    }
    public String toSvg(String abc){
        return super.toSvg(String.format(Locale.US,"fill=\"%s\" %s", color, abc));
    }

}
