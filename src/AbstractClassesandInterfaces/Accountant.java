package AbstractClassesandInterfaces;



public class Accountant extends Employee {

    public Accountant(String name, String department, int id) {
        super(name, department, id);
    }

    public String work(){
        return "TPS Reports drafted!";
    }//Now we need to fill in those details!

    public String morningMeeting(){
        return "Accountants have meetings beginning at 8:15AM and run intil 8:45AM.";
    }

    public String lunchTime(){
        return "Accountants take their lunch when they want and at their desk.";
    }

    public int dailyPay(){
        return 500;
    }


}