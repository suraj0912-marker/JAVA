import java.lang.Math;
import java.util.Scanner;

public class UseMathPI {
    double radius;
    UseMathPI(double radius){
        this.radius=radius;
    }
    double getCircumgerence(){
        return  2* radius * Math.PI;

    }
    double getarea(){
        return Math.PI* Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "UseMathPI{" +
                "radius=" + radius +
                '}';
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the world of circle:\n");
        System.out.println(" please enter your radius");
        double radius= input.nextDouble();
        UseMathPI c=new UseMathPI(radius);
        System.out.println(radius);

    }
}
