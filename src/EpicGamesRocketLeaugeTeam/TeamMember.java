package EpicGamesRocketLeaugeTeam;

public abstract class TeamMember {
    protected String name;
    protected String department;
    protected int emp_no;
    protected int age;

    public TeamMember(String name, String department,int emp_no,int age){
        this.name=name;
        this.department=department;
        this.emp_no=emp_no;
        this.age=age;
    }
}
