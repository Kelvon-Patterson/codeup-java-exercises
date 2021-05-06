package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        Measurable myShape;

         myShape = new Rectangle(4,8);
        System.out.println("myRectangle.getArea() = " + myShape.getArea());
        System.out.println("myRectangle.getPerimeter() = " + myShape.getPerimeter());


        myShape = new Square(4,4);
        System.out.println("mySquare.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("mySquare.getArea() = " + myShape.getArea());

// 9)
// The code will fail to compile when leaving off getPerimeter() because it will have no method to call to grab the perimeter therefore it wont have a value to compile.
        //10
        //i was not able to call getLength or getWidth on myShape probably becasuse it is being implemented in the interface Measurable.
    }
}
