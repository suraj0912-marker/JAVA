import java.util.Scanner;

public class RelationalOp {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" welcome to check to driving licnese");
        int age=input.nextInt();
        if(age >= 18) {
            System.out.println(" your are eligible for driving licnese : ");
        }else{
            System.out.println(" not eligible  for driving licnese");
        }

    }
}

/* eqality == check the value equality  6==6;
inequality != 8!=3
realational
> greater than 9>7
< less than 9<12
>= greater than or equal to
<= less than or equal to
   */