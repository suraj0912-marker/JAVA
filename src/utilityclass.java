import java.util.Scanner;

public class utilityclass {
    public static int[]inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to sum and average program");
        System.out.println(" please enter the number of elements");
        int size= input.nextInt();
        int[]nums=new int[size];
        int i=0;
        while(i<size){
            System.out.println(" please enter element no :"+(i+1)+": ");
            nums[i]=input.nextInt();
            i++;
        }
        return nums;
    }
}
