import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the area of rectangle ");
        System.out.println(" please enter the value of base");
        double base= input.nextDouble();
        System.out.println(" please enter the value of height");
        double height= input.nextDouble();
        double AreaofTriangle=0.5*base*height;
        System.out.println(" The area of Triangle is :"+ AreaofTriangle);
    }
}
