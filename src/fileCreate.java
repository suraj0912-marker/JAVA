import java.io.FileOutputStream;
import java.util.Date;
import java.util.Scanner;

public class fileCreate {
    public static void main(String[] args) {
        try{
            Scanner input=new Scanner(System.in);
            System.out.println(" please enter your name");
            String name= input.next();
            System.out.println(" please enter your principle");
            float p= input.nextFloat();
            System.out.println(" please enter your rate");
            float r= input.nextFloat();
            System.out.println(" please enter your time");
            float t= input.nextFloat();
            float si=p*r*t/100;
            System.out.println(name+" simple interest" + si +" "+new Date());
            String s=name+"simple interest="+ si +" "+new Date()+"\n";
            FileOutputStream fos=new FileOutputStream("simple interest.txt",true);
            byte[] b =s.getBytes();
            fos.write(b);
            System.out.println(" your file has created and data has writed");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
