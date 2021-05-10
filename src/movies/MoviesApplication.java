package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication  {

    public static Movie[] addMovie(Movie[] movies, String choiceNewMovie){
        Scanner sc = new Scanner(System.in);
         choiceNewMovie = sc.next();
        Movie[] newMovie = Arrays.copyOf(movies,movies.length+1);
//        newMovie[newMovie.length-1] = choiceNewMovie;
        return newMovie;
    }
public static String userChoiceAddMovie(){
    Scanner sc = new Scanner(System.in);
   return sc.nextLine();
}


    public static void main(String[] args) {
        Movie[]  movies= MoviesArray.findAll();


        System.out.print("Enter something: ");

        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies " );
        System.out.println("2 - view movies in the animated category ");
        System.out.println("3 - view movies in the drama category ");
        System.out.println("4 - view movies in the horror category ");
        System.out.println("5 - view movies in the scifi category ");
        System.out.println();
        System.out.println("Enter your genre : ");


            Scanner sc = new Scanner(System.in);

            String choice = sc.next();
            for (Movie movie : movies) {
                if (choice.equals("0")) {
                    System.out.println("Thanks! Goodbye.");
                } else if (choice.equals("1")) {
                    System.out.println(movie.getName() + "-" + movie.getCategory());
                } else if (choice.equals("2") && movie.getCategory().equals("animated")) {
                    System.out.println(movie.getName());
                }else if (choice.equals("3") && movie.getCategory().equals("drama")) {
                    System.out.println(movie.getName() + "-" + movie.getCategory());
                } else if (choice.equals("4") && movie.getCategory().equals("horror")) {
                    System.out.println(movie.getName());
                }else if (choice.equals("5") && movie.getCategory().equals("scifi")) {
                    System.out.println(movie.getName());
                }
            }

            System.out.println("Would you like to add a movie? [Yes/No]");
            if(userChoiceAddMovie().equalsIgnoreCase("yes")){
                System.out.println("What movie would you like to add?");
        }
            addMovie(movies,choice);

    }
    }

