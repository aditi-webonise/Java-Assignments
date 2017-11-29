package implementation;

import service.Polygon;

public class Pentagon implements Polygon {
    int sum=540;
    @Override
    public void sumOfInteriorAngles(){
        System.out.println("Sum of Interior Angles of Pentagon is "+sum);
    }

    @Override
    public void perimeter(int length) {
        System.out.println("Perimeter of Pentagon is "+5*length) ;
    }
}
