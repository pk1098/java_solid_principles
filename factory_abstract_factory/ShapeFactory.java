package factory_abstract_factory;

public class ShapeFactory {
    public static shape getShape(String shapeType){
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
