package implementation;

import service.Polygon;

public class Triangle implements Polygon {
    int sum=180;
    @Override
    public void sumOfInteriorAngles(){
        System.out.println("Sum of Interior Angles of Triangle is "+sum);
    }

    @Override
    public void perimeter(int length) {
        System.out.println("Perimeter of Traingle is "+3*length) ;
    }
}
