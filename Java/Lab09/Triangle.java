//Thanyathon Kitsakun 6887101

public class Triangle extends Shape{
    double base, height, area;

    public Triangle(String color, double base, double height){
        super(color);
        this.base =  base;
        this.height = height;
    }

    public Triangle(){
        super();
    }

    public double getArea(){
        return area = 0.5 * base * height;
    }

    public double getArea(double base, double height){
        this.base = base;
        this.height = height;
        return area = 0.5 * base * height;
    }

    public String toString(){
        return "Triangle[length=" + this.base + ", width=" + this.height + ",Shape[color=" + getColor() + "]]";   
    }
}