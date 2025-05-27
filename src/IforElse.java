import java.util.Scanner;

public class IforElse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the result calculator");
        System.out.println(" please enter your percentage :");
        float percantage= input.nextFloat();
        if(percantage>=90)
        {
            System.out.println( " you have A grade : ");
        } else if (percantage>=75) {
            System.out.println(" you have B grade ");
        } else if (percantage>=50){
            System.out.println(" you  have C grade");
        } else if (percantage<=30){
            System.out.println(" sorry you are fail :");
        }
    }
}
