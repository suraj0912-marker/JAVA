import java.util.Scanner;

public class BItwiseEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to check the number");
        System.out.println(" please enter your number");
        int num = input.nextInt();

        if ((num & 1) == 1)
            System.out.println(" your number is odd : ");
        else {
            System.out.println(" your number is even");


        }
    }
}


