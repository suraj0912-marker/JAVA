package in.kgcoding.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c=new Car();
        Vehicle v=new Vehicle();
        Plane p=new Plane();
      //  Vehicle vCar=new Car();
       // Vehicle cVehicle=(Car)new Vehicle();
      castTest(v);
      castTest(c);
      castTest(p);
    }
    private static void castTest(Vehicle veh){

        Vehicle cVehicle=(Car)new Vehicle();
        cVehicle.start();
        cVehicle.nofoFDoors();
    }
}
