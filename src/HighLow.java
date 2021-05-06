import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        guessingGame();
    }

    public static void guessingGame() {
        int randomNum = (int) (Math.random() * 100 - 1 + 1) + 1;
        System.out.println("WELCOME TO THE HIGH-LOW GUESSING GAME!!!");
        Scanner sc = new Scanner(System.in);
//        System.out.print("Can you guess the random number?\n");
//        int userNum = sc.nextInt();
        int userGuesses =0;
        System.out.print("Can you guess the random number?\n");
        do {
            System.out.print("You have " + (10-userGuesses)+ " tries!");
            userGuesses++;
            int userNum1 = sc.nextInt();
            if (userNum1 < randomNum) {
                System.out.println("HIGHER");

            } else if (userNum1 > randomNum) {
                System.out.println("LOWER");
            } else if(userGuesses==10){
                System.out.println(" SORRY YOU LOST BECAUSE YOURE OUT OF GUESSES ");
                break;
            } else {
                System.out.println("DING DING DING WE HAVE A WINNER!!!\n You got the answer on guess number " + userGuesses);
                System.out.println("The number was " + randomNum);
                break;
            }

             }
        while (userGuesses < 10);
         if(userGuesses==10) {
             System.out.println(" SORRY YOU LOST BECAUSE YOU'RE OUT OF GUESSES ");
         }
    }
}