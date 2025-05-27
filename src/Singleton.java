class Too{
    static Too T=new Too();
    private Too(){}
    public static  Too getInstance(){
        return T;
    }
}


public class Singleton {
    public static void main(String[] args) {
        Too T1=Too.getInstance();
        Too T2=Too.getInstance();
        Too T3=Too.getInstance();
        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);
    }
}
