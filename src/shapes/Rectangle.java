package shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(){
        this.length =0;
        this.width = 0;
    }
    public Rectangle(int length,int width){

    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth() {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public int getPerimeter(int length,int width){
        return (length*2) + (width*2);
    }
    public int getArea(int length,int width){
        return length*width;
    }

}
