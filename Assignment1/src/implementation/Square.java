package implementation;

import service.Polygon;

public class Square implements Polygon {
    int sum=360;
    @Override
    public void sumOfInteriorAngles(){
        System.out.println("Sum of Interior Angles of Square is "+sum);
    }

    @Override
    public void perimeter(int length) {
        System.out.println("Perimeter of Square is "+4*length) ;
    }
}
