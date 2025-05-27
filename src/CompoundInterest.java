import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the Compund Interest program");
        float p,r,t,ci;
        System.out.println(" please enter the value of Principal");
        float principal= input.nextFloat();
        System.out.println(" please enter the value of rate");
        float rate= input.nextFloat();
        System.out.println(" please enter the duration time ");
        float time= input.nextFloat();
        ci=(principal*(1+rate/100)*time);
        System.out.println(" your ci is :"+ci);
    }
}
