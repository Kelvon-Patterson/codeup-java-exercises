import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
bobSays();
    }

    public static void bobSays(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Start a conversation with Bob!");
        String userInput = sc.next();

        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Woah dude, chill out!");
        } else if (userInput.equals(" ")) {
            System.out.println("Fine, Be that way!");
        }else{
            System.out.println("Whatever");
        }
    }
}
