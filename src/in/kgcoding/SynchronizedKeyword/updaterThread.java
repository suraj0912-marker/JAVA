package in.kgcoding.SynchronizedKeyword;


import org.w3c.dom.css.Counter;

class updaterThread extends Thread{
    public Counter counter;
    public updaterThread (Counter counter){
        this.counter=counter;
    }
    public void run(){
        for (int i = 0; i <1000 ; i++) {
        }
    }

}