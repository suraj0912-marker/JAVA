import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome the day checker detector");
        System.out.println(" enter your day");
        int day = input.nextInt();
        OldSwitch(day);

    }

    public static void OldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println(" monday");
                break;
            case 2:
                System.out.println(" tuesday");
                break;
            case 3:
                System.out.println(" wednesday");
                break;
            case 4:
                System.out.println(" thrusday");
                break;
            case 5:
                System.out.println(" friday");
                break;
            case 6:
                System.out.println("saturdar");
                break;
            case 7:
                System.out.println(" sunday");
                break;
            default:
                System.out.println(" invalid day");
        }

    }
}
