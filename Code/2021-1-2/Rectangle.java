public class Rectangle extends Geometric{
    public double side1;
    public double side2;

    public Rectangle(){}
    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getArea(){
        return side1 * side2;
    }
    public double getPerimeter(){
        return (side1 + side2) * 2;
    }
    public String toString(){
        return "Area " + getArea() + "Perimeter " + getPerimeter();
    }
}
