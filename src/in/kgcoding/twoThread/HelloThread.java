package in.kgcoding.twoThread;

public class HelloThread extends Thread {
    private final int threadnumber;
    public HelloThread(int threadnumber){
        this.threadnumber=threadnumber;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.printf("hello from Thread-%d\n",threadnumber);

        }
    }
}
