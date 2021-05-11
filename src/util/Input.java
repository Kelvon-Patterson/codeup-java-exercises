package util;

import java.util.Scanner;

public class Input {

        private final Scanner scanner = new Scanner(System.in);
        // public String name; //  Ex: of instance property

    public String getString(){
//        System.out.println("Enter a String here!");
        return scanner.nextLine();

    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String yesNo = scanner.nextLine();
        boolean isYesNo = false;
        if(yesNo.equalsIgnoreCase("Yes") ){
           isYesNo = true;
        }
        return isYesNo;
    }

    public  int getInt(int min, int max){
        System.out.printf("enter a number between %d and %d", min, max);
        int getInt;
        try {
            getInt = Integer.valueOf(getString());
            System.out.printf("Enter a number between %d and %d ",min,max);
            int userInput = Integer.valueOf(getString());
            if(userInput >min && userInput <max){
                System.out.println("Thank you! The number you entered is " + getInt);
            }else{
                return getInt;
            }


            return getInt;
        }catch (Exception e){
            System.out.println("Exception occurred!");
        }
        return getInt(1,10);
        }

    
    public int getInt(String prompt){
        System.out.println(prompt);
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a double between %s and %s", min, max);
        double getDouble;

        try {
            getDouble = Double.valueOf(getString());
            System.out.printf("Enter a number between %d and %d", min, max);
            double userInput = Double.valueOf(getString());
             if (userInput > min && userInput < max) {
                System.out.println("Thanks ! The number in range you entered is " + getDouble);
            }else{
                 return getDouble;
            }

        } catch(Exception e){
            System.out.println("Sorry There Was An Exeption!");
        }
     return getDouble(1,10);
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return this.scanner.nextDouble();
    }



}
