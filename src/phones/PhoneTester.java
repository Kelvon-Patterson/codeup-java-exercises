package phones;

public class PhoneTester {
    public static void main(String[] args) {
        IPhone iPhoneX = new IPhone("X",100,"AT&T","ABCDE");
        Galaxy s10 = new Galaxy("S10",98,"Verison","Skies");

        iPhoneX.displayInfo();
        s10.displayInfo();
    }
}
