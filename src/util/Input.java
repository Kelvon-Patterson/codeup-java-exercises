package util;

import java.util.Scanner;

public class Input {

        private final Scanner scanner = new Scanner(System.in);
        // public String name; //  Ex: of instance property

    public String getString(){
//        System.out.println("Enter a String here!");
        return scanner.nextLine();

    }

    public static void main(String[] args) {
        Input input= new Input();
        System.out.println("What is your name ?");
        System.out.println("Your name is "+ input.getString() + "!");


    }
}
