//Thanyathon Kitsakun 6887101

public class Rectangle extends Shape {
    double length, width, area;

    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        super();
    }

    public double getArea(){
        return area = length * width;
    }

    public double getArea(double length, double width){
        this.length = length;
        this.width = width;
        return area = length * width;
    }

    public String toString(){
        return "Rectangle[length=" + this.length + ", width=" + this.width + ",Shape[color=" + getColor() + "]]";   
    }
}
