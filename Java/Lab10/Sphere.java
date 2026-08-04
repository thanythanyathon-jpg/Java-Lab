//Name: Thanyathon Kitsakun
//ID: 6887101
//Section: 1

public class Sphere extends Object3D{

    private double radius;

    public Sphere(String _name, Material _matType, double _radius){
        super(_name, _matType);
        this.radius = _radius;
    }

    public double getEdge(){
        return this.radius;
    }

    public double getVolume(){  
        return (4 / 3) * PI * (radius * radius * radius);
    }

    public double getSurface(){
        return 4 * PI * (radius * radius * radius);
    }
    
}
