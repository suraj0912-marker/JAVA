import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the factorial Programm:");
        System.out.println(" please enter your number");
        int num= input.nextInt();
        long Fact=Factorial(num);
        System.out.println(" your factorial number is :"+Fact);

    }
    public static long Factorial(int num){
        if(num<2){
            return 1;
        }
        long Fact=1;
        int i=2;
        while(i<=num){
            Fact=Fact*i;
            i++;
        }
        return Fact;

    }
}