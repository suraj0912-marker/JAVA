package in.kgcoding.twoThread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newSingleThreadExecutor();
        Runnable task=new singleExecutor('E');
        executor.submit(task);
        executor.shutdown();
    }
}
