import java.util.Scanner;

public class SwitchMonth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to switch month");
        System.out.println(" please enter month number");
        int monthnum= input.nextInt();
        System.out.println(" your month is "+monthnum);

        switch (monthnum){
            case 1:
                System.out.println(" january");
                break;
            case 2:
                System.out.println(" feb");
                break;
            case 3:
                System.out.println(" mar");
                break;
            case 4:
                System.out.println(" apr");
                break;
            case 5:
                System.out.println(" may");
                break;
            case 6:
                System.out.println(" june");
                break;
            case 7:
                System.out.println(" july");
                break;
            case 8:
                System.out.println(" aug");
                break;
            case 9:
                System.out.println(" sept");
                break;
            case 10:
                System.out.println(" oct");
                break;
            case 11:
                System.out.println(" november");
                break;
            case 12:
                System.out.println(" december");
                break;
            default:
                System.out.println(" please enter valid number");


        }
    }
}
