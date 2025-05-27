import java.util.Scanner;
class Primenum{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to check the prime number:\n");
        System.out.println(" please enter your number :");
        int num= input.nextInt();
        boolean isPrime=isPrime(num);
        if(isPrime){
            System.out.println(" your number is Prime number");
        }else{
            System.out.println(" Your number is not a prime number");
        }
    }
    public static boolean isPrime(int num){
         int i=2;
         while(i<num){
             if(num%i==0){
                 return  false;
             }
             i++;
         }
      return  true;
    }
}