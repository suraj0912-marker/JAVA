import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println(" please enter your first number");
        int n= input.nextInt();
        System.out.println(" please enter your second number");
        int num= input.nextInt();
        int sum;
        sum=n+num;

        System.out.println(" addition is = " + sum);
    }
}
