package exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" please enter 1st value");
        int first= input.nextInt();
        System.out.println("please enter 2nd value");
        int second= input.nextInt();
        try {
            int result = first / second;
            System.out.printf(" result is %d", result);
        } catch (ArithmeticException e) {
            System.out.println("divide by zero enter value greater than 0 "+e.getMessage());



        }finally {
            System.out.println(" ye to chalega hi chalega");
        }
    }
}
