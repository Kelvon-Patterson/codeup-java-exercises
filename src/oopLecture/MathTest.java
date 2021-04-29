package oopLecture;
//YOU CAN LINK THE PACKAGES TOGETHER TO USE THEM IN OTHER CLASSES
import static oopLecture.Arithmetic.pi;
//USING THE ARITHMETIC CLASS IN OUT MATH TEST CLASS.
public class MathTest {
    public static void main(String[] args){
        System.out.println("Arithmetic.pi = " + pi);

        int x = 10;
        int y = 5;

        System.out.println("Arithmetic.add(x,y) = " + Arithmetic.add(x, y));

        System.out.println("Arithmetic.multiply(x,y) = " + Arithmetic.multiply(x, y));
    }
}
