package in.kgcoding.twoThread;

public class singleExecutor implements Runnable {
    public void run(){
        for (int i = 0; i <1000 ; i++) {

            System.out.printf("%d:%c",i,targetChar);

        }
        System.out.printf("\n%c Task Done\n",targetChar);
    }
    private final char targetChar;
    public singleExecutor(char targetChar){
        this.targetChar=targetChar;
    }
}
