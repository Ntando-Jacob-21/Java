public class Rectangle {
//    Fields
    private int length;
    private int width;

//    Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

//    Getter
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

//    Setter
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

//    Area method
    public int area() {
        return length * width;
    }

//    Display method
    public void displayInfo() {
        System.out.println("Area of the rectangle is " + area());
    }




}