import java.util.Scanner;

public class TernaryMinimum {
    public static void main(String[] args) {
        Scanner input=new Scanner( System.in);
        System.out.println(" welcome to the Ternary minimum two number");
        //System.out.println(" please enter your first number");
        int first=10;
        System.out.println(" now enter your second number");
        int second= input.nextInt();
        int minimum=second<first?second:first;
        System.out.println(" minimum number is "+minimum);
    }
}
