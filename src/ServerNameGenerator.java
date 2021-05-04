public class ServerNameGenerator {
    public static String[] noun = {"Walt Disney", "Mount Kilimanjaro", "Minnesota", "Atlantic Ocean", "Australia", "Empire State Building", "Fluffy", "Sun Country", "Mount Everest", "State", "Wealth"};

   public static String[] adjectives = {"attractive", "bald", "beautiful", "chubby", "clean", "dazzling", "drab", "elegant", "fancy", "fit"};


    public static String randomElement(String[] word) {
        return word[(int) (Math.random() * (word.length - 1))];
    }

    public static void main(String[] args) {
        System.out.println("randomElement(noun) = " +randomElement(noun));
        System.out.println("randomElement(adjectives) = " + randomElement(adjectives));
    }

}