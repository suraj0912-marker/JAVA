import java.util.Scanner;
public  class ArraySeraching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {12, 23, 34, 45, 56, 78};
        System.out.println(" welcome to the array searching program");
        System.out.println(" please enter your number");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println(" Yes ' your number was found ");

        } else {
            System.out.println(" no number was not found");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}