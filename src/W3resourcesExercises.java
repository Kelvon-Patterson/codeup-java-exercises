import java.util.*;

public class W3resourcesExercises {



        public static void main(String[] args){

                //TODO: JAVA COLLECTION : ARRAYLIST EXERCISES

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

                //TODO: Write a Java program to search an element in an array list.
                System.out.println("index of Car element= " +elements.indexOf("Car")); // return index of Car element;
                System.out.println("-------");
                System.out.println("does the array list contain Car object? = " + elements.contains("Car")); // returns true if arrayList contains the object
                System.out.println("-------");

                //TODO: Write a Java program to sort a given array list.
                System.out.println("Unsorted list");
                for(String element: elements){
                        System.out.println(element);
                }
                System.out.println("-------");
                System.out.println("Unsorted list");
                Collections.sort(elements); //sort statement passing the array list as an argument
                for(String element: elements){
                 System.out.println(element);
                }
                System.out.println("-------");

                //TODO: Write a Java program to copy one array list into another.
                List<String> List1 = new ArrayList<String>();
                List1.add("1");
                List1.add("2");
                List1.add("3");
                List1.add("4");
                System.out.println("List1: " + List1);
                System.out.println("-------");
                List<String> List2 = new ArrayList<String>();
                List2.add("A");
                List2.add("B");
                List2.add("C");
                List2.add("D");
                System.out.println("List2: " + List2);

                Collections.copy(List1, List2); // Copy List2 to List1 list your copying to must have same or more elements then list being copied from.
                System.out.println("Copy List to List2,\nAfter copy:");
                System.out.println("List1: " + List1);
                System.out.println("List2: " + List2);
                System.out.println("-------");

                //TODO: Write a Java program to shuffle elements in a array list.
                System.out.println("unshuffled="+ elements);
                Collections.shuffle(elements); // use collections class to shuffle elements
                System.out.println("shuffled elements =" + elements);

                //TODO:Write a Java program to reverse elements in a array list.
                System.out.println("before reverse" + elements);
                Collections.reverse(elements);
                System.out.println("reversed elements=" + elements);

                //TODO:Write a Java program to extract a portion of a array list.
                System.out.println("before extraction" +elements);
                List<String> subList = elements.subList(0,2);
                System.out.println("first two of elements array list =  " + subList     );

                //TODO:Write a Java program to compare two array lists.
                System.out.println("does element have same objects as colors?=" +elements.contains(colors));
                System.out.println(".contains?" +elements);
                System.out.println("-------");
                // here we can use the contains method to compare
                System.out.println("does element have same objects as colors?=" + elements.equals(colors));
                System.out.println(".equals?" +elements);
                System.out.println("-------");
                //here we can use the .equals method to compare
//                System.out.println("does element have same objects as colors?=" + elements.removeAll(colors));
//                System.out.println(".removeAll?" +elements);
//                System.out.println("-------");
                // here we can use the .removeAll method to compare
                // returns empty list if all the elements of first list match with elements of second list
//                System.out.println("does element have same objects as colors?=" + elements.retainAll(colors));
//                System.out.println(".retainAll?" +elements);
//                System.out.println("-------");
                //here we can use the .retainAll method to compare This method accepts a Collection as a parameter that contains elements to be retained in the list. It returns true if this list changed as a result of the call.
                System.out.println("does element have same objects as colors?=" + elements.toString().equals(colors.toString()));
                System.out.println(".toString? .equals?" +elements);
                System.out.println("-------");
                // here we put the array list .toString then compare them using the .equals string method.

                //TODO:Write a Java program of swap two elements in an array list.
                System.out.println("before swap=" + elements);
                Collections.swap(elements, 0,4); // we use the collections method swap to switch methods around
                System.out.println("After swap =" + elements);
                System.out.println("-------");

                //TODO:Write a Java program to join two array lists.
                //create new array list
                List <String> colorsAndElements = new ArrayList<>(); //create new array list
//                colorsAndElements.addAll(colors); //add colors array list
//                colorsAndElements.addAll(elements); //add elements array list
//                System.out.println(colorsAndElements); // print out to show results of colorsAndElements array list
                System.out.println("-------");

                //TODO: Write a Java program to clone an array list to another.
                ArrayList<String> colors1 = new ArrayList<>();
                colors1.add("Red");
                colors1.add("Black");
                colors1.add("Green");
                colors1.add("Pink");
                colors1.add("Yellow");
                System.out.println("original array list colors1 = " + colors1);
                System.out.println("-------");
                ArrayList<String> newColor1 = (ArrayList<String>) colors1.clone();
                System.out.println("Cloned colors1 array list= " + newColor1);





        }
}
