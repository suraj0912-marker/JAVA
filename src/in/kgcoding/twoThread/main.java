package in.kgcoding.twoThread;

public class main {
    public static void main(String[] args) {
        HelloThread t1=new HelloThread(1);
        HelloThread t2=new HelloThread(2);

        t1.start();
        t2.start();
    }
}
