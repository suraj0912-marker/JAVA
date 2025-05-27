import java.util.Scanner;

class TernaryOPerator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" please enter your first number");
        int first= input.nextInt();
        System.out.println(" Now enter your second number");
        int second= input.nextInt();
        int GreaterNumber=first>second?first:second;
        System.out.println(GreaterNumber+" is the greater number");
    }
}