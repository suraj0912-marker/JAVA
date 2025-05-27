import java.lang.Math;
import java.util.Scanner;

public class GuessingGame {
    int random;
    GuessingGame(){
     random=(int) Math.ceil(Math.random()* 100);
    }

    /**
     * *
     * @return - Negative if the guessed number is samller
     * - 0 if the guesed number is correct
     * - positive if the guessed number is higher.
     */
    int guess(int GuessGame){
        return GuessGame-random;

    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        GuessingGame game=new GuessingGame();
        System.out.println(" welcome to the guessing game guess the number between 1 to 100\n");
        int guess;
        int result;
        do {
            System.out.println("guess the number: ");
            guess= input.nextInt();
            result =game.guess(guess);
            if(result==0){
                System.out.println(" your number is correct: ");

            } else if (result>0) {
                System.out.println(" please guess higher: ");


            }
           else {
               System.out.println(" please guess smaller: ");

           }


        }while (result!=0);
    }

}

