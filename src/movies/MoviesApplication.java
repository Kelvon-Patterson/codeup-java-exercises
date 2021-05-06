package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication  {
    Scanner sc = new Scanner(System.in);
    String choice = sc.next();
    public static Movie[] addMovie(Movie[] movies, Movie choice){ Movie[] newMovie = Arrays.copyOf(movies,movies.length+1);
        newMovie[newMovie.length-1] = choice;
        return newMovie;
    }
public static void userChoiceAddMovie(){
    Scanner sc = new Scanner(System.in);
    String choice = sc.next();
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
            userChoiceAddMovie();
//            addMovie();


        }
    }

