public class StringExercise {
    public static void main(String[] args){
        eduString();
        cntrlString();
        checkString();
        windowString();
        backslashString();
    }
    public static void eduString(){
        String noedu= "We don't need no education";
        System.out.println(noedu);
    }
    public static void cntrlString(){
        String control= "We don't need no thought control";
        System.out.println(control);
    }

    public static void checkString(){
        String check= "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(check);
    }

    public static void windowString() {
        String window = "In windows, the main drive is usually C:\\";
        System.out.println(window);
    }

    public static void backslashString() {
        String backslash = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(backslash);
    }
}
