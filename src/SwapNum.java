import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the swapping Station\n");
        System.out.println(" please enter the value of A ");
        int a= input.nextInt();
        System.out.println(" please enter the value of  B ");
        int b= input.nextInt();
// swapping means exhange the int between the declare variable
        int c =a;
        a=b;
        b=c;
        System.out.println(" now swapping is done.... ");
        System.out.println( " The value of A is = " +a);
        System.out.println(" The value of B is = " +b);



    }
}
