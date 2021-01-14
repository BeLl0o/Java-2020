public class Circle extends Geometric{
    double radius;
    public Circle(){}
    public Circle(double r){
        radius = r;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
    public String toString(){
        return "radius = " + radius + ",Area =" + getArea() + "Perimeter = "+ getPerimeter();
    }
}
