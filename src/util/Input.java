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
        int getInt;
        do{
            getInt = scanner.nextInt();
            System.out.println("Enter a number between 1 and 10 ");
            if(getInt <1 || getInt >10){
            System.out.println("Sorry that's not in the range we asked...");
        }else if(getInt >1 && getInt <10){
                System.out.println("Thank you! The number you entered is " + getInt);
                break;
            }

        }while(true);
return getInt;
    }
    
    public int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        double getDouble;
        do{
            getDouble = scanner.nextDouble();
            System.out.println("Enter a number between 1.5 and 20.67");
            if(getDouble <1.5 || getDouble > 20.67){
                System.out.println("Sorry that number is not in the range of numbers we asked for...");
            }else if (getDouble > 1.5 && getDouble <20.67){
                System.out.println("Thanks ! The number in range you entered is " + getDouble);
                break;
            }
        }while(true);
        return getDouble;
    }
    public double getDouble(){
        return scanner.nextDouble();
    }



}
