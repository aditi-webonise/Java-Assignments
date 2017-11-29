import implementation.*;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.sumOfInteriorAngles();
        triangle.perimeter(10);

        Square square = new Square();
        square.sumOfInteriorAngles();
        square.perimeter(10);

        Pentagon pentagon = new Pentagon();
        pentagon.sumOfInteriorAngles();
        pentagon.perimeter(10);

        Hexagon hexagon = new Hexagon();
        hexagon.sumOfInteriorAngles();
        hexagon.perimeter(10);

        Heptagon heptagon = new Heptagon();
        heptagon.sumOfInteriorAngles();
        heptagon.perimeter(10);

        Octagon octagon = new Octagon();
        octagon.sumOfInteriorAngles();
        octagon.perimeter(10);

        Nonagon nonagon = new Nonagon();
        nonagon.sumOfInteriorAngles();
        nonagon.perimeter(10);

        Decagon decagon = new Decagon();
        decagon.sumOfInteriorAngles();
        decagon.perimeter(10);
    }
}
