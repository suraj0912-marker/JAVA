import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        greet();
     firstNum();
     secondNum();

        /*
        send back a value from a function
        example mere liye ek glass pani leke aao
         */



    }
    public static void greet(){
        System.out.println(" welcome to the calculator");
        int firstNum = 0;
        int secondNum = 0;
        int sum=firstNum+secondNum;

    }
    public static void firstNum(){
        Scanner input=new Scanner(System.in);
        System.out.println(" please enter the first number");
        int first= input.nextInt();
    }
    public static void secondNum(){
        Scanner input=new Scanner(System.in);
        System.out.println(" please enter the second number: ");
        int second= input.nextInt();



    }
    public static void result(){

    }

    }

