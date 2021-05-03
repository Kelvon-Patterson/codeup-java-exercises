package shapes;

import java.util.Scanner;

import util.Input;

public class CircleApp {
    boolean anotherCircle;
    Input userInput = new Input();

    do{
        double userRadius = userInput.getDouble("Please give a radius!");
        Circle currentCircle = new Circle(userRadius);
        System.out.printf("The area of your circle is : %.2f", currentCircle);
    }


}
