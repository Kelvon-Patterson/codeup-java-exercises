import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //Loop Basics
        //a. While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

        //Solution
//        int i =5;
//        while(i<=15){
//            System.out.println("i = " + i);
//            i++;
//        }


        //b. Do While

        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        // Solution
        // int i =2;
        //        do{
        //            i +=2;
        //            System.out.println("i = " + i);
        //        }while(i < 100);
        //Alter your loop to count backwards by 5's from 100 to -10.
        //Solution
//            int i = 100;
//            do{System.out.println("i = " + i);
//                i=i-5;
//            }while(i >= -10);
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        // 2
        // 4
        // 16
        // 256
        // 65536
        //Solution:
//        int i =2;
//        do{
//            System.out.println("i = " + i);
//              i=(int) Math.pow(i,2);
//        }while(i <= 1000000);

        //c Refactor the previous two exercises to use a for loop instead.
        //Solution:
//        for (int i =2; i<=1000000;){
//            System.out.println("i = " + i);
//            i=(int) Math.pow(i,2);
//        }
        //Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.
//        int i =1;
//       while(i<100) {
//
//           if (i % 3 == 0 && i % 5 == 0) {
//               System.out.println("FizzBuzz");
//           }  if (i % 5 == 0) {
//               System.out.println("Buzz");
//           }  if ( i % 3 == 0) {
//               System.out.println(" fizz");
//           }else{System.out.println(i);}
//           i++;
//       }
//        System.out.println(i);
        //Display a table of powers.
        //
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        //Example Output:What number would you like to go up to? 5
        //
        //Here is your table!
        //
        //number | squared | cubed
        //------ | ------- | -----
        //1      | 1       | 1
        //2      | 4       | 8
        //3      | 9       | 27
        //4      | 16      | 64
        //5      | 25      | 125
        //Solution:
//        Scanner sc= new Scanner(System.in);
//        System.out.println("What the number you want powered?");
//        int poweredNum = sc.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("-------|---------|------" );
//
//        for(int i =1; i<= poweredNum;i++){
//            int squared = i*i;
//            int cubed = i*i*i;
//            System.out.printf("%d | %d | %d \n", i,squared,cubed);
//        }

        //Convert given number grades into letter grades.
        //
        //Prompt the user for a numerical grade from 0 to 100.
        //Display the corresponding letter grade.
        //Prompt the user to continue.
        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        //Grade Ranges:
        //
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0
        //Solution
//        Scanner sc= new Scanner(System.in);
//        System.out.println("What was your grade?");
//        int userGrade = sc.nextInt();
//        System.out.println("Grade Ranges:");
//        for(int i =0; i < 1; i++){
//            if(userGrade <100 && userGrade > 88 ){
//                System.out.println("A: 100-88");
//            }else if(userGrade <87 && userGrade > 80 ){
//                System.out.println("B: 87-80");
//            }else if(userGrade <79 && userGrade > 67 ){
//                System.out.println("C: 79-67");
//            }else if(userGrade <66 && userGrade > 60 ){
//                System.out.println("D: 66-60");
//            }else if(userGrade <59){
//                System.out.println("F: 59-0");
//            }
//        }

    }
}