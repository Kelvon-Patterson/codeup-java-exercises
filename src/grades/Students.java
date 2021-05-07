package grades;

import java.util.ArrayList;

public class Students {

    private String name;
    private ArrayList<Integer> grades;

    Students(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
         this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for(int grade: grades){

            sum += grade;
        }
            return (double) sum / this.grades.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<Integer> grades  = new ArrayList<>();

        Students jake = new Students("Jake");




        System.out.println("jake.getGradeAverage() = " + jake.getGradeAverage());




    }


}
