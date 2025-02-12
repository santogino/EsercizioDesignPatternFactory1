public class ShapeFactory {

    public static Shape typeOfShape(TypeOfShapeEnum form){
        Shape shape = switch(form){
            case QUADRATO -> new Quadrato();
            case TRIANGOLO -> new Triangolo();
            case RETTANGOLO -> new Rettangolo();
        };
        return shape;
    }
}
