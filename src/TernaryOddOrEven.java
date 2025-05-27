import java.util.Scanner;

public class TernaryOddOrEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to check the number is even or odd");
        System.out.println(" please enter your  number");
        int num = input.nextInt();
        String reuslt=num%2==0?"even":"odd";
        System.out.println(" your number is :"+reuslt);
    }
}
