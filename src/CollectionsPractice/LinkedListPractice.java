package CollectionsPractice;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        //TODO: Write a Java program to append the specified element to the end of a linked list.

        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();

        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        // print the list
        System.out.println("The linked list: " + l_list);
        System.out.println("---------");

        //TODO:Write a Java program to iterate through all elements in a linked list.
        //loop through linked list with enhanced for loop
        for(String ele: l_list){
            System.out.println(ele);
        }

        //TODO:Write a Java program to iterate through all elements in a linked list starting at the specified position.

    }
}
