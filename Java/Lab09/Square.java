//Thanyathon Kitsakun 6887101

public class Square extends Shape {
    double perimeter;

    public Square(String color, double perimeter){
        super(color);
        this.perimeter = perimeter;
    }

    public Square(){
        super();
    }

    public double getArea(){
        return perimeter * perimeter;
    }

    public double getArea(double perimeter){
        this.perimeter = perimeter;
        return perimeter * perimeter;
    }

    public String toString(){
        return "Square[perimeter=" + this.perimeter + ",Shape[color=" + getColor() + "]]";   
    }
}
