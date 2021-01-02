import java.lang.Math;
public class Triangle extends Geometric{
    public double side1;
    public double side2;
    public double side3;

    public Triangle(){}
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }
    public double getArea(){
        double p = (side1 + side2 + side3)/2;
        double q =  p * (p - side1) * (p - side2) * (p - side3);
        return Math.sqrt(q);
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    public boolean isTriangle(){
        if(side1 + side2 < side3||side1 + side3 < side2||side2 + side3 < side1){
            return false;
        }else{
            return true;
        }
    } 
    public String toString(){
        return  "IsaTriangle" + isTriangle() + "Perimeter" + getPerimeter() + "Area" + getArea(); 
    }
}


