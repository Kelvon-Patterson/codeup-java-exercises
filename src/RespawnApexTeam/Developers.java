package RespawnApexTeam;

import java.util.Scanner;

public class Developers extends TeamMember implements DailyTask {

    public Developers(String name, String department, int age) {
        super(name, department, age);
    }

    @Override
    public void displayInfo() {

    }


    public boolean clockedIn() {
        Scanner scanner = new Scanner(System.in);
        String clockingIn = scanner.nextLine();
        System.out.println("Are you clocking in? [Yes/No]");
        return clockingIn.equalsIgnoreCase("Yes");
    }


    public boolean logIn() {
        if (clockedIn()) {
            return true;
        }else{
            return clockedIn();
        }
    }

    public String work(){
        return "Writing code";
    }


    public int hoursWorked() {
        return 10;
    }


    public int payPerHour() {
        return 30;
    }

    public String lunchTime() {
        return "@12:00 it's lunch time!";
    }

    public boolean clockedOut() {
        Scanner scanner = new Scanner(System.in);
        String clockingOut = scanner.nextLine();
        System.out.println("Are you clocking in? [Yes/No");
        if (clockingOut.equalsIgnoreCase("Yes")) {
            return true;
        }else{
            return false;
        }
    }


    public String devMeeting() {
        return "Dev meeting at 9:30 a.m.";
    }

    @Override
    public String greeting() {
        return "Hello there !";
    }
}
