package shapes;

public class Square extends Rectangle {

    public  Square(int side){
        super(side,side);



    }
    public  static int getArea(int side){
        return side ^ 2;

    }
    public  static int getPerimeter(int side){
        return side * 4;
    }
}
