import java.util.Scanner;

public class Console_IO_Lecture {
    public static void main(String[] args) {
        System.out.println("Console IO Lecture");

        // ============================== print() VS println()

        // this:
//        System.out.println("here");
//        System.out.println("there");
//
//        // is equivalent to this:
//        System.out.print("here\n");
//        System.out.println("there\n");
//
//        // without the newline characters, print outputs this:
//        System.out.print("here");
//        System.out.println("there");
//
        // to concatenate, just like JS:
//        String firstName = "Douglas";
//        String lastName = "Hirsh";
//        System.out.println(firstName + " " + lastName);
//
//        // ============================== printf() / .format()
//
//        // Print a formatted string using the following... printf(formatString)
//
//        // same output as print():
//        System.out.print("Hello");
//        System.out.print("There");
//
//        // multiple variables:
//        System.out.printf("Hello, %s!\n", firstName);
//        System.out.printf("Hello, %s %s!\n", firstName, lastName);
//
//        // numbers:
//        int numberOfPets =  3;
//        String typeOfPets =  "cats";
//        System.out.printf("I have %d %s.\n", numberOfPets, typeOfPets);
//
//        // currency:
//        float currencyPennies = 1000.001F;
//        System.out.printf("My iPhone cost $%.3f\n", currencyPennies);
//        System.out.printf("My iPhone cost $%.2f", currencyPennies);
//        //======================================== USER INPUT
//        Scanner sc= new Scanner(System.in);
//        System.out.println("What is your first name?");
//         String userFirstName = sc.next();
//
//        System.out.printf("Nice to meet you, %s\n", userFirstName);
//
//        System.out.println("How old are you ? ");
//       int age=  sc.nextInt();
//        sc.nextLine();
//       System.out.printf("Good to hear you are %d years old\n ",age);
//
//       System.out.println("Favorite Quote: ");
//
//       String favoriteQuote = sc.nextLine();
//       System.out.printf("Funny, \"%s\" is my favorite quote too.",favoriteQuote);
        String name = "Kelvon";
        System.out.printf("Hello Mr. %s\n", name);

        String dogName = "Rambo";
        int dogYears = 4;

        System.out.printf("My dogs name is %s, he is my favorite and he is %d years old. \n", dogName, dogYears);

        String catName = "Loki";
        int catYears = 3;

        System.out.printf("My cats name is %s, he is my girlfriend's cat and he is %d years old", catName, catYears);
    }
}

