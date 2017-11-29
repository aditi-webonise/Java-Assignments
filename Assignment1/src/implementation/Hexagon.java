package implementation;

import service.Polygon;

public class Hexagon implements Polygon {
    int sum=720;
    @Override
    public void sumOfInteriorAngles(){
        System.out.println("Sum of Interior Angles of Hexagon is "+sum);
    }

    @Override
    public void perimeter(int length) {
        System.out.println("Perimeter of Hexagon is "+6*length) ;
    }
}
