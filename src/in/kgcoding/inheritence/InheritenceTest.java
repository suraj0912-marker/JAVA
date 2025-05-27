package in.kgcoding.inheritence;

public class InheritenceTest {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        TwoWheeler tw=new TwoWheeler();
v.commute();
tw.commute();
        System.out.println(v.equals(tw));
        System.out.println(v.hashCode());
MotorCycle m=new MotorCycle();
m.start();

    }
}
