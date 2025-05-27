import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" welcome to the Bitwise AND operator :\n");
        System.out.println(" please enter the first Number:");
        int first= input.nextInt();
        System.out.println(" now enter the second number :");
        int second= input.nextInt();
         int reslut=first&second;
        System.out.println(" your result is :"+reslut);
    }
}
