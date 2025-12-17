package pl.edu.vistula.task1;

public class ShapeMain {
    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println(shape.name() + ": " + shape.ordinal());
        }
    }
}