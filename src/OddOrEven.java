import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(" welcome to check the number even or odd");
        Scanner input =new Scanner(System.in);
        System.out.println(" please enter the number");
        int num= input.nextInt();
        if(num%2==0){
            System.out.println(" your nunber is Even :");

        } else if (num%2>=0) {
            System.out.println( " your number is Odd :");

        }

    }
}
