package AbstractClassesandInterfaces;

public class Custodian extends Employee{
    public Custodian(String name, String department, int id) {
        super(name, department, id);
    }

    public String work(){
        return "Maintaining the building";
    }

    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance department. They schedule meetings as necessary.";
    }

    public String lunchTime() {
        return "12:00 - 1:00";
    }

    public int dailyPay() {
        return 120;
    }
}
