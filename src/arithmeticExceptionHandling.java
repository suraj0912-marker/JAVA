import java.util.Scanner;

public class arithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the arithmetic exception handling");
        System.out.print(" please enter the 1st value");
        int first= input.nextInt();
        System.out.print(" please enter 2nd value");
        int second= input.nextInt();
        try{
            int result=first/second;
            System.out.println(" result is %d"+result);
        } catch (ArithmeticException e) {
            System.out.println("divide by zero occur");
            throw new RuntimeException(e.getMessage());
        }

    }
}
