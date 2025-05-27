import java.util.Scanner;

public class RightSHift {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the Right shift operator");
        System.out.println(" please enter your number");
        int num= input.nextInt();
        int result=num>>1;
        System.out.println(" your result is :"+ result);

    }
}
