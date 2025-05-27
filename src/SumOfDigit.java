import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to the SumOfDIgit :");
        System.out.println(" please enter  your number");
        int num= input.nextInt();
        int Sum=Sum(num);
        System.out.println(" your toatal num is :"+Sum);
/*
both are doubt program not work properly
 */
    }
    public static int Sum(int num){
        int sum=0;
        while(num>0){
            sum =sum+num % 10;
           num=num/10;
        }
        return sum;
    }
}