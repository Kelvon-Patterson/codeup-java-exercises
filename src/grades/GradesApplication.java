package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {
        Map<String, Students> students = new HashMap<>();
        Students jake = new Students("Jake");
        Students kelvon = new Students("Kelvon");
        Students serg = new Students("Sergio");
        Students alex = new Students("Alex");


        jake.addGrade(68);
        jake.addGrade(99);
        jake.addGrade(100);
        kelvon.addGrade(69);
        kelvon.addGrade(99);
        kelvon.addGrade(84);
        kelvon.addGrade(89);
        serg.addGrade(100);
        serg.addGrade(83);
        serg.addGrade(70);
        alex.addGrade(99);
        alex.addGrade(93);
        alex.addGrade(94);

        students.put("jakechadwell", jake);
        students.put("kelvonpatterson",kelvon);
        students.put("sergioDavila", serg);
        students.put("ThomsAlexander", alex);

        System.out.println(students);
    }
}
