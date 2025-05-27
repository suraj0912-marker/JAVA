import java.util.Scanner;

public class LeftSHift {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the left shift operator");
        System.out.println(" please enter your number");
        int num= input.nextInt();
        int result=~num;
        System.out.println(" your result is :"+ result);

    }
}
