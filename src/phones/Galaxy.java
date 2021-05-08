package phones;

public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        System.out.println("Galaxy S10");
        System.out.println(ring());
        System.out.println(unlock());
    }

    @Override
    public String ring() {
        return "Galaxy jingle";
    }

    @Override
    public String unlock() {
        return "Galaxy unlocked!";
    }
}
