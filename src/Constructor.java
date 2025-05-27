public class Constructor {
    String color;
    float price;
    Constructor(){
        color="black";
        price=123321;
    }

    public static void main(String[] args) {
        Constructor car=new Constructor();
        System.out.println(car);
    }
}
