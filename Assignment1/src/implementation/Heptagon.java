package implementation;

import service.Polygon;

public class Heptagon implements Polygon {
    int sum=900;
    @Override
    public void sumOfInteriorAngles(){
        System.out.println("Sum of Interior Angles of Heptagon is "+sum);
    }

    @Override
    public void perimeter(int length) {
        System.out.println("Perimeter of Heptagon is "+7*length) ;
    }
}
