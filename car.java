public class car {
    int noofwheels;
    String color;
    float maxspeed;
    float currentFuelInLitters;
    int noofSteats;

    public void drive(){
        System.out.println("Car is driving");
           currentFuelInLitters--;
    }

    public void addFuel(float fuel){
        currentFuelInLitters += fuel;
    }
    public float getCurrentFuellevel(){
        return currentFuelInLitters;
    }
}
