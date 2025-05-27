import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to the age calculator");
        System.out.println(" please enter your age");
        int age = input.nextInt();
        if (age >= 65) {
            System.out.println(" you are senior citizen");
        } else if (age >=25 )
        System.out.println(" you are teenager");
        else if (age>=15){
            System.out.println(" you are adult");
        } else if
        (age>=5) {
            System.out.println(" you are child");

        }
    }
}


