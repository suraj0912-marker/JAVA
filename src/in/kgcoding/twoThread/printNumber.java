package in.kgcoding.twoThread;

public class printNumber implements Runnable{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.printf("number is %d\n" ,i+1);

        }
    }
}
