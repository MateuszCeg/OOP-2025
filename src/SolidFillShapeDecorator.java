import java.util.Locale;

public class SolidFillShapeDecorator extends ShapeDecorator{
    private String color;

    public SolidFillShapeDecorator(Shape abc) {
        super(abc);
        this.color = color;
    }
    public String toSvg(){
        return super.toSvg(String.format(Locale.US,"fill=\"%s\" %s", color));
    }

}
