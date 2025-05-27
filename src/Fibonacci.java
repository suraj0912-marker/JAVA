import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to the fibonacci series");
        System.out.println(" please enter your number");
        int n = input.nextInt();
        fibonacci(n);
        System.out.println(" your number is :" + n);
    }

    public static int fibonacci(int num) {
        int a = 0;
        int b = 1;
        for (int i = 3; i <= num; i++) {
            System.out.println(a + "  ");
            System.out.println(b + " ");
            int c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;

        }
        return a;
    }
}

