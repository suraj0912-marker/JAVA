import java.util.Scanner;

public class ArithmeticTask {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" welcome to the arithmetic operation");
        System.out.println(" please enter the first number");
        int first= input.nextInt();
        System.out.println(" please enter the second number");
       int Second = input.nextInt();



        int add=first+Second;
        int sub=first-Second;
        int mul=first*Second;
        int div=first/Second;
        int mod=first%Second;


        System.out.println( " addition is : " + add);
        System.out.println( " subtraction is : " + sub);
        System.out.println( " multiplication is : " + mul);
        System.out.println( " division  is : " + div);
        System.out.println( " modulor  is : " + mod);


    }
}
