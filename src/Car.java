public class Car {
    int Noofwheel;
    String name;
    float CurrentfuelinLitre;
    float Maxspeed;
    int noofseat;

    public void drive(){
        System.out.println(" car is driving");
        CurrentfuelinLitre--;

    }
    public void Addfuel(float fuel){
        CurrentfuelinLitre+=fuel;
    }
    public float getCurrentfuelLeft(){
        return CurrentfuelinLitre;
    }

}
