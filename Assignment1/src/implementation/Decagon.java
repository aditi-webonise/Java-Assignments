package implementation;

import service.Polygon;

public class Decagon implements Polygon {
    int sum=1440;
    @Override
    public void sumOfInteriorAngles(){
        System.out.println("Sum of Interior Angles of Decagon is "+sum);
    }

    @Override
    public void perimeter(int length) {
        System.out.println("Perimeter of Decagon is "+10*length) ;
    }
}
