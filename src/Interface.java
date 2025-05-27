 interface I1{
    void m();
}
interface I2 extends I1{
    void n();
}
class Doo implements I2 {
    @Override
    public void m() {
        System.out.println("hello");
    }

    @Override
    public void n() {
        System.out.println("welcome");
    }
}
    public class Interface {

        public static void main(String[] args) {
            Doo d = new Doo();
            d.m();
            d.n();
        }
    }


