package in.kgcoding.twoThread;

public class stateMain {
    public static void main(String[] args)throws InterruptedException {
        threadState t1=new threadState();
        System.out.printf("\ncreate the thread %s",t1.getState());
        t1.getState();
        t1.start();
        t1.join();
        System.out.printf("\nthread finished %s",t1.getState());
    }
}
