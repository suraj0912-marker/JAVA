package in.kgcoding.utils;

import in.kgcoding.geometry.Circle;
import in.kgcoding.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle c=new Circle(5.5);
       Rectangle r=new Rectangle(10,5 );
        double cArea=Math.PI*Math.pow(c.radius,2);
        double rArea=r.breadth*r.length;
        System.out.printf(" area of circle is: %f, area of rectangle is: %f",cArea,rArea);
    }
}

