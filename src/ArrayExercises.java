import java.util.Arrays;

public class ArrayExercises {



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));// need toString because the type is int not string can use .replace to take out the brackets in the array and the commas as well if you wish.

        Person kelvon = new Person("Kelvon");
        Person amirah = new Person("Amirah");
        Person todd = new Person("Todd");
        Person [] people = {kelvon,amirah,todd};


      for(Person person: people){
          System.out.println("My favorite people are " + person.getName() + " (:");
      }
    }
}