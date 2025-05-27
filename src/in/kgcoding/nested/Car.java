package in.kgcoding.nested;

public class Car {
   public void start(){
       Tyre t=new Tyre();
   }

    public static class Tyre{
        private double width;
        private String material;
        private double pressure;
    }
}
