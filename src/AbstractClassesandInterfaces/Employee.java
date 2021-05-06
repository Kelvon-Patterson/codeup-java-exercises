package AbstractClassesandInterfaces;

public abstract class Employee implements DailyWork {
    protected String name; //fields for our objects
    protected String department; //^
    protected int id; // ^^

    public Employee(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }
}
//public abstract String work(); //Setting up a blank method - our classes that inherit will fill in the deets!
