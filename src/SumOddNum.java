import java.util.Scanner;
        class SumOddNum{
            public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
                System.out.println(" welcome to add the Odd Number");
                System.out.println(" please enter the number");
                int num= input.nextInt();
                int sum=SumOdd(num);
                System.out.println("add odd till"+num+"is"+sum);
            }
            public static int SumOdd(int num){
                int sum=0;
                int i=1;
                while(i<=num)
                {sum=sum+i;i=i+2;
                }return sum;
        }

        }





