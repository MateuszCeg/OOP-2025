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
        private boolean translating= false,rotating= false,scaling= false;

        Builder translate(Vec2 translation){
            this.transform = translation;
            translating = true;
            return this;
        }
        Builder rotate(float angle, Vec2 center){
            this.ang = angle;
            this.angcent = center;
            rotating = true;
            return this;
        }
        Builder scale(Vec2 scaleFactor){
            this.scale = scaleFactor;
            scaling = true;
            return this;
        }
        Builder build(Shape shape){
            TransformationDecorator obj = new TransformationDecorator(shape);
            obj.transformation = "";
            if (translating){
                obj.transformation+="translate("+ transform.x() + " " + transform.y() + ") ";
            }
            if (rotate()){
                obj.transformation+="rotate("+ transform.x() + " " + transform.y() + ") ";
            }
        }

    }


}
