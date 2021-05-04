package InheritanceAndPolymorphism;

public class Vehicle {
    private int numberOfOccupants;
    private int maxSpeed;

    //constructor -- the name of the class dictates the name of the constructor!!
    public Vehicle(){
        this.maxSpeed=0;
    }
    //constructor-- the name of the class dictates the name of the constructor!!
    public Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    //constructor
    public void start(){
        System.out.println("Starting...");
    }
    //method Getter
    public int getNumberOfOccupants(){
        return this.numberOfOccupants;
    }
    //method setter
    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }


}
