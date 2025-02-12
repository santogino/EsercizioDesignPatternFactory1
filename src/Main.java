public class Main {
    public static void main(String[] args) {
        Shape quadrato = ShapeFactory.typeOfShape(TypeOfShapeEnum.QUADRATO);
        Shape triangolo = ShapeFactory.typeOfShape(TypeOfShapeEnum.TRIANGOLO);
        Shape rettangolo = ShapeFactory.typeOfShape(TypeOfShapeEnum.RETTANGOLO);

        quadrato.draw();
        triangolo.draw();
        rettangolo.draw();
    }
}