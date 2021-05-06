package shapes;

public class Square extends Quadrilateral {


    public Square(int length, int width) {
        super(length, width);
    }


   public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public  int getArea(){
        return width*length;
    }
    public int getPerimeter(){
        return width*4;
    }


}
