public class TataCar {
    int NoofWheels;
    int NoofDoors;
    int MaxSpeed;

    public TataCar(int noofWheels, int noofDoors, int maxSpeed, String name, String modelNumber) {
        NoofWheels = noofWheels;
        NoofDoors = noofDoors;
        MaxSpeed = maxSpeed;
        this.name = name;
        ModelNumber = modelNumber;
    }

    String name;
    String ModelNumber;

    public static void main(String[] args) {
        TataCar t=new TataCar(4,4,240,"TATA","WSR8");
        System.out.println(t);
    }

    @Override
    public String toString() {
        return "TataCar{" +
                "NoofWheels=" + NoofWheels +
                ", NoofDoors=" + NoofDoors +
                ", MaxSpeed=" + MaxSpeed +
                ", name='" + name + '\'' +
                ", ModelNumber='" + ModelNumber + '\'' +
                '}';
    }
}
