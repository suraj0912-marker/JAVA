package in.kgcoding.abstarction;

public abstract class Vehicle {
    private int noOfTyre=4;

    public Vehicle(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public int getNoOfTyre() {
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }
    public void commute(){
        System.out.println("going");
    }
}
