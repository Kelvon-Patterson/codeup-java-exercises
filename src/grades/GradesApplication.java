package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {



    public static void main(String[] args) {
        Map<String, Students> students = new HashMap<>();
        Students jake = new Students("Jake");
        jake.addGrade(68);
        jake.addGrade(99);
        jake.addGrade(100);
        Students kelvon = new Students("Kelvon");
        kelvon.addGrade(69);
        kelvon.addGrade(99);
        kelvon.addGrade(84);
        kelvon.addGrade(89);
        Students serg = new Students("Sergio");
        serg.addGrade(100);
        serg.addGrade(83);
        serg.addGrade(70);
        Students alex = new Students("Alex");
        alex.addGrade(99);
        alex.addGrade(93);
        alex.addGrade(94);

        students.put("jakechadwell", jake);
        students.put("kelvonpatterson",kelvon);
        students.put("sergioDavila", serg);
        students.put("ThomsAlexander", alex);

        Scanner scanner = new Scanner(System.in);


        String userContinue = scanner.nextLine();
        do{
            System.out.println("Welcome ! \n Here are the Github usernames of our students:");
            System.out.println("| jakechadwell |  | kelvonpatterson |  | sergioDavila |  | ThomsAlexander |");
            String userChoice = scanner.nextLine();
            if (userChoice != null && students.containsKey(userChoice)) {
                System.out.println("Name:  " + students.get(userChoice).getName() +" - Github Username: " + userChoice);
            }else{
                System.out.println("Sorry that's not a username here!");
            }
      }while(userContinue.equalsIgnoreCase("yes"));

        }

    }

