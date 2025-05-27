import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" please enter your number");
        int num= input.nextInt();
        Printtable(num);
    }
    public static void Printtable(int num) {
        int i;
        for (i = 1; i <= 9; i++) {
        }
        System.out.println(num + "X" + i + "=" + (num * i));
    }
}