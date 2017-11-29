package implementation;

import service.Polygon;

public class Octagon implements Polygon {
    int sum=1080;
    @Override
    public void sumOfInteriorAngles(){
        System.out.println("Sum of Interior Angles of Octagon is "+sum);
    }

    @Override
    public void perimeter(int length) {
        System.out.println("Perimeter of Octagon is "+8*length) ;
    }
}
