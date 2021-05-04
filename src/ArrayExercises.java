import java.util.Arrays;

public class ArrayExercises {

public static Person[] addPerson(Person[] people, Person person){
Person[] newPerson = Arrays.copyOf(people,people.length+1);
 newPerson[newPerson.length-1] = person;
 return newPerson;
}

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));// need toString because the type is int not string can use .replace to take out the brackets in the array and the commas as well if you wish.

        Person[] people = new Person[3];
        people[0] = new Person("Kelvon");
        people[1] = new Person("Amirah");
        people[2] = new Person("Todd");

for(int i = 0; i< people.length; i++){
    System.out.println( people[i].getName());
}
//enhanced for loop
//      for(Person person: people){
//          System.out.println("My favorite people are " + person.getName() + " (:");
//      }
//
        Person mikey = new Person("Mikey");
        addPerson(people,mikey);
        for(int i = 0; i< people.length+1; i++){
            System.out.println(addPerson(people,mikey)[i].getName());
        }
   }
}