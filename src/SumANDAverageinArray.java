import java.util.Scanner;

public class SumANDAverageinArray {
    public static void main(String[] args) {
        System.out.println(" welcome");
        int []numArray=utilityclass.inputArray();
        long sum=sum(numArray);
        int average=average(numArray);
        System.out.println(" sum of the number is :"+ sum);
        System.out.println(" average of the number is :"+average);
    }
    public static long sum(int[]numArray){
        long sum=0;
        int i=0;
        while(i< numArray.length){
            sum=sum+ numArray[i];
            i++;
        }
        return sum;

    }
    public static int average(int[]numArray){
      long sum=sum(numArray);
      return (int)(sum/ numArray.length);
        }


    }



