package RespawnApexTeam;

public class GameTester extends TeamMember implements DailyTask {

    public GameTester(String name, String department, int age) {
        super(name, department, age);
    }

    @Override
    public boolean clockedIn() {
        return true;
    }

    @Override
    public boolean logIn() {
        return true;
    }

    @Override
    public String work() {
        return "Grabbing controller and testing game functionality";
    }

    @Override
    public int hoursWorked() {
        return 8;
    }

    @Override
    public int payPerHour() {
        return 40;
    }

    @Override
    public String lunchTime() {
        return "Lunch is at noon for an hour";
    }

    @Override
    public boolean clockedOut() {
        return true;
    }

    @Override
    public String devMeeting() {
        return "I noticed during gameplay that theres a bug making me fall through the map";
    }

    @Override
    public String greeting() {
        return "Hello there buddy";
    }

    public String chooseGame(){
        return "I choose Apex Legends today";
    }

    @Override
    public void displayInfo() {
        System.out.println("Game tester reporting for duty");
        System.out.println(logIn());
        System.out.println(work());
        System.out.println(devMeeting());
        System.out.println(lunchTime());
        System.out.println(work());
        System.out.println(clockedOut());
        System.out.println(hoursWorked());
        System.out.println(payPerHour());
        System.out.println(chooseGame());
    }
}
