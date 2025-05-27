package in.kgcoding.twoThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singlePrintService {
    public static void main(String[] args) {
        ExecutorService service= Executors.newSingleThreadExecutor();
        printNumber pt=new printNumber();
        service.submit(pt);
    }
}
