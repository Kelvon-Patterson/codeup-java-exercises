package phones;

public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    public String ring(){
            return "Iphone jingle";
        }

    @Override
    public String unlock() {
        return "IPhone unlocked";
    }


    @Override
    public void displayInfo() {
        System.out.println("IPhone X");
        System.out.println(ring());
        System.out.println(unlock());
    }
}
