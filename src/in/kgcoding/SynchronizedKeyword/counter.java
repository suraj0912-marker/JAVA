package in.kgcoding.SynchronizedKeyword;

class counter{
    public static String getcount;
    private int count =0;
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}