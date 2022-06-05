public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        GetShapeName printer = new GetShapeName();
        printer.printName(circle);
        printer.printName(square);

    }
}
