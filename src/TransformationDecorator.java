import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator{
    private String transformation;
    public TransformationDecorator(Shape shape){
        super(shape);
    }
    public String toSvg(String abc){
        return super.toSvg(String.format("transform=\""+ transformation +"\"" ));
    }
    public static class Builder{
        private Vec2 transform;
        private Vec2 angcent;
        private Vec2 scale;
        private boolean translating= false,rotating= false,scaling= false;

        public Builder  translate(Vec2 translation){
            this.transform = translation;
            translating = true;
            return this;
        }
        public Builder rotate(Vec2 center){
            this.angcent = center;
            rotating = true;
            return this;
        }
        public Builder scale(Vec2 scaleFactor){
            this.scale = scaleFactor;
            scaling = true;
            return this;
        }
        public TransformationDecorator build(Shape shape){
            TransformationDecorator obj = new TransformationDecorator(shape);
            obj.transformation = "";
            if (translating){
                obj.transformation+="translate("+ transform.x() + " " + transform.y() + ") ";
            }
            if (rotating){
                obj.transformation+="skewX("+ angcent.x() + ") " + "skewY("+ angcent.y() + ") ";
            }
            if (scaling){
                obj.transformation+="scale("+scale.x()+ "," +scale.y()+")";
            }
            return obj;
        }

    }


}
