import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to the factorial generator");
        System.out.println(" please enter your number");
        int num = input.nextInt();
        long Fact = Factorial(num);
        System.out.println(" your factorial number is :" + Fact);
    }

    public static long Factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
    public static long recall(int num){
        if(num==1){
            return 1;
        }
        return num*Factorial(num-1);
    }
}



