import java.util.Scanner;

public class TernaryAbosoluteValue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to the check of absolute value");
        System.out.println(" please enter your number");
        int num= input.nextInt();
        int result=num>=0?num:-num;
        System.out.println("absolute value is "+result);

    }
}
