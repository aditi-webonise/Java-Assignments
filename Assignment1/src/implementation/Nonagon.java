package implementation;

import service.Polygon;

public class Nonagon implements Polygon {
    int sum=1260;
    @Override
    public void sumOfInteriorAngles(){
        System.out.println("Sum of Interior Angles of Nonagon is "+sum);
    }

    @Override
    public void perimeter(int length) {
        System.out.println("Perimeter of Nonagon is "+9*length) ;
    }
}
