import java.util.Scanner;

public class PeriofRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" please enter the perimeter in all 4 side in cms");
        System.out.println(" please enter the first side in cms");
        double a= input.nextDouble();
        System.out.println(" please enter the second side in cms");
        double b= input.nextDouble();
        System.out.println(" please enter the  third side in cms");
        double c= input.nextDouble();
        System.out.println(" please enter the fourth side in cms");
        double d= input.nextDouble();

        double perimeter=a+b+c+d;
        System.out.println( "  perimeter of rectangle is :"+ perimeter);


    }
}
