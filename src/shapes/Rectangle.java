package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(int length, int width) {
        super(length, width);
    }


    public void setLength(int length) {

    }


    public void setWidth(int width) {

    }

    public int getPerimeter(){

        return (length*2) + (width*2);
    }

    public int getArea(){
        return width* length;
    }
}

