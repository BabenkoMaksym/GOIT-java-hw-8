public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.printName();

        Square square = new Square();
        square.printName();

        new GetShapeName(square);
    }
}
