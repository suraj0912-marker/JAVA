import java.util.Scanner;

public class CheckNumPosNegZero {
    public static void main(String[] args) {
        System.out.println(" determine the number");
        Scanner input  =new Scanner(System.in);
        System.out.println(" please enter the number");
        int num= input.nextInt();
        if(num>0){
            System.out.println(" number is positive :");
        }
        else  if (num<0)
        System.out.println(" number is negative :");{

        }
         if (num==0)
            System.out.println(" number is zero :");
    }
}
