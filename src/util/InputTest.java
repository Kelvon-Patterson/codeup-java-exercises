package util;

public class InputTest {
    public static void main(String[] args) {
        Input input= new Input();
//        System.out.println("What is your name ?");
//        System.out.println("Your name is "+ input.getString() + "!");
//
//
//        System.out.println(input.yesNo("Is true = true and false =false?"));

        System.out.println("Choose a number between 1 and 10 please.");
        System.out.println(input.getInt(1,10));


        System.out.println("input.getInt() = " + input.getInt("Pick any integer!"));


        System.out.println( input.getDouble(1.5,20.67));

        System.out.println();
        System.out.println("input.getDouble() = " + input.getDouble("Pick any number with a decimal!!"));
    }


}


