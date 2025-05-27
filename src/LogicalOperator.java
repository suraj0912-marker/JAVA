import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {

        System.out.println(" welcome to the discount calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter your age :");
        int age = input.nextInt();
        System.out.println(" are you a female ? (true/ false)");
        boolean isFemale = input.nextBoolean();
        ;
        if (age < 5) {
            System.out.println(" you got 75% discound");
        } else if (isFemale)
            System.out.println(" you got 50% discount ");
    }
    }


/*
AND true true =true sabji roti
OR  true false =true  coffe or tea
    true false =false
NOT false ;  biryani



 */