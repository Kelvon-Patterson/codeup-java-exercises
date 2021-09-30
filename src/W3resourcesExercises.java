import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W3resourcesExercises {



        public static void main(String[] args){

                //TODO:Write a Java program to create a new array list, add some elements (string) and print out the collection.
                List<String> colors = new ArrayList<>();
                colors.add("Red");
                colors.add("Blue");
                colors.add("Yellow");
                colors.add("Green");
                System.out.println(colors);
                System.out.println("-------");
                //TODO:Write a Java program to iterate through all elements in a array list.

                List<String> elements = new ArrayList<>();
                elements.add("Car");
                elements.add("Truck");
                elements.add("Bus");
                elements.add("Boat");
                for(String element: elements){
                        System.out.println(element);
                }
                System.out.println("-------");
                //TODO:Write a Java program to insert an element into the array list at the first position.
                elements.add(0,"Airplane"); // Adding element into array at 0 index
                elements.add("Helicopter");// Adding another element at last position.
                for(String element: elements){
                        System.out.println(element);
                }
                System.out.println("-------");
                //TODO:Write a Java program to retrieve an element (at a specified index) from a given array list.
                System.out.println(elements.get(0)); // "getting" the first element from the array.
                System.out.println("-------");

                //TODO:Write a Java program to update specific array element by given element.
                System.out.println(elements.set(0,"Blimp")); // updating element setting it to said string
                System.out.println(elements.get(0)); // calling element after change is made
                System.out.println("-------");

                //TODO:Write a Java program to remove the third element from a array list.
                System.out.println( "element removed = " +elements.remove(2)); // removing the third item in array list
                System.out.println("-------");
                for (String element : elements) {
                        System.out.println(element); // loop through element to show that the third item is removed
                }
                System.out.println("-------");




    }
}
