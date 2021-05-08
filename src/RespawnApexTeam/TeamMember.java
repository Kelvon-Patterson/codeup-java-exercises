package RespawnApexTeam;

public abstract class TeamMember {
    protected String name;
    protected String department;
    protected int age;

    public TeamMember(String name, String department, int age){
        this.name = name;
        this.department = department;
        this.age = age;
    }
    public abstract void displayInfo();

}
