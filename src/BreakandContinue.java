public class BreakandContinue {
    public static void main(String[] args) {
        System.out.println(" before loop");
        for(int i=101;i<1000;i++){
            if(i==101){
                continue;

            }
            System.out.println(i);
        }
        System.out.println(" out of loop");
    }
}
