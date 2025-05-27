import java.util.Scanner;

public class SImpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to check the simple interest");
        float p,r,t,si;
        System.out.println(" please enter the value of Principal");
        float principal= input.nextFloat();
        System.out.println(" please enter the value of rate");
        float rate= input.nextFloat();
        System.out.println(" please enter the duration time ");
        float time= input.nextFloat();
       si=principal*rate*time/100;
        System.out.println( " simple interest is :"+si);

    }
}
