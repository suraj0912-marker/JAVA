package in.kgcoding.SynchronizedKeyword;

import org.w3c.dom.css.Counter;

class testingSynchronize{
    private static Counter counter;

    public static void main(String[] args)throws  InterruptedException {
        updaterThread t1=new updaterThread(counter);
        updaterThread t2=new updaterThread(counter);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final count is:"+counter);

    }

}