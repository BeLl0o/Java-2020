abstract class Geometric{
    public boolean color;
    public boolean filled;

    public Geometric(){}
    public Geometric(boolean color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();  

}