import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator{
    private String transformation;
    public TransformationDecorator(Shape shape){
        super(shape);
    }
    public String toSvg(String abc){
        return null;
    }
    public static class Builder{
        private Vec2 transform;
        private float ang;
        private Vec2 angcent;
        private Vec2 scale;

        Builder translate(Vec2 translation){
            transform =
        }
        Builder rotate(float angle, Vec2 center){

        }
        Builder scale(Vec2 scaleFactor){

        }
        Builder build(Shape shape){

        }

    }


}
