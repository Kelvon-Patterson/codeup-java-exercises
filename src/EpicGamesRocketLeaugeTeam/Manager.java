package EpicGamesRocketLeaugeTeam;

public class Manager extends TeamMember implements Actions {
    public Manager(String name, String department, int emp_no, int age) {
        super(name, department, emp_no, age);
    }

    @Override
    public boolean clockIn() {
        return false;
    }

    @Override
    public boolean clockOut() {
        return false;
    }

    @Override
    public boolean atLunch() {
        return false;
    }

    @Override
    public String work() {
        return null;
    }

    @Override
    public String meeting() {
        return null;
    }

    @Override
    public String cleaning() {
        return null;
    }

    @Override
    public String writeCode() {
        return null;
    }

    @Override
    public String takeRoleCall() {
        return null;
    }
}
