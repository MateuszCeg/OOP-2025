import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Polygon triangle = new Polygon(new Vec2[]{
                new Vec2(0, 0),
                new Vec2(300, 0),
                new Vec2(150, 250)
        });

        Polygon rectangle = new Polygon(new Vec2[]{
                new Vec2(350, 0),
                new Vec2(750, 0),
                new Vec2(750, 200),
                new Vec2(350, 200)
        });

        Polygon pentagon = new Polygon(new Vec2[]{
                new Vec2(0, 260),
                new Vec2(100, 460),
                new Vec2(300, 560),
                new Vec2(500, 460),
                new Vec2(600, 260)
        });

        Ellipse ellipse = new Ellipse(new Vec2(500, 700), 400, 100);

        Shape shape1 = new SolidFillShapeDecorator(new Polygon(new Vec2[]{
                new Vec2(0, 260),
                new Vec2(100, 460),
                new Vec2(300, 560)
        }), "blue");

        Shape shape2 = new SolidFillShapeDecorator(new Ellipse(new Vec2(50, 50), 100 ,50), "red");

        TransformationDecorator last = new TransformationDecorator.Builder()
                .translate( new Vec2(200, 200))
                .scale( new Vec2(4, 1) )
                .rotate(new Vec2(45,65))
                .build(pentagon);


        SvgScene scene = new SvgScene();
        scene.addShape(triangle);
        scene.addShape(rectangle);
        scene.addShape(pentagon);
        scene.addShape(ellipse);
        scene.addShape(shape1);
        scene.addShape(last);
        scene.save("result.svg");
    }
}
