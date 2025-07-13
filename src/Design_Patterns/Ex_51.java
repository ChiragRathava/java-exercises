// Factory Pattern

/* The Factory pattern defines an interface for creating an object but lets subclasses alter the type of objects that will be created. */

package Design_Patterns;

public class Ex_51 {

    interface Shape { void draw(); }

    static class Circle implements Shape
    { public void draw(){ System.out.println("Drawing a Circle"); } }

    static class Square implements Shape
    { public void draw(){ System.out.println("Drawing a Square"); } }

    static class Rectangle implements Shape
    { public void draw(){ System.out.println("Drawing a Rectangle"); } }

    static class ShapFactory {
        public Shape getShape(String shapeType)
        { if (shapeType == null){ return null; }
            switch (shapeType.toLowerCase())
            {
                case "circle" : return new Circle();
                case "square" : return new Square();
                case "rectangle" : return new Rectangle();
                default: return null;
            }
        }
    }

    public static void main(String[] args) {
        ShapFactory factory = new ShapFactory();

        Shape shape1 = factory.getShape("circle");
        Shape shape2 = factory.getShape("square");
        Shape shape3 = factory.getShape("rectangle");

        if (shape1 != null) shape1.draw();
        if (shape2 != null) shape2.draw();
        if (shape3 != null) shape3.draw();
    }
}
