package oopLecture;

public class Student {
    public String name;
    public String cohort;
    public String campus;
    public double grade;

public Student(String studentName, String assignedCohort){
//    name = studentName;
//    cohort = "unassignedCohort";
//    campus = "TBD";
    // herer we can use the this keyword to refer to the object
    this.name = studentName;
    this.cohort = assignedCohort;
    this.campus = "TBD";
    this.grade = 0;

}

    public Student(String studentName) {
        this.name = studentName;
        this.cohort = "unassignedCohort";
        this.campus = "TBD";
        this.grade = 0;
    }
    public Student(String studentName, String assignedCohort, double grade){
        this.name = studentName;
        this.cohort = assignedCohort;
        this.campus = "TBD";
        this.grade = 0;

    }    
    
    public String rollCall(){
    return this.name + " is here and ready for class";
}
    public static void main(String [] args){
       

    //Old way of doing things
        //Student exampleStudent = new Student();
        //From there.. we'd continue to fil in all of the fields ourselves

        //Now though: Let's use our constructor
        Student kelvon = new Student("Kelvon");

        System.out.println("kelvon.name = " + kelvon.name);

        System.out.println("kelvon.cohort = " + kelvon.cohort);


        //We cannot use this because we require parameter (String studentName); So we will need
        //public Student(){}; in the -- public class Student{ in here } to use this. This is an example of method overloading.
        //Student noField = new Student();


    }
}
