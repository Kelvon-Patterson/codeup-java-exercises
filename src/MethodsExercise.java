import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {
        System.out.println(addNums(4, 6));
        System.out.println(subtractNums(4, 6));
        System.out.println(multiplyNums(4, 6));
        System.out.println(divideNums(24, 6));
        System.out.println(modulusNums(5, 100));
        System.out.println(multiplyNums2(10, 10));
//        System.out.println(getInteger(1, 10));
        calculateFactorialNum();
    }

    //Basic Arithmetic
    //
    //TODO:Create four separate methods. Each will perform an arithmeti coperation:
    //TODO: Each function needs to take two parameters/arguments so that the operation can be performed.    // TODO: Test your methods and verify the output.
    // Addition:
    public static int addNums(int num1, int num2) {
        return num1 + num2;
    }

    // Subtraction:
    public static int subtractNums(int num1, int num2) {
        return num1 - num2;
    }

    // Multiplication
    public static int multiplyNums(int num1, int num2) {
        return num1 * num2;
    }

    // Division
    public static int divideNums(int num1, int num2) {
        return num1 / num2;
    }

    //TODO:Add a modulus method that finds the modulus of two numbers.
    public static int modulusNums(int num1, int num2) {
        return num1 % num2;
    }
    // Food for thought: What happens if we try to divide by zero? What should happen?

    //Bonus
    //TODO Create your multiplication method without the * operator (Hint: a loop might be helpful).Do the above with recursion.
//Solution:
    public static int multiplyNums2(int num1, int num2) {
        int result = 0;
        for (int i = 0; i < num1; i++) {
            result += num2;
        }
        return result;
    }

//2
    //TODO Create a method that validates that user input is in a certain range

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Choose a number between 1 and 10");
//        int userInput = sc.nextInt();
//        if (userInput > min && userInput < max) {
//            System.out.println("Your number is in range!");
//        } else {
//            System.out.println("WOAH, you're out of range!!!");
//
//            System.out.println("Choose a number between 1 and 10");
//            sc.nextInt();
//        }
//        return userInput;
//    }

    //TODO:Calculate the factorial of a number.
//TODO:Prompt the user to enter an integer from 1 to 10.
//TODO:Display the factorial of the number entered by the user.
//TODO:Ask if the user wants to continue.
//TODO:Use a for loop to calculate the factorial.
//TODO:Assume that the user will enter an integer, but verify it’s between 1 and 10.
//TODO:Use the long type to store the factorial.
//TODO:Continue only if the user agrees to.
//TODO:A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:

    public static void calculateFactorialNum() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Input a number: ");
        int num1 = sc.nextInt();
        long  factorial = 1;
        String nextNum = "";
        for (int i=1; i<= num1; i++){

            if(i==1){
                nextNum= nextNum+i;
                System.out.printf("%d! = %s =%d\n",i,nextNum,factorial);
            }else{
                nextNum = nextNum + " x " + i;
                factorial = factorial*i;
                System.out.printf("%d ! = %s = %d\n",i,nextNum,factorial);
            }
        }

}

        public static void diceRoll(){
            Scanner sc = new Scanner(System.in);
        System.out.print("How many dice do you want to roll?");
       int  numDice= sc.nextInt();

        }

    }

