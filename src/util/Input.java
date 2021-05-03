package util;

import java.util.Scanner;

public class Input {

        private final Scanner scanner = new Scanner(System.in);
        // public String name; //  Ex: of instance property

    public String getString(){
//        System.out.println("Enter a String here!");
        return scanner.nextLine();

    }
    public boolean yesNo(){
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
        do{
            getInt = scanner.nextInt();
            System.out.printf("Enter a number between %d and %d ",min,max);
            if(getInt <min || getInt >max){
            System.out.println("Sorry that's not in the range we asked...");
        }else if(getInt >min && getInt <max){
                System.out.println("Thank you! The number you entered is " + getInt);
                break;
            }

        }while(true);
return getInt;
    }
    
    public int getInt(String prompt){
        System.out.println(prompt);
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a double between %s and %s", min, max);
        double getDouble;
        do{
            getDouble = scanner.nextDouble();
            System.out.printf("Enter a number between %d and %d", min, max);
            double userInput = scanner.nextDouble();
            if(userInput <min || userInput > max){
                System.out.println("Sorry that number is not in the range of numbers we asked for...");
            }else if (userInput > min && userInput <max){
                System.out.println("Thanks ! The number in range you entered is " + getDouble);
                break;
            }
        }while(true);
        return getDouble;
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        return this.scanner.nextDouble();
    }



}
