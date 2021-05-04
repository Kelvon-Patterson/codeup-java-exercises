package InheritanceAndPolymorphism;

public class Bus extends Vehicle {
    private boolean headlightsOn;

    public Bus(int maxSpeed){
        //need to call super to use maxSpeed.
        super(maxSpeed);
        this.headlightsOn = false;
    }
    //We're going to overide the start method in our bus class
    public void start(){
        System.out.println("...Cranking bus engine");
    }

    public boolean isHeadlightsOn(){
        return headlightsOn;
    }
    public void setHeadlightsOn(boolean headlightsOn){
        this.headlightsOn = headlightsOn;
    }
    public void honkHorn(){
        System.out.println("HONK HONK!!");
    }


}
