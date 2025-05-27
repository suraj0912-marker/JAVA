import java.io.Serializable;
import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" welcome to Categorize student marks");
        int num= input.nextInt();
         String marks=num>80?"high":(num>50? "moderate":"low");
        System.out.println(" your category is ="+marks);

    }
}
