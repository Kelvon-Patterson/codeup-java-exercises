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

    public static void main(String[] args) {
        Input input= new Input();
        System.out.println("What is your name ?");
        System.out.println("Your name is "+ input.getString() + "!");

        System.out.println("Is true = true and false =false?");
        System.out.println(input.yesNo());

        System.out.println("Choose a number between 1 and 10 please.");
        System.out.println(input.getInt(1,10));
    }


}
